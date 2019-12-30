package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface LongToIntFunc extends LongToIntFunction {


  default LongPred andThen(IntPredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsInt(x));
  }

  default LongToByteFunc andThen(IntToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsInt(x));
  }

  default LongToCharFunc andThen(IntToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsInt(x));
  }

  default LongToDoubleFunc andThen(IntToDoubleFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsInt(x));
  }

  default LongToFloatFunc andThen(IntToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsInt(x));
  }

  default LongToIntFunc andThen(IntUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsInt(x));
  }

  default LongUnaryOp andThen(IntToLongFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsInt(x));
  }

  default LongToShortFunc andThen(IntToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsInt(x));
  }

  default <V> LongFunc<V> andThen(IntFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsInt(x));
  }

  default BooleanToIntFunc compose(BooleanToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsLong(x));
  }

  default ByteToIntFunc compose(ByteToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsLong(x));
  }

  default CharToIntFunc compose(CharToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsLong(x));
  }

  default DoubleToIntFunc compose(DoubleToLongFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsLong(x));
  }

  default FloatToIntFunc compose(FloatToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsLong(x));
  }

  default IntUnaryOp compose(IntToLongFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsLong(x));
  }

  default LongToIntFunc compose(LongUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsLong(x));
  }

  default ShortToIntFunc compose(ShortToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsLong(x));
  }

  default <V> ToIntFunc<V> compose(ToLongFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsLong(x));
  }
}
