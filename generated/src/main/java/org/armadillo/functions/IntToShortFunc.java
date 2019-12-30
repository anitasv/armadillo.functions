package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface IntToShortFunc {

  short applyAsShort(int value);

  default IntPred andThen(ShortPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsShort(x));
  }

  default IntToByteFunc andThen(ShortToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsShort(x));
  }

  default IntToCharFunc andThen(ShortToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsShort(x));
  }

  default IntToDoubleFunc andThen(ShortToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsShort(x));
  }

  default IntToFloatFunc andThen(ShortToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsShort(x));
  }

  default IntUnaryOp andThen(ShortToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsShort(x));
  }

  default IntToLongFunc andThen(ShortToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsShort(x));
  }

  default IntToShortFunc andThen(ShortUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsShort(x));
  }

  default <V> IntFunc<V> andThen(ShortFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsShort(x));
  }

  default BooleanToShortFunc compose(BooleanToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsInt(x));
  }

  default ByteToShortFunc compose(ByteToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsInt(x));
  }

  default CharToShortFunc compose(CharToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsInt(x));
  }

  default DoubleToShortFunc compose(DoubleToIntFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsInt(x));
  }

  default FloatToShortFunc compose(FloatToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsInt(x));
  }

  default IntToShortFunc compose(IntUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsInt(x));
  }

  default LongToShortFunc compose(LongToIntFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsInt(x));
  }

  default ShortUnaryOp compose(ShortToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsInt(x));
  }

  default <V> ToShortFunc<V> compose(ToIntFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsInt(x));
  }
}
