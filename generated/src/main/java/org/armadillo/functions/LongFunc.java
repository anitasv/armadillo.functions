package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface LongFunc<R> extends LongFunction<R> {


  default LongPred andThen(Predicate<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.apply(x));
  }

  default LongToByteFunc andThen(ToByteFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.apply(x));
  }

  default LongToCharFunc andThen(ToCharFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.apply(x));
  }

  default LongToDoubleFunc andThen(ToDoubleFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.apply(x));
  }

  default LongToFloatFunc andThen(ToFloatFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.apply(x));
  }

  default LongToIntFunc andThen(ToIntFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.apply(x));
  }

  default LongUnaryOp andThen(ToLongFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.apply(x));
  }

  default LongToShortFunc andThen(ToShortFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.apply(x));
  }

  default <V> LongFunc<V> andThen(Function<? super R,? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.apply(x));
  }

  default BooleanFunc<R> compose(BooleanToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsLong(x));
  }

  default ByteFunc<R> compose(ByteToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsLong(x));
  }

  default CharFunc<R> compose(CharToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsLong(x));
  }

  default DoubleFunc<R> compose(DoubleToLongFunction before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsLong(x));
  }

  default FloatFunc<R> compose(FloatToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsLong(x));
  }

  default IntFunc<R> compose(IntToLongFunction before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsLong(x));
  }

  default LongFunc<R> compose(LongUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsLong(x));
  }

  default ShortFunc<R> compose(ShortToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsLong(x));
  }

  default <V> Func<V,R> compose(ToLongFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsLong(x));
  }
}
