package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface CharUnaryOp {

  char applyAsChar(char value);

  default CharPred andThen(CharPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsChar(x));
  }

  default CharToByteFunc andThen(CharToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsChar(x));
  }

  default CharUnaryOp andThen(CharUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsChar(x));
  }

  default CharToDoubleFunc andThen(CharToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsChar(x));
  }

  default CharToFloatFunc andThen(CharToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsChar(x));
  }

  default CharToIntFunc andThen(CharToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsChar(x));
  }

  default CharToLongFunc andThen(CharToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsChar(x));
  }

  default CharToShortFunc andThen(CharToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsChar(x));
  }

  default <V> CharFunc<V> andThen(CharFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsChar(x));
  }

  default BooleanToCharFunc compose(BooleanToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsChar(x));
  }

  default ByteToCharFunc compose(ByteToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsChar(x));
  }

  default CharUnaryOp compose(CharUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsChar(x));
  }

  default DoubleToCharFunc compose(DoubleToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsChar(x));
  }

  default FloatToCharFunc compose(FloatToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsChar(x));
  }

  default IntToCharFunc compose(IntToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsChar(x));
  }

  default LongToCharFunc compose(LongToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsChar(x));
  }

  default ShortToCharFunc compose(ShortToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsChar(x));
  }

  default <V> ToCharFunc<V> compose(ToCharFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsChar(x));
  }
  static CharUnaryOp identity() { return x -> x; }; 
}
