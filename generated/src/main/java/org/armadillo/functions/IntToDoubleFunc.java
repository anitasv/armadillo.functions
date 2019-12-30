package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface IntToDoubleFunc extends IntToDoubleFunction {


  default IntPred andThen(DoublePredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsDouble(x));
  }

  default IntToByteFunc andThen(DoubleToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsDouble(x));
  }

  default IntToCharFunc andThen(DoubleToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsDouble(x));
  }

  default IntToDoubleFunc andThen(DoubleUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsDouble(x));
  }

  default IntToFloatFunc andThen(DoubleToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsDouble(x));
  }

  default IntUnaryOp andThen(DoubleToIntFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsDouble(x));
  }

  default IntToLongFunc andThen(DoubleToLongFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsDouble(x));
  }

  default IntToShortFunc andThen(DoubleToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsDouble(x));
  }

  default <V> IntFunc<V> andThen(DoubleFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsDouble(x));
  }

  default BooleanToDoubleFunc compose(BooleanToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsInt(x));
  }

  default ByteToDoubleFunc compose(ByteToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsInt(x));
  }

  default CharToDoubleFunc compose(CharToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsInt(x));
  }

  default DoubleUnaryOp compose(DoubleToIntFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsInt(x));
  }

  default FloatToDoubleFunc compose(FloatToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsInt(x));
  }

  default IntToDoubleFunc compose(IntUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsInt(x));
  }

  default LongToDoubleFunc compose(LongToIntFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsInt(x));
  }

  default ShortToDoubleFunc compose(ShortToIntFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsInt(x));
  }

  default <V> ToDoubleFunc<V> compose(ToIntFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsInt(x));
  }
}
