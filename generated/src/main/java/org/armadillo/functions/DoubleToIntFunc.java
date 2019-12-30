package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface DoubleToIntFunc extends DoubleToIntFunction {


  default DoublePred andThen(IntPredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsInt(x));
  }

  default DoubleToByteFunc andThen(IntToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsInt(x));
  }

  default DoubleToCharFunc andThen(IntToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsInt(x));
  }

  default DoubleUnaryOp andThen(IntToDoubleFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsInt(x));
  }

  default DoubleToFloatFunc andThen(IntToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsInt(x));
  }

  default DoubleToIntFunc andThen(IntUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsInt(x));
  }

  default DoubleToLongFunc andThen(IntToLongFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsInt(x));
  }

  default DoubleToShortFunc andThen(IntToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsInt(x));
  }

  default <V> DoubleFunc<V> andThen(IntFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsInt(x));
  }

  default BooleanToIntFunc compose(BooleanToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsDouble(x));
  }

  default ByteToIntFunc compose(ByteToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsDouble(x));
  }

  default CharToIntFunc compose(CharToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsDouble(x));
  }

  default DoubleToIntFunc compose(DoubleUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsDouble(x));
  }

  default FloatToIntFunc compose(FloatToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsDouble(x));
  }

  default IntUnaryOp compose(IntToDoubleFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsDouble(x));
  }

  default LongToIntFunc compose(LongToDoubleFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsDouble(x));
  }

  default ShortToIntFunc compose(ShortToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsDouble(x));
  }

  default <V> ToIntFunc<V> compose(ToDoubleFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsDouble(x));
  }
}
