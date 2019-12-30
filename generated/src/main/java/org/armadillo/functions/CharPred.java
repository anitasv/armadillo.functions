package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface CharPred {

  boolean test(char value);

  default CharPred andThen(BooleanPred after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.test(x));
  }

  default CharToByteFunc andThen(BooleanToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.test(x));
  }

  default CharUnaryOp andThen(BooleanToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.test(x));
  }

  default CharToDoubleFunc andThen(BooleanToDoubleFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.test(x));
  }

  default CharToFloatFunc andThen(BooleanToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.test(x));
  }

  default CharToIntFunc andThen(BooleanToIntFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.test(x));
  }

  default CharToLongFunc andThen(BooleanToLongFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.test(x));
  }

  default CharToShortFunc andThen(BooleanToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.test(x));
  }

  default <V> CharFunc<V> andThen(BooleanFunc<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.test(x));
  }

  default BooleanPred compose(BooleanToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsChar(x));
  }

  default BytePred compose(ByteToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsChar(x));
  }

  default CharPred compose(CharUnaryOp before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsChar(x));
  }

  default DoublePred compose(DoubleToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsChar(x));
  }

  default FloatPred compose(FloatToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsChar(x));
  }

  default IntPred compose(IntToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsChar(x));
  }

  default LongPred compose(LongToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsChar(x));
  }

  default ShortPred compose(ShortToCharFunc before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsChar(x));
  }

  default <V> Pred<V> compose(ToCharFunc<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.test(before.applyAsChar(x));
  }
}
