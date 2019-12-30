package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface IntFunc<R> extends IntFunction<R> {


  default IntPred andThen(Predicate<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.apply(x));
  }

  default IntToByteFunc andThen(ToByteFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.apply(x));
  }

  default IntToCharFunc andThen(ToCharFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.apply(x));
  }

  default IntToDoubleFunc andThen(ToDoubleFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.apply(x));
  }

  default IntToFloatFunc andThen(ToFloatFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.apply(x));
  }

  default IntUnaryOp andThen(ToIntFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.apply(x));
  }

  default IntToLongFunc andThen(ToLongFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.apply(x));
  }

  default IntToShortFunc andThen(ToShortFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.apply(x));
  }

  default <V> IntFunc<V> andThen(Function<? super R,? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.apply(x));
  }

  default BooleanFunc<R> compose(BooleanToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsInt(x));
  }

  default ByteFunc<R> compose(ByteToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsInt(x));
  }

  default CharFunc<R> compose(CharToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsInt(x));
  }

  default DoubleFunc<R> compose(DoubleToIntFunction before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsInt(x));
  }

  default FloatFunc<R> compose(FloatToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsInt(x));
  }

  default IntFunc<R> compose(IntUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsInt(x));
  }

  default LongFunc<R> compose(LongToIntFunction before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsInt(x));
  }

  default ShortFunc<R> compose(ShortToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsInt(x));
  }

  default <V> Func<V,R> compose(ToIntFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsInt(x));
  }
}
