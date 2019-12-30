package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ShortUnaryOp {

  short applyAsShort(short value);

  default ShortPred andThen(ShortPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsShort(x));
  }

  default ShortToByteFunc andThen(ShortToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsShort(x));
  }

  default ShortToCharFunc andThen(ShortToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsShort(x));
  }

  default ShortToDoubleFunc andThen(ShortToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsShort(x));
  }

  default ShortToFloatFunc andThen(ShortToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsShort(x));
  }

  default ShortToIntFunc andThen(ShortToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsShort(x));
  }

  default ShortToLongFunc andThen(ShortToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsShort(x));
  }

  default ShortUnaryOp andThen(ShortUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsShort(x));
  }

  default <V> ShortFunc<V> andThen(ShortFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsShort(x));
  }

  default BooleanToShortFunc compose(BooleanToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsShort(x));
  }

  default ByteToShortFunc compose(ByteToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsShort(x));
  }

  default CharToShortFunc compose(CharToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsShort(x));
  }

  default DoubleToShortFunc compose(DoubleToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsShort(x));
  }

  default FloatToShortFunc compose(FloatToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsShort(x));
  }

  default IntToShortFunc compose(IntToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsShort(x));
  }

  default LongToShortFunc compose(LongToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsShort(x));
  }

  default ShortUnaryOp compose(ShortUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsShort(x));
  }

  default <V> ToShortFunc<V> compose(ToShortFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.applyAsShort(x));
  }
  static ShortUnaryOp identity() { return x -> x; }; 
}
