package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface FloatToLongFunc {

  long applyAsLong(float value);

  default FloatPred andThen(LongPredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsLong(x));
  }

  default FloatToByteFunc andThen(LongToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsLong(x));
  }

  default FloatToCharFunc andThen(LongToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsLong(x));
  }

  default FloatToDoubleFunc andThen(LongToDoubleFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsLong(x));
  }

  default FloatUnaryOp andThen(LongToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsLong(x));
  }

  default FloatToIntFunc andThen(LongToIntFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsLong(x));
  }

  default FloatToLongFunc andThen(LongUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsLong(x));
  }

  default FloatToShortFunc andThen(LongToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsLong(x));
  }

  default <V> FloatFunc<V> andThen(LongFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsLong(x));
  }

  default BooleanToLongFunc compose(BooleanToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsFloat(x));
  }

  default ByteToLongFunc compose(ByteToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsFloat(x));
  }

  default CharToLongFunc compose(CharToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsFloat(x));
  }

  default DoubleToLongFunc compose(DoubleToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsFloat(x));
  }

  default FloatToLongFunc compose(FloatUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsFloat(x));
  }

  default IntToLongFunc compose(IntToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsFloat(x));
  }

  default LongUnaryOp compose(LongToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsFloat(x));
  }

  default ShortToLongFunc compose(ShortToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsFloat(x));
  }

  default <V> ToLongFunc<V> compose(ToFloatFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsFloat(x));
  }
}
