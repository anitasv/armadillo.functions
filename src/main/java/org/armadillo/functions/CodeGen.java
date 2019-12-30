package org.armadillo.functions;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class CodeGen implements Runnable {

    public static void main(String[] args) {
        new CodeGen().run();
    }

    private final Class<?>[] types = {
            Boolean.TYPE,
            Byte.TYPE,
            Character.TYPE,
            Double.TYPE,
            Float.TYPE,
            Integer.TYPE,
            Long.TYPE,
            Short.TYPE,
            Object.class /* everything else */
    };

    private CodeGen() {
    }

    private String typeName(Class<?> type, String defaultValue) {
        if (type.isPrimitive()) {
            return type.getSimpleName();
        } else {
            return defaultValue;
        }
    }

    private String methodName(Class<?> returnType) {
        if (returnType == Boolean.TYPE) {
            return "test";
        } else {
            return "apply" + classPart("As", returnType);
        }
    }

    private String classPart(String prefix, Class<?> type) {
        String name = type.getSimpleName();
        if (type.isPrimitive()) {
            return prefix + Character.toUpperCase(name.charAt(0)) + name.substring(1);
        } else {
            return "";
        }
    }

    // t -> r
    private String className(Class<?> t, Class<?> r, boolean java) {
        if (t == r) {
            if (r == Boolean.TYPE) {
                return classPart("", t) + "Pred" + (java ? "icate" : "");
            }
            if (t.isPrimitive()) {
                return classPart("", t) + "UnaryOp" + (java ? "erator" : "");
            } else {
                return "Func" + (java ? "tion" : "");
            }
        } else {
           if (r == Boolean.TYPE) {
               return classPart("", t) + "Pred" + (java ? "icate" : "");
           } else {
               return classPart("", t) + classPart("To", r) + "Func" + (java ? "tion" : "");
           }
        }
    }

    private String genericSignature(Class<?> t, Class<?> r, String T, String R, boolean input) {
        if (t.isPrimitive() && r.isPrimitive()) {
            return "";
        } else if (t.isPrimitive()) {
            return "<" + (input ? "? extends " : "") + R + ">";
        } else if (r.isPrimitive()) {
            return "<" + (input ? "? super " : "") + T + ">";
        } else {
            return "<" + (input ? "? super " : "") + T + "," + (input ? "? extends " : "") + R + ">";
        }
    }

    private boolean hasJavaEquiv(Class<?> t, Class<?> r) {
        String javaClassName = className(t, r, true);
        try {
            Class<?> javaClass = Class.forName("java.util.function." + javaClassName);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    private String classSignature(Class<?> t, Class<?> r, String T, String R, boolean input) {
        String className = className(t, r, false);

        if (input && hasJavaEquiv(t, r)) {
            className = className(t, r, true);
        }
        return className + genericSignature(t, r, T, R, input);
    }

    @Override
    public void run() {
        Path path = FileSystems.getDefault().getPath(
                "generated", "src", "main", "java", "org", "armadillo", "functions");

        File folder = path.toFile();
        folder.mkdirs();

        for (Class<?> t: types) {
            for (Class<?> r : types) {
                StringBuilder sourceCode = new StringBuilder();

                String thisMethodName = methodName(r);
                sourceCode.append("package org.armadillo.functions;\n\n");
                sourceCode.append("import java.util.Objects;\n");
                sourceCode.append("import java.util.function.*;\n\n");

                sourceCode.append("public interface ").append(classSignature(t, r, "T", "R", false));
                boolean hasJavaEquiv = false;
                if (hasJavaEquiv(t, r)) {
                    hasJavaEquiv = true;
                    String javaClassName = className(t, r, true);
                    String javaSign = genericSignature(t, r, "T", "R", false);
                    sourceCode.append(" extends ").append(javaClassName).append(javaSign);
                }

                sourceCode.append(" {\n\n");

                if (!hasJavaEquiv) {
                    sourceCode.append("  ").append(typeName(r, "R")).append(" ").append(thisMethodName)
                            .append("(").append(typeName(t, "T")).append(" value);\n");
                }

                for (Class<?> v : types) {
                    String functionGeneric = v.isPrimitive() ? "" : "<V> ";

                    sourceCode.append("\n  default ").append(functionGeneric)
                            .append(classSignature(t, v, "T", "V", false)).append(" ").append("andThen(")
                            .append(classSignature(r, v, "R", "V", true)).append(" after) {\n");

                    sourceCode.append("        Objects.requireNonNull(after);\n");
                    sourceCode.append("        return x -> after.").append(methodName(v))
                            .append("(this.").append(thisMethodName).append("(x));\n");
                    sourceCode.append("  }\n");
                }

                for (Class<?> v : types) {
                    String functionGeneric = v.isPrimitive() ? "" : "<V> ";

                    sourceCode.append("\n  default ").append(functionGeneric)
                            .append(classSignature(v, r,"V", "R", false)).append(" ").append("compose(")
                            .append(classSignature(v, t,"V", "T", true)).append(" before) {\n");

                    sourceCode.append("        Objects.requireNonNull(before);\n");
                    sourceCode.append("        return x -> this.").append(thisMethodName)
                            .append("(before.").append(methodName(t)).append("(x));\n");
                    sourceCode.append("  }\n");
                }


                if (t == r) {
                    // Identity possible
                    String functionGeneric = t.isPrimitive() ? "" : "<T> ";
                    sourceCode.append("  static ").append(functionGeneric)
                            .append(classSignature(t, t, "T", "T", false))
                            .append(" identity() { return x -> x; }; \n");
                }

                sourceCode.append("}\n");

                String fileName = className(t, r, false) + ".java";
                Path filePath = path.resolve(fileName);
                try {
                    Files.write(filePath, sourceCode.toString().getBytes(StandardCharsets.UTF_8));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
