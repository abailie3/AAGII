package neuralnet;

import java.util.ArrayList;
import java.util.List;
import func.ActivationFunction;

public class Node {

  ActivationFunction function; // Example: Sigmoid activation function.
  ArrayList<Layer> target = new ArrayList<Layer>();
  Double output;
  ArrayList<Double> weights;
  Double bias = 0.;

  Node(ActivationFunction af) {
    function = af;
  }

  public void setupWeights(int inputs) {
    weights = new ArrayList<Double>();
    for (int i = 0; i < inputs; ++i) {
      weights.add(0.5);
    }
  }

  public void updateForward(List<Double> inputs) {
    Double input = bias;
    for (int i = 0; i < inputs.size(); ++i) {
      input += inputs.get(i) * weights.get(i);
    }
    output = function.calculate(input);
  }
}
