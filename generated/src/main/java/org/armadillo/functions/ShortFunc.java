package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ShortFunc<R> {

  R apply(short value);

  default ShortPred andThen(Predicate<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.apply(x));
  }

  default ShortToByteFunc andThen(ToByteFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.apply(x));
  }

  default ShortToCharFunc andThen(ToCharFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.apply(x));
  }

  default ShortToDoubleFunc andThen(ToDoubleFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.apply(x));
  }

  default ShortToFloatFunc andThen(ToFloatFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.apply(x));
  }

  default ShortToIntFunc andThen(ToIntFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.apply(x));
  }

  default ShortToLongFunc andThen(ToLongFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.apply(x));
  }

  default ShortUnaryOp andThen(ToShortFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.apply(x));
  }

  default <V> ShortFunc<V> andThen(Function<? super R,? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.apply(x));
  }

  default BooleanFunc<R> compose(BooleanToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsShort(x));
  }

  default ByteFunc<R> compose(ByteToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsShort(x));
  }

  default CharFunc<R> compose(CharToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsShort(x));
  }

  default DoubleFunc<R> compose(DoubleToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsShort(x));
  }

  default FloatFunc<R> compose(FloatToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsShort(x));
  }

  default IntFunc<R> compose(IntToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsShort(x));
  }

  default LongFunc<R> compose(LongToShortFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsShort(x));
  }

  default ShortFunc<R> compose(ShortUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsShort(x));
  }

  default <V> Func<V,R> compose(ToShortFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsShort(x));
  }
}
