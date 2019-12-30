package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface DoubleFunc<R> extends DoubleFunction<R> {


  default DoublePred andThen(Predicate<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.apply(x));
  }

  default DoubleToByteFunc andThen(ToByteFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.apply(x));
  }

  default DoubleToCharFunc andThen(ToCharFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.apply(x));
  }

  default DoubleUnaryOp andThen(ToDoubleFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.apply(x));
  }

  default DoubleToFloatFunc andThen(ToFloatFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.apply(x));
  }

  default DoubleToIntFunc andThen(ToIntFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.apply(x));
  }

  default DoubleToLongFunc andThen(ToLongFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.apply(x));
  }

  default DoubleToShortFunc andThen(ToShortFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.apply(x));
  }

  default <V> DoubleFunc<V> andThen(Function<? super R,? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.apply(x));
  }

  default BooleanFunc<R> compose(BooleanToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsDouble(x));
  }

  default ByteFunc<R> compose(ByteToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsDouble(x));
  }

  default CharFunc<R> compose(CharToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsDouble(x));
  }

  default DoubleFunc<R> compose(DoubleUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsDouble(x));
  }

  default FloatFunc<R> compose(FloatToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsDouble(x));
  }

  default IntFunc<R> compose(IntToDoubleFunction before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsDouble(x));
  }

  default LongFunc<R> compose(LongToDoubleFunction before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsDouble(x));
  }

  default ShortFunc<R> compose(ShortToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsDouble(x));
  }

  default <V> Func<V,R> compose(ToDoubleFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsDouble(x));
  }
}
