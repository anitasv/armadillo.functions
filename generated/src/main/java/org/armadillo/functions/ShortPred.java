package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ShortPred {

  boolean test(short value);

  default ShortPred andThen(BooleanPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.test(x));
  }

  default ShortToByteFunc andThen(BooleanToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.test(x));
  }

  default ShortToCharFunc andThen(BooleanToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.test(x));
  }

  default ShortToDoubleFunc andThen(BooleanToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.test(x));
  }

  default ShortToFloatFunc andThen(BooleanToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.test(x));
  }

  default ShortToIntFunc andThen(BooleanToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.test(x));
  }

  default ShortToLongFunc andThen(BooleanToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.test(x));
  }

  default ShortUnaryOp andThen(BooleanToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.test(x));
  }

  default <V> ShortFunc<V> andThen(BooleanFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.test(x));
  }

  default BooleanPred compose(BooleanToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsShort(x));
  }

  default BytePred compose(ByteToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsShort(x));
  }

  default CharPred compose(CharToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsShort(x));
  }

  default DoublePred compose(DoubleToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsShort(x));
  }

  default FloatPred compose(FloatToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsShort(x));
  }

  default IntPred compose(IntToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsShort(x));
  }

  default LongPred compose(LongToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsShort(x));
  }

  default ShortPred compose(ShortUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsShort(x));
  }

  default <V> Pred<V> compose(ToShortFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsShort(x));
  }
}
