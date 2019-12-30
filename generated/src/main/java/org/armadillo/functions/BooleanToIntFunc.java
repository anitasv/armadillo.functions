package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface BooleanToIntFunc {

  int applyAsInt(boolean value);

  default BooleanPred andThen(IntPredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsInt(x));
  }

  default BooleanToByteFunc andThen(IntToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsInt(x));
  }

  default BooleanToCharFunc andThen(IntToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsInt(x));
  }

  default BooleanToDoubleFunc andThen(IntToDoubleFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsInt(x));
  }

  default BooleanToFloatFunc andThen(IntToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsInt(x));
  }

  default BooleanToIntFunc andThen(IntUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsInt(x));
  }

  default BooleanToLongFunc andThen(IntToLongFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsInt(x));
  }

  default BooleanToShortFunc andThen(IntToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsInt(x));
  }

  default <V> BooleanFunc<V> andThen(IntFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsInt(x));
  }

  default BooleanToIntFunc compose(BooleanPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.test(x));
  }

  default ByteToIntFunc compose(BytePred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.test(x));
  }

  default CharToIntFunc compose(CharPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.test(x));
  }

  default DoubleToIntFunc compose(DoublePredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.test(x));
  }

  default FloatToIntFunc compose(FloatPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.test(x));
  }

  default IntUnaryOp compose(IntPredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.test(x));
  }

  default LongToIntFunc compose(LongPredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.test(x));
  }

  default ShortToIntFunc compose(ShortPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.test(x));
  }

  default <V> ToIntFunc<V> compose(Predicate<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.test(x));
  }
}
