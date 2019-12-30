package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface BooleanFunc<R> {

  R apply(boolean value);

  default BooleanPred andThen(Predicate<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.apply(x));
  }

  default BooleanToByteFunc andThen(ToByteFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.apply(x));
  }

  default BooleanToCharFunc andThen(ToCharFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.apply(x));
  }

  default BooleanToDoubleFunc andThen(ToDoubleFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.apply(x));
  }

  default BooleanToFloatFunc andThen(ToFloatFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.apply(x));
  }

  default BooleanToIntFunc andThen(ToIntFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.apply(x));
  }

  default BooleanToLongFunc andThen(ToLongFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.apply(x));
  }

  default BooleanToShortFunc andThen(ToShortFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.apply(x));
  }

  default <V> BooleanFunc<V> andThen(Function<? super R,? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.apply(x));
  }

  default BooleanFunc<R> compose(BooleanPred before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.test(x));
  }

  default ByteFunc<R> compose(BytePred before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.test(x));
  }

  default CharFunc<R> compose(CharPred before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.test(x));
  }

  default DoubleFunc<R> compose(DoublePredicate before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.test(x));
  }

  default FloatFunc<R> compose(FloatPred before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.test(x));
  }

  default IntFunc<R> compose(IntPredicate before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.test(x));
  }

  default LongFunc<R> compose(LongPredicate before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.test(x));
  }

  default ShortFunc<R> compose(ShortPred before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.test(x));
  }

  default <V> Func<V,R> compose(Predicate<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.test(x));
  }
}
