package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ShortToByteFunc {

  byte applyAsByte(short value);

  default ShortPred andThen(BytePred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsByte(x));
  }

  default ShortToByteFunc andThen(ByteUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsByte(x));
  }

  default ShortToCharFunc andThen(ByteToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsByte(x));
  }

  default ShortToDoubleFunc andThen(ByteToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsByte(x));
  }

  default ShortToFloatFunc andThen(ByteToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsByte(x));
  }

  default ShortToIntFunc andThen(ByteToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsByte(x));
  }

  default ShortToLongFunc andThen(ByteToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsByte(x));
  }

  default ShortUnaryOp andThen(ByteToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsByte(x));
  }

  default <V> ShortFunc<V> andThen(ByteFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsByte(x));
  }

  default BooleanToByteFunc compose(BooleanToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsShort(x));
  }

  default ByteUnaryOp compose(ByteToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsShort(x));
  }

  default CharToByteFunc compose(CharToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsShort(x));
  }

  default DoubleToByteFunc compose(DoubleToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsShort(x));
  }

  default FloatToByteFunc compose(FloatToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsShort(x));
  }

  default IntToByteFunc compose(IntToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsShort(x));
  }

  default LongToByteFunc compose(LongToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsShort(x));
  }

  default ShortToByteFunc compose(ShortUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsShort(x));
  }

  default <V> ToByteFunc<V> compose(ToShortFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsShort(x));
  }
}
