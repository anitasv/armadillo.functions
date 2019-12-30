package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface IntToCharFunc {

  char applyAsChar(int value);

  default IntPred andThen(CharPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsChar(x));
  }

  default IntToByteFunc andThen(CharToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsChar(x));
  }

  default IntToCharFunc andThen(CharUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsChar(x));
  }

  default IntToDoubleFunc andThen(CharToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsChar(x));
  }

  default IntToFloatFunc andThen(CharToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsChar(x));
  }

  default IntUnaryOp andThen(CharToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsChar(x));
  }

  default IntToLongFunc andThen(CharToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsChar(x));
  }

  default IntToShortFunc andThen(CharToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsChar(x));
  }

  default <V> IntFunc<V> andThen(CharFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsChar(x));
  }

  default BooleanToCharFunc compose(BooleanToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsInt(x));
  }

  default ByteToCharFunc compose(ByteToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsInt(x));
  }

  default CharUnaryOp compose(CharToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsInt(x));
  }

  default DoubleToCharFunc compose(DoubleToIntFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsInt(x));
  }

  default FloatToCharFunc compose(FloatToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsInt(x));
  }

  default IntToCharFunc compose(IntUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsInt(x));
  }

  default LongToCharFunc compose(LongToIntFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsInt(x));
  }

  default ShortToCharFunc compose(ShortToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsInt(x));
  }

  default <V> ToCharFunc<V> compose(ToIntFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsInt(x));
  }
}
