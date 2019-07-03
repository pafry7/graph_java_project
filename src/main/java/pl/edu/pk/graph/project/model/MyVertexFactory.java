package pl.edu.pk.graph.project.model;

import org.apache.commons.collections15.Factory;

public class MyVertexFactory implements Factory<MyVertex>{
    private  static MyVertexFactory instance = new MyVertexFactory();
    private int nodesNumber = 0;


    private MyVertexFactory(){

    }

    public static MyVertexFactory getInstance(){
        return instance;
    }

    @Override
    public MyVertex create() {
        String name = "V" + this.nodesNumber++;
        MyVertex vert = new MyVertex(name);
        return vert;
    }
}
