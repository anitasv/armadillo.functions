package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface IntToByteFunc {

  byte applyAsByte(int value);

  default IntPred andThen(BytePred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsByte(x));
  }

  default IntToByteFunc andThen(ByteUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsByte(x));
  }

  default IntToCharFunc andThen(ByteToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsByte(x));
  }

  default IntToDoubleFunc andThen(ByteToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsByte(x));
  }

  default IntToFloatFunc andThen(ByteToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsByte(x));
  }

  default IntUnaryOp andThen(ByteToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsByte(x));
  }

  default IntToLongFunc andThen(ByteToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsByte(x));
  }

  default IntToShortFunc andThen(ByteToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsByte(x));
  }

  default <V> IntFunc<V> andThen(ByteFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsByte(x));
  }

  default BooleanToByteFunc compose(BooleanToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsInt(x));
  }

  default ByteUnaryOp compose(ByteToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsInt(x));
  }

  default CharToByteFunc compose(CharToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsInt(x));
  }

  default DoubleToByteFunc compose(DoubleToIntFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsInt(x));
  }

  default FloatToByteFunc compose(FloatToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsInt(x));
  }

  default IntToByteFunc compose(IntUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsInt(x));
  }

  default LongToByteFunc compose(LongToIntFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsInt(x));
  }

  default ShortToByteFunc compose(ShortToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsInt(x));
  }

  default <V> ToByteFunc<V> compose(ToIntFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsInt(x));
  }
}
