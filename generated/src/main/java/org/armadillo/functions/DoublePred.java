package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface DoublePred extends DoublePredicate {


  default DoublePred andThen(BooleanPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.test(x));
  }

  default DoubleToByteFunc andThen(BooleanToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.test(x));
  }

  default DoubleToCharFunc andThen(BooleanToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.test(x));
  }

  default DoubleUnaryOp andThen(BooleanToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.test(x));
  }

  default DoubleToFloatFunc andThen(BooleanToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.test(x));
  }

  default DoubleToIntFunc andThen(BooleanToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.test(x));
  }

  default DoubleToLongFunc andThen(BooleanToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.test(x));
  }

  default DoubleToShortFunc andThen(BooleanToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.test(x));
  }

  default <V> DoubleFunc<V> andThen(BooleanFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.test(x));
  }

  default BooleanPred compose(BooleanToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsDouble(x));
  }

  default BytePred compose(ByteToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsDouble(x));
  }

  default CharPred compose(CharToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsDouble(x));
  }

  default DoublePred compose(DoubleUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsDouble(x));
  }

  default FloatPred compose(FloatToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsDouble(x));
  }

  default IntPred compose(IntToDoubleFunction before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsDouble(x));
  }

  default LongPred compose(LongToDoubleFunction before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsDouble(x));
  }

  default ShortPred compose(ShortToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsDouble(x));
  }

  default <V> Pred<V> compose(ToDoubleFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsDouble(x));
  }
}
