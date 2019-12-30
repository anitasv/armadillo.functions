package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface FloatToByteFunc {

  byte applyAsByte(float value);

  default FloatPred andThen(BytePred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsByte(x));
  }

  default FloatToByteFunc andThen(ByteUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsByte(x));
  }

  default FloatToCharFunc andThen(ByteToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsByte(x));
  }

  default FloatToDoubleFunc andThen(ByteToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsByte(x));
  }

  default FloatUnaryOp andThen(ByteToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsByte(x));
  }

  default FloatToIntFunc andThen(ByteToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsByte(x));
  }

  default FloatToLongFunc andThen(ByteToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsByte(x));
  }

  default FloatToShortFunc andThen(ByteToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsByte(x));
  }

  default <V> FloatFunc<V> andThen(ByteFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsByte(x));
  }

  default BooleanToByteFunc compose(BooleanToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsFloat(x));
  }

  default ByteUnaryOp compose(ByteToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsFloat(x));
  }

  default CharToByteFunc compose(CharToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsFloat(x));
  }

  default DoubleToByteFunc compose(DoubleToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsFloat(x));
  }

  default FloatToByteFunc compose(FloatUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsFloat(x));
  }

  default IntToByteFunc compose(IntToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsFloat(x));
  }

  default LongToByteFunc compose(LongToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsFloat(x));
  }

  default ShortToByteFunc compose(ShortToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsFloat(x));
  }

  default <V> ToByteFunc<V> compose(ToFloatFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsFloat(x));
  }
}
