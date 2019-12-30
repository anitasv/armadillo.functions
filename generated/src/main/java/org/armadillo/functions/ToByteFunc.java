package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ToByteFunc<T> {

  byte applyAsByte(T value);

  default Pred<T> andThen(BytePred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsByte(x));
  }

  default ToByteFunc<T> andThen(ByteUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsByte(x));
  }

  default ToCharFunc<T> andThen(ByteToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsByte(x));
  }

  default ToDoubleFunc<T> andThen(ByteToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsByte(x));
  }

  default ToFloatFunc<T> andThen(ByteToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsByte(x));
  }

  default ToIntFunc<T> andThen(ByteToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsByte(x));
  }

  default ToLongFunc<T> andThen(ByteToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsByte(x));
  }

  default ToShortFunc<T> andThen(ByteToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsByte(x));
  }

  default <V> Func<T,V> andThen(ByteFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsByte(x));
  }

  default BooleanToByteFunc compose(BooleanFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.apply(x));
  }

  default ByteUnaryOp compose(ByteFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.apply(x));
  }

  default CharToByteFunc compose(CharFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.apply(x));
  }

  default DoubleToByteFunc compose(DoubleFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.apply(x));
  }

  default FloatToByteFunc compose(FloatFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.apply(x));
  }

  default IntToByteFunc compose(IntFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.apply(x));
  }

  default LongToByteFunc compose(LongFunction<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.apply(x));
  }

  default ShortToByteFunc compose(ShortFunc<? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.apply(x));
  }

  default <V> ToByteFunc<V> compose(Function<? super V,? extends T> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.apply(x));
  }
}
