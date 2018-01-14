package func;

public class InputFunction extends ActivationFunction {

  public InputFunction() {}

  @Override
  public Double calculate(Double input) {
    return input;
  }

  @Override
  public ActivationFunction copy() {
    return new InputFunction();
  }

}
