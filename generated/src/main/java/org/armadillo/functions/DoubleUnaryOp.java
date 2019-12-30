package org.armadillo.functions;

import java.util.Objects;
import java.util.function.*;

public interface DoubleUnaryOp extends DoubleUnaryOperator {


  default DoublePred andThen(DoublePredicate after) {
        Objects.requireNonNull(after);
        return x -> after.test(this.applyAsDouble(x));
  }

  default DoubleToByteFunc andThen(DoubleToByteFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsByte(this.applyAsDouble(x));
  }

  default DoubleToCharFunc andThen(DoubleToCharFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsChar(this.applyAsDouble(x));
  }

  default DoubleUnaryOp andThen(DoubleUnaryOperator after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsDouble(this.applyAsDouble(x));
  }

  default DoubleToFloatFunc andThen(DoubleToFloatFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsFloat(this.applyAsDouble(x));
  }

  default DoubleToIntFunc andThen(DoubleToIntFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsInt(this.applyAsDouble(x));
  }

  default DoubleToLongFunc andThen(DoubleToLongFunction after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsLong(this.applyAsDouble(x));
  }

  default DoubleToShortFunc andThen(DoubleToShortFunc after) {
        Objects.requireNonNull(after);
        return x -> after.applyAsShort(this.applyAsDouble(x));
  }

  default <V> DoubleFunc<V> andThen(DoubleFunction<? extends V> after) {
        Objects.requireNonNull(after);
        return x -> after.apply(this.applyAsDouble(x));
  }

  default BooleanToDoubleFunc compose(BooleanToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsDouble(x));
  }

  default ByteToDoubleFunc compose(ByteToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsDouble(x));
  }

  default CharToDoubleFunc compose(CharToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsDouble(x));
  }

  default DoubleUnaryOp compose(DoubleUnaryOperator before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsDouble(x));
  }

  default FloatToDoubleFunc compose(FloatToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsDouble(x));
  }

  default IntToDoubleFunc compose(IntToDoubleFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsDouble(x));
  }

  default LongToDoubleFunc compose(LongToDoubleFunction before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsDouble(x));
  }

  default ShortToDoubleFunc compose(ShortToDoubleFunc before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsDouble(x));
  }

  default <V> ToDoubleFunc<V> compose(ToDoubleFunction<? super V> before) {
        Objects.requireNonNull(before);
        return x -> this.applyAsDouble(before.applyAsDouble(x));
  }
  static DoubleUnaryOp identity() { return x -> x; }; 
}
