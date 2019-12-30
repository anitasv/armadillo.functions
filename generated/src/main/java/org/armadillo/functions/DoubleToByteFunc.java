package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface DoubleToByteFunc {

  byte applyAsByte(double value);

  default DoublePred andThen(BytePred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsByte(x));
  }

  default DoubleToByteFunc andThen(ByteUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsByte(x));
  }

  default DoubleToCharFunc andThen(ByteToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsByte(x));
  }

  default DoubleUnaryOp andThen(ByteToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsByte(x));
  }

  default DoubleToFloatFunc andThen(ByteToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsByte(x));
  }

  default DoubleToIntFunc andThen(ByteToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsByte(x));
  }

  default DoubleToLongFunc andThen(ByteToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsByte(x));
  }

  default DoubleToShortFunc andThen(ByteToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsByte(x));
  }

  default <V> DoubleFunc<V> andThen(ByteFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsByte(x));
  }

  default BooleanToByteFunc compose(BooleanToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsDouble(x));
  }

  default ByteUnaryOp compose(ByteToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsDouble(x));
  }

  default CharToByteFunc compose(CharToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsDouble(x));
  }

  default DoubleToByteFunc compose(DoubleUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsDouble(x));
  }

  default FloatToByteFunc compose(FloatToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsDouble(x));
  }

  default IntToByteFunc compose(IntToDoubleFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsDouble(x));
  }

  default LongToByteFunc compose(LongToDoubleFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsDouble(x));
  }

  default ShortToByteFunc compose(ShortToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsDouble(x));
  }

  default <V> ToByteFunc<V> compose(ToDoubleFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsDouble(x));
  }
}
