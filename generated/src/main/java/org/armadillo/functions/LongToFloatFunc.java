package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface LongToFloatFunc {

  float applyAsFloat(long value);

  default LongPred andThen(FloatPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsFloat(x));
  }

  default LongToByteFunc andThen(FloatToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsFloat(x));
  }

  default LongToCharFunc andThen(FloatToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsFloat(x));
  }

  default LongToDoubleFunc andThen(FloatToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsFloat(x));
  }

  default LongToFloatFunc andThen(FloatUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsFloat(x));
  }

  default LongToIntFunc andThen(FloatToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsFloat(x));
  }

  default LongUnaryOp andThen(FloatToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsFloat(x));
  }

  default LongToShortFunc andThen(FloatToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsFloat(x));
  }

  default <V> LongFunc<V> andThen(FloatFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsFloat(x));
  }

  default BooleanToFloatFunc compose(BooleanToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsLong(x));
  }

  default ByteToFloatFunc compose(ByteToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsLong(x));
  }

  default CharToFloatFunc compose(CharToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsLong(x));
  }

  default DoubleToFloatFunc compose(DoubleToLongFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsLong(x));
  }

  default FloatUnaryOp compose(FloatToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsLong(x));
  }

  default IntToFloatFunc compose(IntToLongFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsLong(x));
  }

  default LongToFloatFunc compose(LongUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsLong(x));
  }

  default ShortToFloatFunc compose(ShortToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsLong(x));
  }

  default <V> ToFloatFunc<V> compose(ToLongFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsLong(x));
  }
}
