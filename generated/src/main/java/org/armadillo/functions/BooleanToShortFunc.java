package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface BooleanToShortFunc {

  short applyAsShort(boolean value);

  default BooleanPred andThen(ShortPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsShort(x));
  }

  default BooleanToByteFunc andThen(ShortToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsShort(x));
  }

  default BooleanToCharFunc andThen(ShortToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsShort(x));
  }

  default BooleanToDoubleFunc andThen(ShortToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsShort(x));
  }

  default BooleanToFloatFunc andThen(ShortToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsShort(x));
  }

  default BooleanToIntFunc andThen(ShortToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsShort(x));
  }

  default BooleanToLongFunc andThen(ShortToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsShort(x));
  }

  default BooleanToShortFunc andThen(ShortUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsShort(x));
  }

  default <V> BooleanFunc<V> andThen(ShortFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsShort(x));
  }

  default BooleanToShortFunc compose(BooleanPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.test(x));
  }

  default ByteToShortFunc compose(BytePred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.test(x));
  }

  default CharToShortFunc compose(CharPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.test(x));
  }

  default DoubleToShortFunc compose(DoublePredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.test(x));
  }

  default FloatToShortFunc compose(FloatPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.test(x));
  }

  default IntToShortFunc compose(IntPredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.test(x));
  }

  default LongToShortFunc compose(LongPredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.test(x));
  }

  default ShortUnaryOp compose(ShortPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.test(x));
  }

  default <V> ToShortFunc<V> compose(Predicate<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.test(x));
  }
}
