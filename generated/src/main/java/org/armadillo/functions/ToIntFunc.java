package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ToIntFunc<T> extends ToIntFunction<T> {


  default Pred<T> andThen(IntPredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsInt(x));
  }

  default ToByteFunc<T> andThen(IntToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsInt(x));
  }

  default ToCharFunc<T> andThen(IntToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsInt(x));
  }

  default ToDoubleFunc<T> andThen(IntToDoubleFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsInt(x));
  }

  default ToFloatFunc<T> andThen(IntToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsInt(x));
  }

  default ToIntFunc<T> andThen(IntUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsInt(x));
  }

  default ToLongFunc<T> andThen(IntToLongFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsInt(x));
  }

  default ToShortFunc<T> andThen(IntToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsInt(x));
  }

  default <V> Func<T,V> andThen(IntFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsInt(x));
  }

  default BooleanToIntFunc compose(BooleanFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.apply(x));
  }

  default ByteToIntFunc compose(ByteFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.apply(x));
  }

  default CharToIntFunc compose(CharFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.apply(x));
  }

  default DoubleToIntFunc compose(DoubleFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.apply(x));
  }

  default FloatToIntFunc compose(FloatFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.apply(x));
  }

  default IntUnaryOp compose(IntFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.apply(x));
  }

  default LongToIntFunc compose(LongFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.apply(x));
  }

  default ShortToIntFunc compose(ShortFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.apply(x));
  }

  default <V> ToIntFunc<V> compose(Function<? super V,? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.apply(x));
  }
}
