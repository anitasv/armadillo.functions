package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface ByteUnaryOp {

  byte applyAsByte(byte value);

  default BytePred andThen(BytePred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsByte(x));
  }

  default ByteUnaryOp andThen(ByteUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsByte(x));
  }

  default ByteToCharFunc andThen(ByteToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsByte(x));
  }

  default ByteToDoubleFunc andThen(ByteToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsByte(x));
  }

  default ByteToFloatFunc andThen(ByteToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsByte(x));
  }

  default ByteToIntFunc andThen(ByteToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsByte(x));
  }

  default ByteToLongFunc andThen(ByteToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsByte(x));
  }

  default ByteToShortFunc andThen(ByteToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsByte(x));
  }

  default <V> ByteFunc<V> andThen(ByteFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsByte(x));
  }

  default BooleanToByteFunc compose(BooleanToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsByte(x));
  }

  default ByteUnaryOp compose(ByteUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsByte(x));
  }

  default CharToByteFunc compose(CharToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsByte(x));
  }

  default DoubleToByteFunc compose(DoubleToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsByte(x));
  }

  default FloatToByteFunc compose(FloatToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsByte(x));
  }

  default IntToByteFunc compose(IntToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsByte(x));
  }

  default LongToByteFunc compose(LongToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsByte(x));
  }

  default ShortToByteFunc compose(ShortToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsByte(x));
  }

  default <V> ToByteFunc<V> compose(ToByteFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.applyAsByte(x));
  }
  static ByteUnaryOp identity() { return x -> x; }; 
}
