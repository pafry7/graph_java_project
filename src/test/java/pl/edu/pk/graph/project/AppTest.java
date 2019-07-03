package pl.edu.pk.graph.project;

import static org.junit.Assert.*;

import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;

import org.junit.Before;
import org.junit.Test;
import pl.edu.pk.graph.project.model.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private MyVertex vert;
    private MyEdgeFactory mef;
    private MyVertexFactory mvf;
    private Graph<MyVertex,MyEdge> g;

    @Before
    public void setup(){
        vert = new MyVertex("test");
        mef = MyEdgeFactory.getInstance();
        mvf = MyVertexFactory.getInstance();
        g =  new SparseMultigraph<>();
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        assertTrue( true );
    }


    @Test
    public void shouldReturnProperName(){

        assertTrue(vert.getName().equals("test"));
    }

    @Test
    public void shouldCreateProperEdge(){

        assertTrue(mef.create().getName().equals("E0") && mef.create().getName().equals("E1"));

    }
    @Test
    public void shouldCreateProperVertex(){

        assertTrue(mvf.create().getName().equals("V0") && mvf.create().getName().equals("V1"));

    }

    @Test
    public void shouldAddVertex(){
        g.addVertex(new MyVertex("K1"));
        g.addVertex(new MyVertex("K2"));
        g.addVertex(new MyVertex("K3"));
        assertTrue(g.getVertexCount() == 3);
    }

    @Test
    public void shouldReturnProperDegree(){
        MyVertex v1 = new MyVertex("K1");
        MyVertex v2 = new MyVertex("K2");
        g.addEdge(new MyEdge("E22"), v1, v2);
        assertTrue(g.inDegree(v1) == 1);

    }





}
