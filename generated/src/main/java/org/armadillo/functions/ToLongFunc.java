package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ToLongFunc<T> extends ToLongFunction<T> {


  default Pred<T> andThen(LongPredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsLong(x));
  }

  default ToByteFunc<T> andThen(LongToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsLong(x));
  }

  default ToCharFunc<T> andThen(LongToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsLong(x));
  }

  default ToDoubleFunc<T> andThen(LongToDoubleFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsLong(x));
  }

  default ToFloatFunc<T> andThen(LongToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsLong(x));
  }

  default ToIntFunc<T> andThen(LongToIntFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsLong(x));
  }

  default ToLongFunc<T> andThen(LongUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsLong(x));
  }

  default ToShortFunc<T> andThen(LongToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsLong(x));
  }

  default <V> Func<T,V> andThen(LongFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsLong(x));
  }

  default BooleanToLongFunc compose(BooleanFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.apply(x));
  }

  default ByteToLongFunc compose(ByteFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.apply(x));
  }

  default CharToLongFunc compose(CharFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.apply(x));
  }

  default DoubleToLongFunc compose(DoubleFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.apply(x));
  }

  default FloatToLongFunc compose(FloatFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.apply(x));
  }

  default IntToLongFunc compose(IntFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.apply(x));
  }

  default LongUnaryOp compose(LongFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.apply(x));
  }

  default ShortToLongFunc compose(ShortFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.apply(x));
  }

  default <V> ToLongFunc<V> compose(Function<? super V,? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.apply(x));
  }
}
