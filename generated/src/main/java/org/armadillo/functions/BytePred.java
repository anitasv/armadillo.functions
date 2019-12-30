package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface BytePred {

  boolean test(byte value);

  default BytePred andThen(BooleanPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.test(x));
  }

  default ByteUnaryOp andThen(BooleanToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.test(x));
  }

  default ByteToCharFunc andThen(BooleanToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.test(x));
  }

  default ByteToDoubleFunc andThen(BooleanToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.test(x));
  }

  default ByteToFloatFunc andThen(BooleanToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.test(x));
  }

  default ByteToIntFunc andThen(BooleanToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.test(x));
  }

  default ByteToLongFunc andThen(BooleanToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.test(x));
  }

  default ByteToShortFunc andThen(BooleanToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.test(x));
  }

  default <V> ByteFunc<V> andThen(BooleanFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.test(x));
  }

  default BooleanPred compose(BooleanToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsByte(x));
  }

  default BytePred compose(ByteUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsByte(x));
  }

  default CharPred compose(CharToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsByte(x));
  }

  default DoublePred compose(DoubleToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsByte(x));
  }

  default FloatPred compose(FloatToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsByte(x));
  }

  default IntPred compose(IntToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsByte(x));
  }

  default LongPred compose(LongToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsByte(x));
  }

  default ShortPred compose(ShortToByteFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsByte(x));
  }

  default <V> Pred<V> compose(ToByteFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsByte(x));
  }
}
