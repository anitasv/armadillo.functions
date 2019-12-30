package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface LongUnaryOp extends LongUnaryOperator {


  default LongPred andThen(LongPredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsLong(x));
  }

  default LongToByteFunc andThen(LongToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsLong(x));
  }

  default LongToCharFunc andThen(LongToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsLong(x));
  }

  default LongToDoubleFunc andThen(LongToDoubleFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsLong(x));
  }

  default LongToFloatFunc andThen(LongToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsLong(x));
  }

  default LongToIntFunc andThen(LongToIntFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsLong(x));
  }

  default LongUnaryOp andThen(LongUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsLong(x));
  }

  default LongToShortFunc andThen(LongToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsLong(x));
  }

  default <V> LongFunc<V> andThen(LongFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsLong(x));
  }

  default BooleanToLongFunc compose(BooleanToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsLong(x));
  }

  default ByteToLongFunc compose(ByteToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsLong(x));
  }

  default CharToLongFunc compose(CharToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsLong(x));
  }

  default DoubleToLongFunc compose(DoubleToLongFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsLong(x));
  }

  default FloatToLongFunc compose(FloatToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsLong(x));
  }

  default IntToLongFunc compose(IntToLongFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsLong(x));
  }

  default LongUnaryOp compose(LongUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsLong(x));
  }

  default ShortToLongFunc compose(ShortToLongFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsLong(x));
  }

  default <V> ToLongFunc<V> compose(ToLongFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsLong(before.applyAsLong(x));
  }
  static LongUnaryOp identity() { return x -> x; }; 
}
