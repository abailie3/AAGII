package func.general;

import func.ActivationFunction;

/**
 * The {@link #calculate(Double)} method of the takes an input and returns (1-input) if it is
 * between 0 and 1. If the input is greater than one, the {{@link #calculate(Double)} method returns
 * zero. Conversely if the input is less than zero, the {{@link #calculate(Double)} method returns
 * one.
 * 
 * @author Austin Bailie
 */
public class BoundedInverseLinearFunction implements ActivationFunction {

  public BoundedInverseLinearFunction() {

  }

  public Double calculate(Double input) {
    if (input > 1) {
      return 0.;
    } else if (input < 0) {
      return 1.;
    } else {
      return 1 - input;
    }
  }

  public ActivationFunction copy() {
    return new BoundedInverseLinearFunction();
  }
}
