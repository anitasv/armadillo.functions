package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface BooleanToCharFunc {

  char applyAsChar(boolean value);

  default BooleanPred andThen(CharPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsChar(x));
  }

  default BooleanToByteFunc andThen(CharToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsChar(x));
  }

  default BooleanToCharFunc andThen(CharUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsChar(x));
  }

  default BooleanToDoubleFunc andThen(CharToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsChar(x));
  }

  default BooleanToFloatFunc andThen(CharToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsChar(x));
  }

  default BooleanToIntFunc andThen(CharToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsChar(x));
  }

  default BooleanToLongFunc andThen(CharToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsChar(x));
  }

  default BooleanToShortFunc andThen(CharToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsChar(x));
  }

  default <V> BooleanFunc<V> andThen(CharFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsChar(x));
  }

  default BooleanToCharFunc compose(BooleanPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.test(x));
  }

  default ByteToCharFunc compose(BytePred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.test(x));
  }

  default CharUnaryOp compose(CharPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.test(x));
  }

  default DoubleToCharFunc compose(DoublePredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.test(x));
  }

  default FloatToCharFunc compose(FloatPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.test(x));
  }

  default IntToCharFunc compose(IntPredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.test(x));
  }

  default LongToCharFunc compose(LongPredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.test(x));
  }

  default ShortToCharFunc compose(ShortPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.test(x));
  }

  default <V> ToCharFunc<V> compose(Predicate<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsChar(before.test(x));
  }
}
