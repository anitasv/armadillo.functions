package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface CharToDoubleFunc {

  double applyAsDouble(char value);

  default CharPred andThen(DoublePredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsDouble(x));
  }

  default CharToByteFunc andThen(DoubleToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsDouble(x));
  }

  default CharUnaryOp andThen(DoubleToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsDouble(x));
  }

  default CharToDoubleFunc andThen(DoubleUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsDouble(x));
  }

  default CharToFloatFunc andThen(DoubleToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsDouble(x));
  }

  default CharToIntFunc andThen(DoubleToIntFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsDouble(x));
  }

  default CharToLongFunc andThen(DoubleToLongFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsDouble(x));
  }

  default CharToShortFunc andThen(DoubleToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsDouble(x));
  }

  default <V> CharFunc<V> andThen(DoubleFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsDouble(x));
  }

  default BooleanToDoubleFunc compose(BooleanToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsChar(x));
  }

  default ByteToDoubleFunc compose(ByteToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsChar(x));
  }

  default CharToDoubleFunc compose(CharUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsChar(x));
  }

  default DoubleUnaryOp compose(DoubleToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsChar(x));
  }

  default FloatToDoubleFunc compose(FloatToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsChar(x));
  }

  default IntToDoubleFunc compose(IntToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsChar(x));
  }

  default LongToDoubleFunc compose(LongToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsChar(x));
  }

  default ShortToDoubleFunc compose(ShortToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsChar(x));
  }

  default <V> ToDoubleFunc<V> compose(ToCharFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsChar(x));
  }
}
