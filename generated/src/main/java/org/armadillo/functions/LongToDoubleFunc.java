package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface LongToDoubleFunc extends LongToDoubleFunction {


  default LongPred andThen(DoublePredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsDouble(x));
  }

  default LongToByteFunc andThen(DoubleToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsDouble(x));
  }

  default LongToCharFunc andThen(DoubleToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsDouble(x));
  }

  default LongToDoubleFunc andThen(DoubleUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsDouble(x));
  }

  default LongToFloatFunc andThen(DoubleToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsDouble(x));
  }

  default LongToIntFunc andThen(DoubleToIntFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsDouble(x));
  }

  default LongUnaryOp andThen(DoubleToLongFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsDouble(x));
  }

  default LongToShortFunc andThen(DoubleToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsDouble(x));
  }

  default <V> LongFunc<V> andThen(DoubleFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsDouble(x));
  }

  default BooleanToDoubleFunc compose(BooleanToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsLong(x));
  }

  default ByteToDoubleFunc compose(ByteToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsLong(x));
  }

  default CharToDoubleFunc compose(CharToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsLong(x));
  }

  default DoubleUnaryOp compose(DoubleToLongFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsLong(x));
  }

  default FloatToDoubleFunc compose(FloatToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsLong(x));
  }

  default IntToDoubleFunc compose(IntToLongFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsLong(x));
  }

  default LongToDoubleFunc compose(LongUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsLong(x));
  }

  default ShortToDoubleFunc compose(ShortToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsLong(x));
  }

  default <V> ToDoubleFunc<V> compose(ToLongFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsLong(x));
  }
}
