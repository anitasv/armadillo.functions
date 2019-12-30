package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface LongToCharFunc {

  char applyAsChar(long value);

  default LongPred andThen(CharPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsChar(x));
  }

  default LongToByteFunc andThen(CharToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsChar(x));
  }

  default LongToCharFunc andThen(CharUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsChar(x));
  }

  default LongToDoubleFunc andThen(CharToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsChar(x));
  }

  default LongToFloatFunc andThen(CharToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsChar(x));
  }

  default LongToIntFunc andThen(CharToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsChar(x));
  }

  default LongUnaryOp andThen(CharToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsChar(x));
  }

  default LongToShortFunc andThen(CharToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsChar(x));
  }

  default <V> LongFunc<V> andThen(CharFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsChar(x));
  }

  default BooleanToCharFunc compose(BooleanToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsLong(x));
  }

  default ByteToCharFunc compose(ByteToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsLong(x));
  }

  default CharUnaryOp compose(CharToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsLong(x));
  }

  default DoubleToCharFunc compose(DoubleToLongFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsLong(x));
  }

  default FloatToCharFunc compose(FloatToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsLong(x));
  }

  default IntToCharFunc compose(IntToLongFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsLong(x));
  }

  default LongToCharFunc compose(LongUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsLong(x));
  }

  default ShortToCharFunc compose(ShortToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsLong(x));
  }

  default <V> ToCharFunc<V> compose(ToLongFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.applyAsLong(x));
  }
}
