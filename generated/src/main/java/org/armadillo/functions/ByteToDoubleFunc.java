package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ByteToDoubleFunc {

  double applyAsDouble(byte value);

  default BytePred andThen(DoublePredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsDouble(x));
  }

  default ByteUnaryOp andThen(DoubleToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsDouble(x));
  }

  default ByteToCharFunc andThen(DoubleToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsDouble(x));
  }

  default ByteToDoubleFunc andThen(DoubleUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsDouble(x));
  }

  default ByteToFloatFunc andThen(DoubleToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsDouble(x));
  }

  default ByteToIntFunc andThen(DoubleToIntFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsDouble(x));
  }

  default ByteToLongFunc andThen(DoubleToLongFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsDouble(x));
  }

  default ByteToShortFunc andThen(DoubleToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsDouble(x));
  }

  default <V> ByteFunc<V> andThen(DoubleFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsDouble(x));
  }

  default BooleanToDoubleFunc compose(BooleanToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsByte(x));
  }

  default ByteToDoubleFunc compose(ByteUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsByte(x));
  }

  default CharToDoubleFunc compose(CharToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsByte(x));
  }

  default DoubleUnaryOp compose(DoubleToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsByte(x));
  }

  default FloatToDoubleFunc compose(FloatToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsByte(x));
  }

  default IntToDoubleFunc compose(IntToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsByte(x));
  }

  default LongToDoubleFunc compose(LongToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsByte(x));
  }

  default ShortToDoubleFunc compose(ShortToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsByte(x));
  }

  default <V> ToDoubleFunc<V> compose(ToByteFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsByte(x));
  }
}
