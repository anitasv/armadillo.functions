package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ByteToIntFunc {

  int applyAsInt(byte value);

  default BytePred andThen(IntPredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsInt(x));
  }

  default ByteUnaryOp andThen(IntToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsInt(x));
  }

  default ByteToCharFunc andThen(IntToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsInt(x));
  }

  default ByteToDoubleFunc andThen(IntToDoubleFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsInt(x));
  }

  default ByteToFloatFunc andThen(IntToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsInt(x));
  }

  default ByteToIntFunc andThen(IntUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsInt(x));
  }

  default ByteToLongFunc andThen(IntToLongFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsInt(x));
  }

  default ByteToShortFunc andThen(IntToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsInt(x));
  }

  default <V> ByteFunc<V> andThen(IntFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsInt(x));
  }

  default BooleanToIntFunc compose(BooleanToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsByte(x));
  }

  default ByteToIntFunc compose(ByteUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsByte(x));
  }

  default CharToIntFunc compose(CharToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsByte(x));
  }

  default DoubleToIntFunc compose(DoubleToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsByte(x));
  }

  default FloatToIntFunc compose(FloatToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsByte(x));
  }

  default IntUnaryOp compose(IntToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsByte(x));
  }

  default LongToIntFunc compose(LongToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsByte(x));
  }

  default ShortToIntFunc compose(ShortToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsByte(x));
  }

  default <V> ToIntFunc<V> compose(ToByteFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsByte(x));
  }
}
