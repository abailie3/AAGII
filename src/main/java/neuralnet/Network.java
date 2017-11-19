package neuralnet;

import java.util.ArrayList;

public class Network {
  Layer inputLayer;
  ArrayList<Layer> hiddenLayers = new ArrayList<Layer>();
  Layer outputLayer;
  LayerFactory lf = new LayerFactory();

  Network(int inputs) {
    inputLayer = lf.createInputLayer(inputs);
  }

  public void setOutputLayer(Layer output) {
    outputLayer = output;
  }

  public void addHiddenLayer(Layer to_add) {
    hiddenLayers.add(to_add);
  }


}
