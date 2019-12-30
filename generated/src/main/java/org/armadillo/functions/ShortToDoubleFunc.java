package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ShortToDoubleFunc {

  double applyAsDouble(short value);

  default ShortPred andThen(DoublePredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsDouble(x));
  }

  default ShortToByteFunc andThen(DoubleToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsDouble(x));
  }

  default ShortToCharFunc andThen(DoubleToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsDouble(x));
  }

  default ShortToDoubleFunc andThen(DoubleUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsDouble(x));
  }

  default ShortToFloatFunc andThen(DoubleToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsDouble(x));
  }

  default ShortToIntFunc andThen(DoubleToIntFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsDouble(x));
  }

  default ShortToLongFunc andThen(DoubleToLongFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsDouble(x));
  }

  default ShortUnaryOp andThen(DoubleToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsDouble(x));
  }

  default <V> ShortFunc<V> andThen(DoubleFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsDouble(x));
  }

  default BooleanToDoubleFunc compose(BooleanToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsShort(x));
  }

  default ByteToDoubleFunc compose(ByteToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsShort(x));
  }

  default CharToDoubleFunc compose(CharToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsShort(x));
  }

  default DoubleUnaryOp compose(DoubleToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsShort(x));
  }

  default FloatToDoubleFunc compose(FloatToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsShort(x));
  }

  default IntToDoubleFunc compose(IntToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsShort(x));
  }

  default LongToDoubleFunc compose(LongToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsShort(x));
  }

  default ShortToDoubleFunc compose(ShortUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsShort(x));
  }

  default <V> ToDoubleFunc<V> compose(ToShortFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsShort(x));
  }
}
