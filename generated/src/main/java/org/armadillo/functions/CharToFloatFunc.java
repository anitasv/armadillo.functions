package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface CharToFloatFunc {

  float applyAsFloat(char value);

  default CharPred andThen(FloatPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsFloat(x));
  }

  default CharToByteFunc andThen(FloatToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsFloat(x));
  }

  default CharUnaryOp andThen(FloatToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsFloat(x));
  }

  default CharToDoubleFunc andThen(FloatToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsFloat(x));
  }

  default CharToFloatFunc andThen(FloatUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsFloat(x));
  }

  default CharToIntFunc andThen(FloatToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsFloat(x));
  }

  default CharToLongFunc andThen(FloatToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsFloat(x));
  }

  default CharToShortFunc andThen(FloatToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsFloat(x));
  }

  default <V> CharFunc<V> andThen(FloatFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsFloat(x));
  }

  default BooleanToFloatFunc compose(BooleanToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsChar(x));
  }

  default ByteToFloatFunc compose(ByteToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsChar(x));
  }

  default CharToFloatFunc compose(CharUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsChar(x));
  }

  default DoubleToFloatFunc compose(DoubleToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsChar(x));
  }

  default FloatUnaryOp compose(FloatToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsChar(x));
  }

  default IntToFloatFunc compose(IntToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsChar(x));
  }

  default LongToFloatFunc compose(LongToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsChar(x));
  }

  default ShortToFloatFunc compose(ShortToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsChar(x));
  }

  default <V> ToFloatFunc<V> compose(ToCharFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsChar(x));
  }
}
