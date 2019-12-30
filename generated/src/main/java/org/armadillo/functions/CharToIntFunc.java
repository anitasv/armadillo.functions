package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface CharToIntFunc {

  int applyAsInt(char value);

  default CharPred andThen(IntPredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsInt(x));
  }

  default CharToByteFunc andThen(IntToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsInt(x));
  }

  default CharUnaryOp andThen(IntToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsInt(x));
  }

  default CharToDoubleFunc andThen(IntToDoubleFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsInt(x));
  }

  default CharToFloatFunc andThen(IntToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsInt(x));
  }

  default CharToIntFunc andThen(IntUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsInt(x));
  }

  default CharToLongFunc andThen(IntToLongFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsInt(x));
  }

  default CharToShortFunc andThen(IntToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsInt(x));
  }

  default <V> CharFunc<V> andThen(IntFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsInt(x));
  }

  default BooleanToIntFunc compose(BooleanToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsChar(x));
  }

  default ByteToIntFunc compose(ByteToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsChar(x));
  }

  default CharToIntFunc compose(CharUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsChar(x));
  }

  default DoubleToIntFunc compose(DoubleToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsChar(x));
  }

  default FloatToIntFunc compose(FloatToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsChar(x));
  }

  default IntUnaryOp compose(IntToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsChar(x));
  }

  default LongToIntFunc compose(LongToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsChar(x));
  }

  default ShortToIntFunc compose(ShortToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsChar(x));
  }

  default <V> ToIntFunc<V> compose(ToCharFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsChar(x));
  }
}
