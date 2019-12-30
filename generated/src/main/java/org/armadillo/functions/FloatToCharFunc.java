package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface FloatToCharFunc {

  char applyAsChar(float value);

  default FloatPred andThen(CharPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsChar(x));
  }

  default FloatToByteFunc andThen(CharToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsChar(x));
  }

  default FloatToCharFunc andThen(CharUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsChar(x));
  }

  default FloatToDoubleFunc andThen(CharToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsChar(x));
  }

  default FloatUnaryOp andThen(CharToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsChar(x));
  }

  default FloatToIntFunc andThen(CharToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsChar(x));
  }

  default FloatToLongFunc andThen(CharToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsChar(x));
  }

  default FloatToShortFunc andThen(CharToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsChar(x));
  }

  default <V> FloatFunc<V> andThen(CharFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsChar(x));
  }

  default BooleanToCharFunc compose(BooleanToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsFloat(x));
  }

  default ByteToCharFunc compose(ByteToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsFloat(x));
  }

  default CharUnaryOp compose(CharToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsFloat(x));
  }

  default DoubleToCharFunc compose(DoubleToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsFloat(x));
  }

  default FloatToCharFunc compose(FloatUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsFloat(x));
  }

  default IntToCharFunc compose(IntToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsFloat(x));
  }

  default LongToCharFunc compose(LongToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsFloat(x));
  }

  default ShortToCharFunc compose(ShortToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsFloat(x));
  }

  default <V> ToCharFunc<V> compose(ToFloatFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsFloat(x));
  }
}
