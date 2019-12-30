package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ByteFunc<R> {

  R apply(byte value);

  default BytePred andThen(Predicate<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.apply(x));
  }

  default ByteUnaryOp andThen(ToByteFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.apply(x));
  }

  default ByteToCharFunc andThen(ToCharFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.apply(x));
  }

  default ByteToDoubleFunc andThen(ToDoubleFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.apply(x));
  }

  default ByteToFloatFunc andThen(ToFloatFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.apply(x));
  }

  default ByteToIntFunc andThen(ToIntFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.apply(x));
  }

  default ByteToLongFunc andThen(ToLongFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.apply(x));
  }

  default ByteToShortFunc andThen(ToShortFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.apply(x));
  }

  default <V> ByteFunc<V> andThen(Function<? super R,? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.apply(x));
  }

  default BooleanFunc<R> compose(BooleanToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsByte(x));
  }

  default ByteFunc<R> compose(ByteUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsByte(x));
  }

  default CharFunc<R> compose(CharToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsByte(x));
  }

  default DoubleFunc<R> compose(DoubleToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsByte(x));
  }

  default FloatFunc<R> compose(FloatToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsByte(x));
  }

  default IntFunc<R> compose(IntToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsByte(x));
  }

  default LongFunc<R> compose(LongToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsByte(x));
  }

  default ShortFunc<R> compose(ShortToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsByte(x));
  }

  default <V> Func<V,R> compose(ToByteFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsByte(x));
  }
}
