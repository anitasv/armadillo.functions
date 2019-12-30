package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ByteToCharFunc {

  char applyAsChar(byte value);

  default BytePred andThen(CharPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsChar(x));
  }

  default ByteUnaryOp andThen(CharToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsChar(x));
  }

  default ByteToCharFunc andThen(CharUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsChar(x));
  }

  default ByteToDoubleFunc andThen(CharToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsChar(x));
  }

  default ByteToFloatFunc andThen(CharToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsChar(x));
  }

  default ByteToIntFunc andThen(CharToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsChar(x));
  }

  default ByteToLongFunc andThen(CharToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsChar(x));
  }

  default ByteToShortFunc andThen(CharToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsChar(x));
  }

  default <V> ByteFunc<V> andThen(CharFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsChar(x));
  }

  default BooleanToCharFunc compose(BooleanToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsByte(x));
  }

  default ByteToCharFunc compose(ByteUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsByte(x));
  }

  default CharUnaryOp compose(CharToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsByte(x));
  }

  default DoubleToCharFunc compose(DoubleToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsByte(x));
  }

  default FloatToCharFunc compose(FloatToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsByte(x));
  }

  default IntToCharFunc compose(IntToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsByte(x));
  }

  default LongToCharFunc compose(LongToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsByte(x));
  }

  default ShortToCharFunc compose(ShortToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsByte(x));
  }

  default <V> ToCharFunc<V> compose(ToByteFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsByte(x));
  }
}
