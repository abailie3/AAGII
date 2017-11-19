package func;

public abstract class ActivationFunction implements Cloneable {
  public abstract Double calculate(Double input);

  public abstract ActivationFunction copy();
}
