package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface LongPred extends LongPredicate {


  default LongPred andThen(BooleanPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.test(x));
  }

  default LongToByteFunc andThen(BooleanToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.test(x));
  }

  default LongToCharFunc andThen(BooleanToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.test(x));
  }

  default LongToDoubleFunc andThen(BooleanToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.test(x));
  }

  default LongToFloatFunc andThen(BooleanToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.test(x));
  }

  default LongToIntFunc andThen(BooleanToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.test(x));
  }

  default LongUnaryOp andThen(BooleanToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.test(x));
  }

  default LongToShortFunc andThen(BooleanToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.test(x));
  }

  default <V> LongFunc<V> andThen(BooleanFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.test(x));
  }

  default BooleanPred compose(BooleanToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsLong(x));
  }

  default BytePred compose(ByteToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsLong(x));
  }

  default CharPred compose(CharToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsLong(x));
  }

  default DoublePred compose(DoubleToLongFunction before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsLong(x));
  }

  default FloatPred compose(FloatToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsLong(x));
  }

  default IntPred compose(IntToLongFunction before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsLong(x));
  }

  default LongPred compose(LongUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsLong(x));
  }

  default ShortPred compose(ShortToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsLong(x));
  }

  default <V> Pred<V> compose(ToLongFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsLong(x));
  }
}
