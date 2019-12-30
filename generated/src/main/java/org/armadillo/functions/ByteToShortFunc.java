package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ByteToShortFunc {

  short applyAsShort(byte value);

  default BytePred andThen(ShortPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsShort(x));
  }

  default ByteUnaryOp andThen(ShortToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsShort(x));
  }

  default ByteToCharFunc andThen(ShortToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsShort(x));
  }

  default ByteToDoubleFunc andThen(ShortToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsShort(x));
  }

  default ByteToFloatFunc andThen(ShortToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsShort(x));
  }

  default ByteToIntFunc andThen(ShortToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsShort(x));
  }

  default ByteToLongFunc andThen(ShortToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsShort(x));
  }

  default ByteToShortFunc andThen(ShortUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsShort(x));
  }

  default <V> ByteFunc<V> andThen(ShortFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsShort(x));
  }

  default BooleanToShortFunc compose(BooleanToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsByte(x));
  }

  default ByteToShortFunc compose(ByteUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsByte(x));
  }

  default CharToShortFunc compose(CharToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsByte(x));
  }

  default DoubleToShortFunc compose(DoubleToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsByte(x));
  }

  default FloatToShortFunc compose(FloatToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsByte(x));
  }

  default IntToShortFunc compose(IntToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsByte(x));
  }

  default LongToShortFunc compose(LongToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsByte(x));
  }

  default ShortUnaryOp compose(ShortToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsByte(x));
  }

  default <V> ToShortFunc<V> compose(ToByteFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsByte(x));
  }
}
