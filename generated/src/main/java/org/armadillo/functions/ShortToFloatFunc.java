package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ShortToFloatFunc {

  float applyAsFloat(short value);

  default ShortPred andThen(FloatPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsFloat(x));
  }

  default ShortToByteFunc andThen(FloatToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsFloat(x));
  }

  default ShortToCharFunc andThen(FloatToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsFloat(x));
  }

  default ShortToDoubleFunc andThen(FloatToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsFloat(x));
  }

  default ShortToFloatFunc andThen(FloatUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsFloat(x));
  }

  default ShortToIntFunc andThen(FloatToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsFloat(x));
  }

  default ShortToLongFunc andThen(FloatToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsFloat(x));
  }

  default ShortUnaryOp andThen(FloatToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsFloat(x));
  }

  default <V> ShortFunc<V> andThen(FloatFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsFloat(x));
  }

  default BooleanToFloatFunc compose(BooleanToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsShort(x));
  }

  default ByteToFloatFunc compose(ByteToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsShort(x));
  }

  default CharToFloatFunc compose(CharToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsShort(x));
  }

  default DoubleToFloatFunc compose(DoubleToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsShort(x));
  }

  default FloatUnaryOp compose(FloatToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsShort(x));
  }

  default IntToFloatFunc compose(IntToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsShort(x));
  }

  default LongToFloatFunc compose(LongToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsShort(x));
  }

  default ShortToFloatFunc compose(ShortUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsShort(x));
  }

  default <V> ToFloatFunc<V> compose(ToShortFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsShort(x));
  }
}
