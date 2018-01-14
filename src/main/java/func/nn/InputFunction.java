package func.nn;

import func.ActivationFunction;

public class InputFunction implements ActivationFunction {

  public InputFunction() {}

  public Double calculate(Double input) {
    return input;
  }

  public ActivationFunction copy() {
    return new InputFunction();
  }

}
