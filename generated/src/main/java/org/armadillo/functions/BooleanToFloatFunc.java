package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface BooleanToFloatFunc {

  float applyAsFloat(boolean value);

  default BooleanPred andThen(FloatPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsFloat(x));
  }

  default BooleanToByteFunc andThen(FloatToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsFloat(x));
  }

  default BooleanToCharFunc andThen(FloatToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsFloat(x));
  }

  default BooleanToDoubleFunc andThen(FloatToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsFloat(x));
  }

  default BooleanToFloatFunc andThen(FloatUnaryOp after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsFloat(x));
  }

  default BooleanToIntFunc andThen(FloatToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsFloat(x));
  }

  default BooleanToLongFunc andThen(FloatToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsFloat(x));
  }

  default BooleanToShortFunc andThen(FloatToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsFloat(x));
  }

  default <V> BooleanFunc<V> andThen(FloatFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsFloat(x));
  }

  default BooleanToFloatFunc compose(BooleanPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.test(x));
  }

  default ByteToFloatFunc compose(BytePred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.test(x));
  }

  default CharToFloatFunc compose(CharPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.test(x));
  }

  default DoubleToFloatFunc compose(DoublePredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.test(x));
  }

  default FloatUnaryOp compose(FloatPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.test(x));
  }

  default IntToFloatFunc compose(IntPredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.test(x));
  }

  default LongToFloatFunc compose(LongPredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.test(x));
  }

  default ShortToFloatFunc compose(ShortPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.test(x));
  }

  default <V> ToFloatFunc<V> compose(Predicate<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsFloat(before.test(x));
  }
}
