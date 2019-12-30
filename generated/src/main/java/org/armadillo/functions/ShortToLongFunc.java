package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ShortToLongFunc {

  long applyAsLong(short value);

  default ShortPred andThen(LongPredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsLong(x));
  }

  default ShortToByteFunc andThen(LongToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsLong(x));
  }

  default ShortToCharFunc andThen(LongToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsLong(x));
  }

  default ShortToDoubleFunc andThen(LongToDoubleFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsLong(x));
  }

  default ShortToFloatFunc andThen(LongToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsLong(x));
  }

  default ShortToIntFunc andThen(LongToIntFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsLong(x));
  }

  default ShortToLongFunc andThen(LongUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsLong(x));
  }

  default ShortUnaryOp andThen(LongToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsLong(x));
  }

  default <V> ShortFunc<V> andThen(LongFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsLong(x));
  }

  default BooleanToLongFunc compose(BooleanToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsShort(x));
  }

  default ByteToLongFunc compose(ByteToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsShort(x));
  }

  default CharToLongFunc compose(CharToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsShort(x));
  }

  default DoubleToLongFunc compose(DoubleToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsShort(x));
  }

  default FloatToLongFunc compose(FloatToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsShort(x));
  }

  default IntToLongFunc compose(IntToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsShort(x));
  }

  default LongUnaryOp compose(LongToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsShort(x));
  }

  default ShortToLongFunc compose(ShortUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsShort(x));
  }

  default <V> ToLongFunc<V> compose(ToShortFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsShort(x));
  }
}
