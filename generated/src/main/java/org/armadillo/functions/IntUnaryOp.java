package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface IntUnaryOp extends IntUnaryOperator {


  default IntPred andThen(IntPredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsInt(x));
  }

  default IntToByteFunc andThen(IntToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsInt(x));
  }

  default IntToCharFunc andThen(IntToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsInt(x));
  }

  default IntToDoubleFunc andThen(IntToDoubleFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsInt(x));
  }

  default IntToFloatFunc andThen(IntToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsInt(x));
  }

  default IntUnaryOp andThen(IntUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsInt(x));
  }

  default IntToLongFunc andThen(IntToLongFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsInt(x));
  }

  default IntToShortFunc andThen(IntToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsInt(x));
  }

  default <V> IntFunc<V> andThen(IntFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsInt(x));
  }

  default BooleanToIntFunc compose(BooleanToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsInt(x));
  }

  default ByteToIntFunc compose(ByteToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsInt(x));
  }

  default CharToIntFunc compose(CharToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsInt(x));
  }

  default DoubleToIntFunc compose(DoubleToIntFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsInt(x));
  }

  default FloatToIntFunc compose(FloatToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsInt(x));
  }

  default IntUnaryOp compose(IntUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsInt(x));
  }

  default LongToIntFunc compose(LongToIntFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsInt(x));
  }

  default ShortToIntFunc compose(ShortToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsInt(x));
  }

  default <V> ToIntFunc<V> compose(ToIntFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsInt(before.applyAsInt(x));
  }
  static IntUnaryOp identity() { return x -> x; }; 
}
