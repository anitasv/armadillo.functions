package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface DoubleToFloatFunc {

  float applyAsFloat(double value);

  default DoublePred andThen(FloatPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsFloat(x));
  }

  default DoubleToByteFunc andThen(FloatToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsFloat(x));
  }

  default DoubleToCharFunc andThen(FloatToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsFloat(x));
  }

  default DoubleUnaryOp andThen(FloatToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsFloat(x));
  }

  default DoubleToFloatFunc andThen(FloatUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsFloat(x));
  }

  default DoubleToIntFunc andThen(FloatToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsFloat(x));
  }

  default DoubleToLongFunc andThen(FloatToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsFloat(x));
  }

  default DoubleToShortFunc andThen(FloatToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsFloat(x));
  }

  default <V> DoubleFunc<V> andThen(FloatFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsFloat(x));
  }

  default BooleanToFloatFunc compose(BooleanToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsDouble(x));
  }

  default ByteToFloatFunc compose(ByteToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsDouble(x));
  }

  default CharToFloatFunc compose(CharToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsDouble(x));
  }

  default DoubleToFloatFunc compose(DoubleUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsDouble(x));
  }

  default FloatUnaryOp compose(FloatToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsDouble(x));
  }

  default IntToFloatFunc compose(IntToDoubleFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsDouble(x));
  }

  default LongToFloatFunc compose(LongToDoubleFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsDouble(x));
  }

  default ShortToFloatFunc compose(ShortToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsDouble(x));
  }

  default <V> ToFloatFunc<V> compose(ToDoubleFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.applyAsDouble(x));
  }
}
