package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface IntPred extends IntPredicate {


  default IntPred andThen(BooleanPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.test(x));
  }

  default IntToByteFunc andThen(BooleanToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.test(x));
  }

  default IntToCharFunc andThen(BooleanToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.test(x));
  }

  default IntToDoubleFunc andThen(BooleanToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.test(x));
  }

  default IntToFloatFunc andThen(BooleanToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.test(x));
  }

  default IntUnaryOp andThen(BooleanToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.test(x));
  }

  default IntToLongFunc andThen(BooleanToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.test(x));
  }

  default IntToShortFunc andThen(BooleanToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.test(x));
  }

  default <V> IntFunc<V> andThen(BooleanFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.test(x));
  }

  default BooleanPred compose(BooleanToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsInt(x));
  }

  default BytePred compose(ByteToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsInt(x));
  }

  default CharPred compose(CharToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsInt(x));
  }

  default DoublePred compose(DoubleToIntFunction before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsInt(x));
  }

  default FloatPred compose(FloatToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsInt(x));
  }

  default IntPred compose(IntUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsInt(x));
  }

  default LongPred compose(LongToIntFunction before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsInt(x));
  }

  default ShortPred compose(ShortToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsInt(x));
  }

  default <V> Pred<V> compose(ToIntFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsInt(x));
  }
}
