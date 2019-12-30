package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface CharToShortFunc {

  short applyAsShort(char value);

  default CharPred andThen(ShortPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsShort(x));
  }

  default CharToByteFunc andThen(ShortToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsShort(x));
  }

  default CharUnaryOp andThen(ShortToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsShort(x));
  }

  default CharToDoubleFunc andThen(ShortToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsShort(x));
  }

  default CharToFloatFunc andThen(ShortToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsShort(x));
  }

  default CharToIntFunc andThen(ShortToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsShort(x));
  }

  default CharToLongFunc andThen(ShortToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsShort(x));
  }

  default CharToShortFunc andThen(ShortUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsShort(x));
  }

  default <V> CharFunc<V> andThen(ShortFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsShort(x));
  }

  default BooleanToShortFunc compose(BooleanToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsChar(x));
  }

  default ByteToShortFunc compose(ByteToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsChar(x));
  }

  default CharToShortFunc compose(CharUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsChar(x));
  }

  default DoubleToShortFunc compose(DoubleToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsChar(x));
  }

  default FloatToShortFunc compose(FloatToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsChar(x));
  }

  default IntToShortFunc compose(IntToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsChar(x));
  }

  default LongToShortFunc compose(LongToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsChar(x));
  }

  default ShortUnaryOp compose(ShortToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsChar(x));
  }

  default <V> ToShortFunc<V> compose(ToCharFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsChar(x));
  }
}
