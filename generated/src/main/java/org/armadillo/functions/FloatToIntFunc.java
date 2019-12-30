package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface FloatToIntFunc {

  int applyAsInt(float value);

  default FloatPred andThen(IntPredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsInt(x));
  }

  default FloatToByteFunc andThen(IntToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsInt(x));
  }

  default FloatToCharFunc andThen(IntToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsInt(x));
  }

  default FloatToDoubleFunc andThen(IntToDoubleFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsInt(x));
  }

  default FloatUnaryOp andThen(IntToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsInt(x));
  }

  default FloatToIntFunc andThen(IntUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsInt(x));
  }

  default FloatToLongFunc andThen(IntToLongFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsInt(x));
  }

  default FloatToShortFunc andThen(IntToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsInt(x));
  }

  default <V> FloatFunc<V> andThen(IntFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsInt(x));
  }

  default BooleanToIntFunc compose(BooleanToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsFloat(x));
  }

  default ByteToIntFunc compose(ByteToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsFloat(x));
  }

  default CharToIntFunc compose(CharToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsFloat(x));
  }

  default DoubleToIntFunc compose(DoubleToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsFloat(x));
  }

  default FloatToIntFunc compose(FloatUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsFloat(x));
  }

  default IntUnaryOp compose(IntToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsFloat(x));
  }

  default LongToIntFunc compose(LongToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsFloat(x));
  }

  default ShortToIntFunc compose(ShortToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsFloat(x));
  }

  default <V> ToIntFunc<V> compose(ToFloatFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsFloat(x));
  }
}
