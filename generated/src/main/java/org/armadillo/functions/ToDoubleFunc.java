package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ToDoubleFunc<T> extends ToDoubleFunction<T> {


  default Pred<T> andThen(DoublePredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsDouble(x));
  }

  default ToByteFunc<T> andThen(DoubleToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsDouble(x));
  }

  default ToCharFunc<T> andThen(DoubleToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsDouble(x));
  }

  default ToDoubleFunc<T> andThen(DoubleUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsDouble(x));
  }

  default ToFloatFunc<T> andThen(DoubleToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsDouble(x));
  }

  default ToIntFunc<T> andThen(DoubleToIntFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsDouble(x));
  }

  default ToLongFunc<T> andThen(DoubleToLongFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsDouble(x));
  }

  default ToShortFunc<T> andThen(DoubleToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsDouble(x));
  }

  default <V> Func<T,V> andThen(DoubleFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsDouble(x));
  }

  default BooleanToDoubleFunc compose(BooleanFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.apply(x));
  }

  default ByteToDoubleFunc compose(ByteFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.apply(x));
  }

  default CharToDoubleFunc compose(CharFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.apply(x));
  }

  default DoubleUnaryOp compose(DoubleFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.apply(x));
  }

  default FloatToDoubleFunc compose(FloatFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.apply(x));
  }

  default IntToDoubleFunc compose(IntFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.apply(x));
  }

  default LongToDoubleFunc compose(LongFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.apply(x));
  }

  default ShortToDoubleFunc compose(ShortFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.apply(x));
  }

  default <V> ToDoubleFunc<V> compose(Function<? super V,? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.apply(x));
  }
}
