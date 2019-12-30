package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface DoubleToLongFunc extends DoubleToLongFunction {


  default DoublePred andThen(LongPredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsLong(x));
  }

  default DoubleToByteFunc andThen(LongToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsLong(x));
  }

  default DoubleToCharFunc andThen(LongToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsLong(x));
  }

  default DoubleUnaryOp andThen(LongToDoubleFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsLong(x));
  }

  default DoubleToFloatFunc andThen(LongToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsLong(x));
  }

  default DoubleToIntFunc andThen(LongToIntFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsLong(x));
  }

  default DoubleToLongFunc andThen(LongUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsLong(x));
  }

  default DoubleToShortFunc andThen(LongToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsLong(x));
  }

  default <V> DoubleFunc<V> andThen(LongFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsLong(x));
  }

  default BooleanToLongFunc compose(BooleanToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsDouble(x));
  }

  default ByteToLongFunc compose(ByteToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsDouble(x));
  }

  default CharToLongFunc compose(CharToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsDouble(x));
  }

  default DoubleToLongFunc compose(DoubleUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsDouble(x));
  }

  default FloatToLongFunc compose(FloatToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsDouble(x));
  }

  default IntToLongFunc compose(IntToDoubleFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsDouble(x));
  }

  default LongUnaryOp compose(LongToDoubleFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsDouble(x));
  }

  default ShortToLongFunc compose(ShortToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsDouble(x));
  }

  default <V> ToLongFunc<V> compose(ToDoubleFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsDouble(x));
  }
}
