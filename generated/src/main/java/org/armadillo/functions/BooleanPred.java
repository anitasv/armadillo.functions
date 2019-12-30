package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface BooleanPred {

  boolean test(boolean value);

  default BooleanPred andThen(BooleanPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.test(x));
  }

  default BooleanToByteFunc andThen(BooleanToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.test(x));
  }

  default BooleanToCharFunc andThen(BooleanToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.test(x));
  }

  default BooleanToDoubleFunc andThen(BooleanToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.test(x));
  }

  default BooleanToFloatFunc andThen(BooleanToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.test(x));
  }

  default BooleanToIntFunc andThen(BooleanToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.test(x));
  }

  default BooleanToLongFunc andThen(BooleanToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.test(x));
  }

  default BooleanToShortFunc andThen(BooleanToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.test(x));
  }

  default <V> BooleanFunc<V> andThen(BooleanFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.test(x));
  }

  default BooleanPred compose(BooleanPred before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.test(x));
  }

  default BytePred compose(BytePred before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.test(x));
  }

  default CharPred compose(CharPred before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.test(x));
  }

  default DoublePred compose(DoublePredicate before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.test(x));
  }

  default FloatPred compose(FloatPred before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.test(x));
  }

  default IntPred compose(IntPredicate before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.test(x));
  }

  default LongPred compose(LongPredicate before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.test(x));
  }

  default ShortPred compose(ShortPred before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.test(x));
  }

  default <V> Pred<V> compose(Predicate<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.test(x));
  }
  static BooleanPred identity() { return x -> x; }; 
}
