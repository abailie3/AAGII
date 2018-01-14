package func.general;

import func.ActivationFunction;

/**
 * The {@link #calculate(Double)} method of the takes an input and returns said input if it is
 * between 0 and 1. If the input is greater than one, the {{@link #calculate(Double)} method returns
 * one. Conversely if the input is less than zero, the {{@link #calculate(Double)} method returns
 * zero.
 * 
 * @author Austin Bailie
 */
public class BoundedLinearFunction implements ActivationFunction {

  public BoundedLinearFunction() {

  }

  public Double calculate(Double input) {
    if (input > 1) {
      return 1.;
    } else if (input < 0) {
      return 0.;
    } else {
      return input;
    }
  }

  public ActivationFunction copy() {
    return new BoundedLinearFunction();
  }

}
