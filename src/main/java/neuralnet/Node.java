package neuralnet;

import java.util.List;
import func.ActivationFunction;

public class Node {

  ActivationFunction function; // Example: Sigmoid activation function.
  Layer target = null;
  Double output;

  Node(ActivationFunction af) {
    this(af, null);
  }

  Node(ActivationFunction af, Layer targ) {
    function = af;
    target = targ;
  }



  public void setTarget(Layer targ) {
    target = targ;
  }

  public void updateForward(List<Double> inputs) {

  }
}
