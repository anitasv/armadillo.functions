package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface BooleanToByteFunc {

  byte applyAsByte(boolean value);

  default BooleanPred andThen(BytePred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsByte(x));
  }

  default BooleanToByteFunc andThen(ByteUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsByte(x));
  }

  default BooleanToCharFunc andThen(ByteToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsByte(x));
  }

  default BooleanToDoubleFunc andThen(ByteToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsByte(x));
  }

  default BooleanToFloatFunc andThen(ByteToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsByte(x));
  }

  default BooleanToIntFunc andThen(ByteToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsByte(x));
  }

  default BooleanToLongFunc andThen(ByteToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsByte(x));
  }

  default BooleanToShortFunc andThen(ByteToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsByte(x));
  }

  default <V> BooleanFunc<V> andThen(ByteFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsByte(x));
  }

  default BooleanToByteFunc compose(BooleanPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.test(x));
  }

  default ByteUnaryOp compose(BytePred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.test(x));
  }

  default CharToByteFunc compose(CharPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.test(x));
  }

  default DoubleToByteFunc compose(DoublePredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.test(x));
  }

  default FloatToByteFunc compose(FloatPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.test(x));
  }

  default IntToByteFunc compose(IntPredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.test(x));
  }

  default LongToByteFunc compose(LongPredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.test(x));
  }

  default ShortToByteFunc compose(ShortPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.test(x));
  }

  default <V> ToByteFunc<V> compose(Predicate<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsByte(before.test(x));
  }
}
