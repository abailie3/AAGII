package func;


/*
 * The Activation function interface. Commonly used with the neuralnet package.
 */
public interface ActivationFunction extends Cloneable {
  public abstract Double calculate(Double input);

  public abstract ActivationFunction copy();
}
