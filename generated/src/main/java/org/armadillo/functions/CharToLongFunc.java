package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface CharToLongFunc {

  long applyAsLong(char value);

  default CharPred andThen(LongPredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsLong(x));
  }

  default CharToByteFunc andThen(LongToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsLong(x));
  }

  default CharUnaryOp andThen(LongToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsLong(x));
  }

  default CharToDoubleFunc andThen(LongToDoubleFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsLong(x));
  }

  default CharToFloatFunc andThen(LongToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsLong(x));
  }

  default CharToIntFunc andThen(LongToIntFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsLong(x));
  }

  default CharToLongFunc andThen(LongUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsLong(x));
  }

  default CharToShortFunc andThen(LongToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsLong(x));
  }

  default <V> CharFunc<V> andThen(LongFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsLong(x));
  }

  default BooleanToLongFunc compose(BooleanToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsChar(x));
  }

  default ByteToLongFunc compose(ByteToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsChar(x));
  }

  default CharToLongFunc compose(CharUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsChar(x));
  }

  default DoubleToLongFunc compose(DoubleToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsChar(x));
  }

  default FloatToLongFunc compose(FloatToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsChar(x));
  }

  default IntToLongFunc compose(IntToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsChar(x));
  }

  default LongUnaryOp compose(LongToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsChar(x));
  }

  default ShortToLongFunc compose(ShortToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsChar(x));
  }

  default <V> ToLongFunc<V> compose(ToCharFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsChar(x));
  }
}
