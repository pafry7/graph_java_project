package pl.edu.pk.graph.project.model;

public class MyEdge {

    private String name;

    public MyEdge(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name;
    }

}
