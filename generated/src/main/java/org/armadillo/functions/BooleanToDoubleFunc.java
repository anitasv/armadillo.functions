package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface BooleanToDoubleFunc {

  double applyAsDouble(boolean value);

  default BooleanPred andThen(DoublePredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsDouble(x));
  }

  default BooleanToByteFunc andThen(DoubleToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsDouble(x));
  }

  default BooleanToCharFunc andThen(DoubleToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsDouble(x));
  }

  default BooleanToDoubleFunc andThen(DoubleUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsDouble(x));
  }

  default BooleanToFloatFunc andThen(DoubleToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsDouble(x));
  }

  default BooleanToIntFunc andThen(DoubleToIntFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsDouble(x));
  }

  default BooleanToLongFunc andThen(DoubleToLongFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsDouble(x));
  }

  default BooleanToShortFunc andThen(DoubleToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsDouble(x));
  }

  default <V> BooleanFunc<V> andThen(DoubleFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsDouble(x));
  }

  default BooleanToDoubleFunc compose(BooleanPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.test(x));
  }

  default ByteToDoubleFunc compose(BytePred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.test(x));
  }

  default CharToDoubleFunc compose(CharPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.test(x));
  }

  default DoubleUnaryOp compose(DoublePredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.test(x));
  }

  default FloatToDoubleFunc compose(FloatPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.test(x));
  }

  default IntToDoubleFunc compose(IntPredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.test(x));
  }

  default LongToDoubleFunc compose(LongPredicate before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.test(x));
  }

  default ShortToDoubleFunc compose(ShortPred before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.test(x));
  }

  default <V> ToDoubleFunc<V> compose(Predicate<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.test(x));
  }
}
