package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ByteToFloatFunc {

  float applyAsFloat(byte value);

  default BytePred andThen(FloatPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsFloat(x));
  }

  default ByteUnaryOp andThen(FloatToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsFloat(x));
  }

  default ByteToCharFunc andThen(FloatToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsFloat(x));
  }

  default ByteToDoubleFunc andThen(FloatToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsFloat(x));
  }

  default ByteToFloatFunc andThen(FloatUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsFloat(x));
  }

  default ByteToIntFunc andThen(FloatToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsFloat(x));
  }

  default ByteToLongFunc andThen(FloatToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsFloat(x));
  }

  default ByteToShortFunc andThen(FloatToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsFloat(x));
  }

  default <V> ByteFunc<V> andThen(FloatFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsFloat(x));
  }

  default BooleanToFloatFunc compose(BooleanToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsByte(x));
  }

  default ByteToFloatFunc compose(ByteUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsByte(x));
  }

  default CharToFloatFunc compose(CharToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsByte(x));
  }

  default DoubleToFloatFunc compose(DoubleToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsByte(x));
  }

  default FloatUnaryOp compose(FloatToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsByte(x));
  }

  default IntToFloatFunc compose(IntToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsByte(x));
  }

  default LongToFloatFunc compose(LongToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsByte(x));
  }

  default ShortToFloatFunc compose(ShortToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsByte(x));
  }

  default <V> ToFloatFunc<V> compose(ToByteFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsByte(x));
  }
}
