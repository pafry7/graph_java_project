package pl.edu.pk.graph.project.controller;

import edu.uci.ics.jung.visualization.VisualizationViewer;

public interface VertexListener<V> {

    void setVertexAndView(V v, VisualizationViewer visView);
}
