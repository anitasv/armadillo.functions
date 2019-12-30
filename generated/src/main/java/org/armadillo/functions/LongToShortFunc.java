package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface LongToShortFunc {

  short applyAsShort(long value);

  default LongPred andThen(ShortPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsShort(x));
  }

  default LongToByteFunc andThen(ShortToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsShort(x));
  }

  default LongToCharFunc andThen(ShortToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsShort(x));
  }

  default LongToDoubleFunc andThen(ShortToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsShort(x));
  }

  default LongToFloatFunc andThen(ShortToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsShort(x));
  }

  default LongToIntFunc andThen(ShortToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsShort(x));
  }

  default LongUnaryOp andThen(ShortToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsShort(x));
  }

  default LongToShortFunc andThen(ShortUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsShort(x));
  }

  default <V> LongFunc<V> andThen(ShortFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsShort(x));
  }

  default BooleanToShortFunc compose(BooleanToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsLong(x));
  }

  default ByteToShortFunc compose(ByteToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsLong(x));
  }

  default CharToShortFunc compose(CharToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsLong(x));
  }

  default DoubleToShortFunc compose(DoubleToLongFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsLong(x));
  }

  default FloatToShortFunc compose(FloatToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsLong(x));
  }

  default IntToShortFunc compose(IntToLongFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsLong(x));
  }

  default LongToShortFunc compose(LongUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsLong(x));
  }

  default ShortUnaryOp compose(ShortToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsLong(x));
  }

  default <V> ToShortFunc<V> compose(ToLongFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsLong(x));
  }
}
