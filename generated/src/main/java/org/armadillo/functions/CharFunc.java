package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface CharFunc<R> {

  R apply(char value);

  default CharPred andThen(Predicate<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.apply(x));
  }

  default CharToByteFunc andThen(ToByteFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.apply(x));
  }

  default CharUnaryOp andThen(ToCharFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.apply(x));
  }

  default CharToDoubleFunc andThen(ToDoubleFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.apply(x));
  }

  default CharToFloatFunc andThen(ToFloatFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.apply(x));
  }

  default CharToIntFunc andThen(ToIntFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.apply(x));
  }

  default CharToLongFunc andThen(ToLongFunction<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.apply(x));
  }

  default CharToShortFunc andThen(ToShortFunc<? super R> after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.apply(x));
  }

  default <V> CharFunc<V> andThen(Function<? super R,? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.apply(x));
  }

  default BooleanFunc<R> compose(BooleanToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsChar(x));
  }

  default ByteFunc<R> compose(ByteToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsChar(x));
  }

  default CharFunc<R> compose(CharUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsChar(x));
  }

  default DoubleFunc<R> compose(DoubleToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsChar(x));
  }

  default FloatFunc<R> compose(FloatToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsChar(x));
  }

  default IntFunc<R> compose(IntToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsChar(x));
  }

  default LongFunc<R> compose(LongToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsChar(x));
  }

  default ShortFunc<R> compose(ShortToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsChar(x));
  }

  default <V> Func<V,R> compose(ToCharFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.apply(before.applyAsChar(x));
  }
}
