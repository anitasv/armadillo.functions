package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface LongToByteFunc {

  byte applyAsByte(long value);

  default LongPred andThen(BytePred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsByte(x));
  }

  default LongToByteFunc andThen(ByteUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsByte(x));
  }

  default LongToCharFunc andThen(ByteToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsByte(x));
  }

  default LongToDoubleFunc andThen(ByteToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsByte(x));
  }

  default LongToFloatFunc andThen(ByteToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsByte(x));
  }

  default LongToIntFunc andThen(ByteToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsByte(x));
  }

  default LongUnaryOp andThen(ByteToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsByte(x));
  }

  default LongToShortFunc andThen(ByteToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsByte(x));
  }

  default <V> LongFunc<V> andThen(ByteFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsByte(x));
  }

  default BooleanToByteFunc compose(BooleanToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsLong(x));
  }

  default ByteUnaryOp compose(ByteToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsLong(x));
  }

  default CharToByteFunc compose(CharToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsLong(x));
  }

  default DoubleToByteFunc compose(DoubleToLongFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsLong(x));
  }

  default FloatToByteFunc compose(FloatToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsLong(x));
  }

  default IntToByteFunc compose(IntToLongFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsLong(x));
  }

  default LongToByteFunc compose(LongUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsLong(x));
  }

  default ShortToByteFunc compose(ShortToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsLong(x));
  }

  default <V> ToByteFunc<V> compose(ToLongFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsLong(x));
  }
}
