package pl.edu.pk.graph.project.controller;

import pl.edu.pk.graph.project.model.*;

import javax.swing.*;

public class MyMouse {

    public static class EdgeMenu extends JPopupMenu {

        public EdgeMenu(final JFrame frame) {
            super("Edge Menu");
            this.add(new DeleteEdgeItem<MyEdge>());

        }

    }

    public static class VertexMenu extends JPopupMenu {

        public VertexMenu() {
            super("Vertex Menu");
            this.add(new DeleteVertexItem<MyVertex>());

        }
    }

}
