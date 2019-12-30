package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ByteToLongFunc {

  long applyAsLong(byte value);

  default BytePred andThen(LongPredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsLong(x));
  }

  default ByteUnaryOp andThen(LongToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsLong(x));
  }

  default ByteToCharFunc andThen(LongToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsLong(x));
  }

  default ByteToDoubleFunc andThen(LongToDoubleFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsLong(x));
  }

  default ByteToFloatFunc andThen(LongToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsLong(x));
  }

  default ByteToIntFunc andThen(LongToIntFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsLong(x));
  }

  default ByteToLongFunc andThen(LongUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsLong(x));
  }

  default ByteToShortFunc andThen(LongToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsLong(x));
  }

  default <V> ByteFunc<V> andThen(LongFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsLong(x));
  }

  default BooleanToLongFunc compose(BooleanToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsByte(x));
  }

  default ByteToLongFunc compose(ByteUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsByte(x));
  }

  default CharToLongFunc compose(CharToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsByte(x));
  }

  default DoubleToLongFunc compose(DoubleToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsByte(x));
  }

  default FloatToLongFunc compose(FloatToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsByte(x));
  }

  default IntToLongFunc compose(IntToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsByte(x));
  }

  default LongUnaryOp compose(LongToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsByte(x));
  }

  default ShortToLongFunc compose(ShortToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsByte(x));
  }

  default <V> ToLongFunc<V> compose(ToByteFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsByte(x));
  }
}
