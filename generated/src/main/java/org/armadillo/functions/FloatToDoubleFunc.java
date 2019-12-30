package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface FloatToDoubleFunc {

  double applyAsDouble(float value);

  default FloatPred andThen(DoublePredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsDouble(x));
  }

  default FloatToByteFunc andThen(DoubleToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsDouble(x));
  }

  default FloatToCharFunc andThen(DoubleToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsDouble(x));
  }

  default FloatToDoubleFunc andThen(DoubleUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsDouble(x));
  }

  default FloatUnaryOp andThen(DoubleToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsDouble(x));
  }

  default FloatToIntFunc andThen(DoubleToIntFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsDouble(x));
  }

  default FloatToLongFunc andThen(DoubleToLongFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsDouble(x));
  }

  default FloatToShortFunc andThen(DoubleToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsDouble(x));
  }

  default <V> FloatFunc<V> andThen(DoubleFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsDouble(x));
  }

  default BooleanToDoubleFunc compose(BooleanToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsFloat(x));
  }

  default ByteToDoubleFunc compose(ByteToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsFloat(x));
  }

  default CharToDoubleFunc compose(CharToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsFloat(x));
  }

  default DoubleUnaryOp compose(DoubleToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsFloat(x));
  }

  default FloatToDoubleFunc compose(FloatUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsFloat(x));
  }

  default IntToDoubleFunc compose(IntToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsFloat(x));
  }

  default LongToDoubleFunc compose(LongToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsFloat(x));
  }

  default ShortToDoubleFunc compose(ShortToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsFloat(x));
  }

  default <V> ToDoubleFunc<V> compose(ToFloatFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsFloat(x));
  }
}
