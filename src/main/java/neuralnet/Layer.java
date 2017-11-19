package neuralnet;

import java.util.ArrayList;
import java.util.List;
import func.ActivationFunction;

public class Layer {
  ArrayList<Node> members = new ArrayList<Node>();
  ArrayList<Node> sources = new ArrayList<Node>();

  Layer() {}

  public void addNode(ActivationFunction fxn) {
    members.add(new Node(fxn));
  }

  public void updateForeward() {
    List<Double> inputs = getInputs();
    for (Node member : members) {
      member.updateForward(inputs);
    }
  }

  public void addSource(Node source) {
    sources.add(source);
  }

  List<Double> getInputs() {
    ArrayList<Double> inputs = new ArrayList<Double>();
    for (Node source : sources) {
      inputs.add(source.output);
    }
    return inputs;
  }
}
