package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ShortToIntFunc {

  int applyAsInt(short value);

  default ShortPred andThen(IntPredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsInt(x));
  }

  default ShortToByteFunc andThen(IntToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsInt(x));
  }

  default ShortToCharFunc andThen(IntToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsInt(x));
  }

  default ShortToDoubleFunc andThen(IntToDoubleFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsInt(x));
  }

  default ShortToFloatFunc andThen(IntToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsInt(x));
  }

  default ShortToIntFunc andThen(IntUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsInt(x));
  }

  default ShortToLongFunc andThen(IntToLongFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsInt(x));
  }

  default ShortUnaryOp andThen(IntToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsInt(x));
  }

  default <V> ShortFunc<V> andThen(IntFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsInt(x));
  }

  default BooleanToIntFunc compose(BooleanToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsShort(x));
  }

  default ByteToIntFunc compose(ByteToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsShort(x));
  }

  default CharToIntFunc compose(CharToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsShort(x));
  }

  default DoubleToIntFunc compose(DoubleToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsShort(x));
  }

  default FloatToIntFunc compose(FloatToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsShort(x));
  }

  default IntUnaryOp compose(IntToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsShort(x));
  }

  default LongToIntFunc compose(LongToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsShort(x));
  }

  default ShortToIntFunc compose(ShortUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsShort(x));
  }

  default <V> ToIntFunc<V> compose(ToShortFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsShort(x));
  }
}
