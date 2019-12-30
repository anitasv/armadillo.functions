package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ToShortFunc<T> {

  short applyAsShort(T value);

  default Pred<T> andThen(ShortPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsShort(x));
  }

  default ToByteFunc<T> andThen(ShortToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsShort(x));
  }

  default ToCharFunc<T> andThen(ShortToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsShort(x));
  }

  default ToDoubleFunc<T> andThen(ShortToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsShort(x));
  }

  default ToFloatFunc<T> andThen(ShortToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsShort(x));
  }

  default ToIntFunc<T> andThen(ShortToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsShort(x));
  }

  default ToLongFunc<T> andThen(ShortToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsShort(x));
  }

  default ToShortFunc<T> andThen(ShortUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsShort(x));
  }

  default <V> Func<T,V> andThen(ShortFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsShort(x));
  }

  default BooleanToShortFunc compose(BooleanFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.apply(x));
  }

  default ByteToShortFunc compose(ByteFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.apply(x));
  }

  default CharToShortFunc compose(CharFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.apply(x));
  }

  default DoubleToShortFunc compose(DoubleFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.apply(x));
  }

  default FloatToShortFunc compose(FloatFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.apply(x));
  }

  default IntToShortFunc compose(IntFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.apply(x));
  }

  default LongToShortFunc compose(LongFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.apply(x));
  }

  default ShortUnaryOp compose(ShortFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.apply(x));
  }

  default <V> ToShortFunc<V> compose(Function<? super V,? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsShort(before.apply(x));
  }
}
