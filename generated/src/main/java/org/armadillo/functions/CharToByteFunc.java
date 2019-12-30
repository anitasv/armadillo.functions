package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface CharToByteFunc {

  byte applyAsByte(char value);

  default CharPred andThen(BytePred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsByte(x));
  }

  default CharToByteFunc andThen(ByteUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsByte(x));
  }

  default CharUnaryOp andThen(ByteToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsByte(x));
  }

  default CharToDoubleFunc andThen(ByteToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsByte(x));
  }

  default CharToFloatFunc andThen(ByteToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsByte(x));
  }

  default CharToIntFunc andThen(ByteToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsByte(x));
  }

  default CharToLongFunc andThen(ByteToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsByte(x));
  }

  default CharToShortFunc andThen(ByteToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsByte(x));
  }

  default <V> CharFunc<V> andThen(ByteFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsByte(x));
  }

  default BooleanToByteFunc compose(BooleanToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsChar(x));
  }

  default ByteUnaryOp compose(ByteToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsChar(x));
  }

  default CharToByteFunc compose(CharUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsChar(x));
  }

  default DoubleToByteFunc compose(DoubleToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsChar(x));
  }

  default FloatToByteFunc compose(FloatToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsChar(x));
  }

  default IntToByteFunc compose(IntToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsChar(x));
  }

  default LongToByteFunc compose(LongToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsChar(x));
  }

  default ShortToByteFunc compose(ShortToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsChar(x));
  }

  default <V> ToByteFunc<V> compose(ToCharFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsChar(x));
  }
}
