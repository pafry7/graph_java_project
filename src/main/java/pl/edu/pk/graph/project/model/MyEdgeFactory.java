package pl.edu.pk.graph.project.model;

import org.apache.commons.collections4.Factory;

public class MyEdgeFactory implements Factory<MyEdge>{

    private int edgeNumber = 0;
    private static MyEdgeFactory instance = new MyEdgeFactory();

    private MyEdgeFactory(){

    }

    public static MyEdgeFactory getInstance(){
        return instance;
    }

    public MyEdge create(){
        String name = "E" + this.edgeNumber++;
        MyEdge edge = new MyEdge(name);
        return edge;
    }

}
