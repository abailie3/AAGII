package neuralnet;

import java.util.List;
import func.ActivationFunction;
import func.nn.InputFunction;

public class LayerFactory {

  public Layer createSpecialized(List<ActivationFunction> activation_fxns) {
    Layer out = new Layer();
    for (ActivationFunction act : activation_fxns) {
      out.addNode(act);
    }
    return out;
  }

  public Layer createHomogenous(ActivationFunction example, int nodes) {
    Layer out = new Layer();
    for (int i = 0; i < nodes; ++i) {
      out.addNode(example.copy());
    }
    return out;
  }

  public Layer createInputLayer(int inputs) {
    Layer out = new Layer();
    for (int i = 0; i < inputs; ++i) {
      out.addNode(new InputFunction());
    }
    return out;
  }

}
