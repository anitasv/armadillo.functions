package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface DoubleToCharFunc {

  char applyAsChar(double value);

  default DoublePred andThen(CharPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsChar(x));
  }

  default DoubleToByteFunc andThen(CharToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsChar(x));
  }

  default DoubleToCharFunc andThen(CharUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsChar(x));
  }

  default DoubleUnaryOp andThen(CharToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsChar(x));
  }

  default DoubleToFloatFunc andThen(CharToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsChar(x));
  }

  default DoubleToIntFunc andThen(CharToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsChar(x));
  }

  default DoubleToLongFunc andThen(CharToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsChar(x));
  }

  default DoubleToShortFunc andThen(CharToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsChar(x));
  }

  default <V> DoubleFunc<V> andThen(CharFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsChar(x));
  }

  default BooleanToCharFunc compose(BooleanToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsDouble(x));
  }

  default ByteToCharFunc compose(ByteToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsDouble(x));
  }

  default CharUnaryOp compose(CharToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsDouble(x));
  }

  default DoubleToCharFunc compose(DoubleUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsDouble(x));
  }

  default FloatToCharFunc compose(FloatToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsDouble(x));
  }

  default IntToCharFunc compose(IntToDoubleFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsDouble(x));
  }

  default LongToCharFunc compose(LongToDoubleFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsDouble(x));
  }

  default ShortToCharFunc compose(ShortToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsDouble(x));
  }

  default <V> ToCharFunc<V> compose(ToDoubleFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsDouble(x));
  }
}
