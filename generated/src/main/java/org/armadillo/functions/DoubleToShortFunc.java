package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface DoubleToShortFunc {

  short applyAsShort(double value);

  default DoublePred andThen(ShortPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsShort(x));
  }

  default DoubleToByteFunc andThen(ShortToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsShort(x));
  }

  default DoubleToCharFunc andThen(ShortToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsShort(x));
  }

  default DoubleUnaryOp andThen(ShortToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsShort(x));
  }

  default DoubleToFloatFunc andThen(ShortToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsShort(x));
  }

  default DoubleToIntFunc andThen(ShortToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsShort(x));
  }

  default DoubleToLongFunc andThen(ShortToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsShort(x));
  }

  default DoubleToShortFunc andThen(ShortUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsShort(x));
  }

  default <V> DoubleFunc<V> andThen(ShortFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsShort(x));
  }

  default BooleanToShortFunc compose(BooleanToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsDouble(x));
  }

  default ByteToShortFunc compose(ByteToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsDouble(x));
  }

  default CharToShortFunc compose(CharToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsDouble(x));
  }

  default DoubleToShortFunc compose(DoubleUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsDouble(x));
  }

  default FloatToShortFunc compose(FloatToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsDouble(x));
  }

  default IntToShortFunc compose(IntToDoubleFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsDouble(x));
  }

  default LongToShortFunc compose(LongToDoubleFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsDouble(x));
  }

  default ShortUnaryOp compose(ShortToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsDouble(x));
  }

  default <V> ToShortFunc<V> compose(ToDoubleFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsDouble(x));
  }
}
