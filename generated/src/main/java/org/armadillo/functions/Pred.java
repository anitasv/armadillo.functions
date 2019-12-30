package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface Pred<T> extends Predicate<T> {


  default Pred<T> andThen(BooleanPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.test(x));
  }

  default ToByteFunc<T> andThen(BooleanToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.test(x));
  }

  default ToCharFunc<T> andThen(BooleanToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.test(x));
  }

  default ToDoubleFunc<T> andThen(BooleanToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.test(x));
  }

  default ToFloatFunc<T> andThen(BooleanToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.test(x));
  }

  default ToIntFunc<T> andThen(BooleanToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.test(x));
  }

  default ToLongFunc<T> andThen(BooleanToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.test(x));
  }

  default ToShortFunc<T> andThen(BooleanToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.test(x));
  }

  default <V> Func<T,V> andThen(BooleanFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.test(x));
  }

  default BooleanPred compose(BooleanFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.apply(x));
  }

  default BytePred compose(ByteFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.apply(x));
  }

  default CharPred compose(CharFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.apply(x));
  }

  default DoublePred compose(DoubleFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.apply(x));
  }

  default FloatPred compose(FloatFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.apply(x));
  }

  default IntPred compose(IntFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.apply(x));
  }

  default LongPred compose(LongFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.apply(x));
  }

  default ShortPred compose(ShortFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.apply(x));
  }

  default <V> Pred<V> compose(Function<? super V,? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.apply(x));
  }
}
