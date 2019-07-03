package pl.edu.pk.graph.project.controller;

import edu.uci.ics.jung.visualization.VisualizationViewer;

public interface EdgeListener<E> {

    void setEdgeAndView(E e, VisualizationViewer visView);
}

