package pl.edu.pk.graph.project.model;

public class MyVertex {

    private String name;

    public MyVertex(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return this.name;
    }
}
