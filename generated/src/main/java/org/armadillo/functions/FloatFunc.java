package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface FloatFunc<R> {

  R apply(float value);

  default FloatPred andThen(Predicate<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.apply(x));
  }

  default FloatToByteFunc andThen(ToByteFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.apply(x));
  }

  default FloatToCharFunc andThen(ToCharFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.apply(x));
  }

  default FloatToDoubleFunc andThen(ToDoubleFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.apply(x));
  }

  default FloatUnaryOp andThen(ToFloatFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.apply(x));
  }

  default FloatToIntFunc andThen(ToIntFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.apply(x));
  }

  default FloatToLongFunc andThen(ToLongFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.apply(x));
  }

  default FloatToShortFunc andThen(ToShortFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.apply(x));
  }

  default <V> FloatFunc<V> andThen(Function<? super R,? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.apply(x));
  }

  default BooleanFunc<R> compose(BooleanToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsFloat(x));
  }

  default ByteFunc<R> compose(ByteToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsFloat(x));
  }

  default CharFunc<R> compose(CharToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsFloat(x));
  }

  default DoubleFunc<R> compose(DoubleToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsFloat(x));
  }

  default FloatFunc<R> compose(FloatUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsFloat(x));
  }

  default IntFunc<R> compose(IntToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsFloat(x));
  }

  default LongFunc<R> compose(LongToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsFloat(x));
  }

  default ShortFunc<R> compose(ShortToFloatFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsFloat(x));
  }

  default <V> Func<V,R> compose(ToFloatFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsFloat(x));
  }
}
