package pl.edu.pk.graph.project;


import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.algorithms.layout.StaticLayout;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import javax.swing.*;
import java.awt.*;

import edu.uci.ics.jung.visualization.control.EditingModalGraphMouse;
import edu.uci.ics.jung.visualization.control.ModalGraphMouse;
import pl.edu.pk.graph.project.model.*;

public class App
{
    public static void main( String[] args )
    {


        JFrame frame = new JFrame("Graph Editor Demo");

        Graph<MyVertex, MyEdge> g =  new SparseMultigraph<>();

        Layout<MyVertex, MyEdge> layout = new StaticLayout(g);
        layout.setSize(new Dimension(300, 300));

        VisualizationViewer<MyVertex, MyEdge> vv = new VisualizationViewer<>(layout);
        vv.setPreferredSize(new Dimension(350, 350));

        EditingModalGraphMouse gm = new EditingModalGraphMouse(vv.getRenderContext(),MyVertexFactory.getInstance(), MyEdgeFactory.getInstance());

        vv.setGraphMouse(gm);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(vv);

        //menu
        JMenuBar menuBar = new JMenuBar();
        JMenu modeMenu = gm.getModeMenu();
        modeMenu.setText("Mode");
        modeMenu.setIcon(null);
        modeMenu.setPreferredSize(new Dimension(80,20));

        menuBar.add(modeMenu);
        frame.setJMenuBar(menuBar);
        gm.setMode(ModalGraphMouse.Mode.EDITING);

        frame.pack();
        frame.setVisible(true);
    }
}
