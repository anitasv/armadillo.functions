package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface Func<T,R> extends Function<T,R> {


  default Pred<T> andThen(Predicate<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.apply(x));
  }

  default ToByteFunc<T> andThen(ToByteFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.apply(x));
  }

  default ToCharFunc<T> andThen(ToCharFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.apply(x));
  }

  default ToDoubleFunc<T> andThen(ToDoubleFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.apply(x));
  }

  default ToFloatFunc<T> andThen(ToFloatFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.apply(x));
  }

  default ToIntFunc<T> andThen(ToIntFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.apply(x));
  }

  default ToLongFunc<T> andThen(ToLongFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.apply(x));
  }

  default ToShortFunc<T> andThen(ToShortFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.apply(x));
  }

  default <V> Func<T,V> andThen(Function<? super R,? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.apply(x));
  }

  default BooleanFunc<R> compose(BooleanFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.apply(x));
  }

  default ByteFunc<R> compose(ByteFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.apply(x));
  }

  default CharFunc<R> compose(CharFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.apply(x));
  }

  default DoubleFunc<R> compose(DoubleFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.apply(x));
  }

  default FloatFunc<R> compose(FloatFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.apply(x));
  }

  default IntFunc<R> compose(IntFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.apply(x));
  }

  default LongFunc<R> compose(LongFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.apply(x));
  }

  default ShortFunc<R> compose(ShortFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.apply(x));
  }

  default <V> Func<V,R> compose(Function<? super V,? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.apply(x));
  }
  static <T> Func<T,T> identity() { return x -> x; }; 
}
