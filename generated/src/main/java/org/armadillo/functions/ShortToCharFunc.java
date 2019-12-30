package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ShortToCharFunc {

  char applyAsChar(short value);

  default ShortPred andThen(CharPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsChar(x));
  }

  default ShortToByteFunc andThen(CharToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsChar(x));
  }

  default ShortToCharFunc andThen(CharUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsChar(x));
  }

  default ShortToDoubleFunc andThen(CharToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsChar(x));
  }

  default ShortToFloatFunc andThen(CharToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsChar(x));
  }

  default ShortToIntFunc andThen(CharToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsChar(x));
  }

  default ShortToLongFunc andThen(CharToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsChar(x));
  }

  default ShortUnaryOp andThen(CharToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsChar(x));
  }

  default <V> ShortFunc<V> andThen(CharFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsChar(x));
  }

  default BooleanToCharFunc compose(BooleanToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsShort(x));
  }

  default ByteToCharFunc compose(ByteToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsShort(x));
  }

  default CharUnaryOp compose(CharToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsShort(x));
  }

  default DoubleToCharFunc compose(DoubleToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsShort(x));
  }

  default FloatToCharFunc compose(FloatToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsShort(x));
  }

  default IntToCharFunc compose(IntToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsShort(x));
  }

  default LongToCharFunc compose(LongToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsShort(x));
  }

  default ShortToCharFunc compose(ShortUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsShort(x));
  }

  default <V> ToCharFunc<V> compose(ToShortFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsShort(x));
  }
}
