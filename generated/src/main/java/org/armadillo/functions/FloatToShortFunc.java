package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface FloatToShortFunc {

  short applyAsShort(float value);

  default FloatPred andThen(ShortPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsShort(x));
  }

  default FloatToByteFunc andThen(ShortToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsShort(x));
  }

  default FloatToCharFunc andThen(ShortToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsShort(x));
  }

  default FloatToDoubleFunc andThen(ShortToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsShort(x));
  }

  default FloatUnaryOp andThen(ShortToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsShort(x));
  }

  default FloatToIntFunc andThen(ShortToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsShort(x));
  }

  default FloatToLongFunc andThen(ShortToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsShort(x));
  }

  default FloatToShortFunc andThen(ShortUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsShort(x));
  }

  default <V> FloatFunc<V> andThen(ShortFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsShort(x));
  }

  default BooleanToShortFunc compose(BooleanToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsFloat(x));
  }

  default ByteToShortFunc compose(ByteToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsFloat(x));
  }

  default CharToShortFunc compose(CharToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsFloat(x));
  }

  default DoubleToShortFunc compose(DoubleToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsFloat(x));
  }

  default FloatToShortFunc compose(FloatUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsFloat(x));
  }

  default IntToShortFunc compose(IntToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsFloat(x));
  }

  default LongToShortFunc compose(LongToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsFloat(x));
  }

  default ShortUnaryOp compose(ShortToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsFloat(x));
  }

  default <V> ToShortFunc<V> compose(ToFloatFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsFloat(x));
  }
}
