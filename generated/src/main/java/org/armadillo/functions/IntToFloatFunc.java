package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface IntToFloatFunc {

  float applyAsFloat(int value);

  default IntPred andThen(FloatPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsFloat(x));
  }

  default IntToByteFunc andThen(FloatToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsFloat(x));
  }

  default IntToCharFunc andThen(FloatToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsFloat(x));
  }

  default IntToDoubleFunc andThen(FloatToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsFloat(x));
  }

  default IntToFloatFunc andThen(FloatUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsFloat(x));
  }

  default IntUnaryOp andThen(FloatToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsFloat(x));
  }

  default IntToLongFunc andThen(FloatToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsFloat(x));
  }

  default IntToShortFunc andThen(FloatToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsFloat(x));
  }

  default <V> IntFunc<V> andThen(FloatFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsFloat(x));
  }

  default BooleanToFloatFunc compose(BooleanToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsInt(x));
  }

  default ByteToFloatFunc compose(ByteToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsInt(x));
  }

  default CharToFloatFunc compose(CharToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsInt(x));
  }

  default DoubleToFloatFunc compose(DoubleToIntFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsInt(x));
  }

  default FloatUnaryOp compose(FloatToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsInt(x));
  }

  default IntToFloatFunc compose(IntUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsInt(x));
  }

  default LongToFloatFunc compose(LongToIntFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsInt(x));
  }

  default ShortToFloatFunc compose(ShortToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsInt(x));
  }

  default <V> ToFloatFunc<V> compose(ToIntFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsInt(x));
  }
}
