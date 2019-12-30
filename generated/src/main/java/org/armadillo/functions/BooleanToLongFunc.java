package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface BooleanToLongFunc {

  long applyAsLong(boolean value);

  default BooleanPred andThen(LongPredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsLong(x));
  }

  default BooleanToByteFunc andThen(LongToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsLong(x));
  }

  default BooleanToCharFunc andThen(LongToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsLong(x));
  }

  default BooleanToDoubleFunc andThen(LongToDoubleFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsLong(x));
  }

  default BooleanToFloatFunc andThen(LongToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsLong(x));
  }

  default BooleanToIntFunc andThen(LongToIntFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsLong(x));
  }

  default BooleanToLongFunc andThen(LongUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsLong(x));
  }

  default BooleanToShortFunc andThen(LongToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsLong(x));
  }

  default <V> BooleanFunc<V> andThen(LongFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsLong(x));
  }

  default BooleanToLongFunc compose(BooleanPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.test(x));
  }

  default ByteToLongFunc compose(BytePred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.test(x));
  }

  default CharToLongFunc compose(CharPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.test(x));
  }

  default DoubleToLongFunc compose(DoublePredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.test(x));
  }

  default FloatToLongFunc compose(FloatPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.test(x));
  }

  default IntToLongFunc compose(IntPredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.test(x));
  }

  default LongUnaryOp compose(LongPredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.test(x));
  }

  default ShortToLongFunc compose(ShortPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.test(x));
  }

  default <V> ToLongFunc<V> compose(Predicate<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.test(x));
  }
}
