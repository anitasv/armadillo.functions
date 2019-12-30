package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ToFloatFunc<T> {

  float applyAsFloat(T value);

  default Pred<T> andThen(FloatPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsFloat(x));
  }

  default ToByteFunc<T> andThen(FloatToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsFloat(x));
  }

  default ToCharFunc<T> andThen(FloatToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsFloat(x));
  }

  default ToDoubleFunc<T> andThen(FloatToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsFloat(x));
  }

  default ToFloatFunc<T> andThen(FloatUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsFloat(x));
  }

  default ToIntFunc<T> andThen(FloatToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsFloat(x));
  }

  default ToLongFunc<T> andThen(FloatToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsFloat(x));
  }

  default ToShortFunc<T> andThen(FloatToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsFloat(x));
  }

  default <V> Func<T,V> andThen(FloatFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsFloat(x));
  }

  default BooleanToFloatFunc compose(BooleanFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.apply(x));
  }

  default ByteToFloatFunc compose(ByteFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.apply(x));
  }

  default CharToFloatFunc compose(CharFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.apply(x));
  }

  default DoubleToFloatFunc compose(DoubleFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.apply(x));
  }

  default FloatUnaryOp compose(FloatFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.apply(x));
  }

  default IntToFloatFunc compose(IntFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.apply(x));
  }

  default LongToFloatFunc compose(LongFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.apply(x));
  }

  default ShortToFloatFunc compose(ShortFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.apply(x));
  }

  default <V> ToFloatFunc<V> compose(Function<? super V,? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.apply(x));
  }
}
