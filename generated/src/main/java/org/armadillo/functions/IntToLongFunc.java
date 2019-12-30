package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface IntToLongFunc extends IntToLongFunction {


  default IntPred andThen(LongPredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsLong(x));
  }

  default IntToByteFunc andThen(LongToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsLong(x));
  }

  default IntToCharFunc andThen(LongToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsLong(x));
  }

  default IntToDoubleFunc andThen(LongToDoubleFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsLong(x));
  }

  default IntToFloatFunc andThen(LongToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsLong(x));
  }

  default IntUnaryOp andThen(LongToIntFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsLong(x));
  }

  default IntToLongFunc andThen(LongUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsLong(x));
  }

  default IntToShortFunc andThen(LongToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsLong(x));
  }

  default <V> IntFunc<V> andThen(LongFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsLong(x));
  }

  default BooleanToLongFunc compose(BooleanToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsInt(x));
  }

  default ByteToLongFunc compose(ByteToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsInt(x));
  }

  default CharToLongFunc compose(CharToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsInt(x));
  }

  default DoubleToLongFunc compose(DoubleToIntFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsInt(x));
  }

  default FloatToLongFunc compose(FloatToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsInt(x));
  }

  default IntToLongFunc compose(IntUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsInt(x));
  }

  default LongUnaryOp compose(LongToIntFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsInt(x));
  }

  default ShortToLongFunc compose(ShortToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsInt(x));
  }

  default <V> ToLongFunc<V> compose(ToIntFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsInt(x));
  }
}
