package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface FloatPred {

  boolean test(float value);

  default FloatPred andThen(BooleanPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.test(x));
  }

  default FloatToByteFunc andThen(BooleanToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.test(x));
  }

  default FloatToCharFunc andThen(BooleanToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.test(x));
  }

  default FloatToDoubleFunc andThen(BooleanToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.test(x));
  }

  default FloatUnaryOp andThen(BooleanToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.test(x));
  }

  default FloatToIntFunc andThen(BooleanToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.test(x));
  }

  default FloatToLongFunc andThen(BooleanToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.test(x));
  }

  default FloatToShortFunc andThen(BooleanToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.test(x));
  }

  default <V> FloatFunc<V> andThen(BooleanFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.test(x));
  }

  default BooleanPred compose(BooleanToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsFloat(x));
  }

  default BytePred compose(ByteToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsFloat(x));
  }

  default CharPred compose(CharToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsFloat(x));
  }

  default DoublePred compose(DoubleToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsFloat(x));
  }

  default FloatPred compose(FloatUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsFloat(x));
  }

  default IntPred compose(IntToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsFloat(x));
  }

  default LongPred compose(LongToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsFloat(x));
  }

  default ShortPred compose(ShortToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsFloat(x));
  }

  default <V> Pred<V> compose(ToFloatFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsFloat(x));
  }
}
