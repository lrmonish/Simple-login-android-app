import java.util.*;

public class Main {
    public static void main(String[] args) {

        Graph gr = new Graph();
        gr.addNode(17);
        gr.addNode(7);
        gr.addNode(5);
        gr.addNode(9);
        gr.addNode(22);
        gr.addNode(11);
        gr.addNode(8);
        gr.addNode(15);

        gr.addEdge(17,7);
        gr.addEdge(7,5);
        gr.addEdge(17,8);
        gr.addEdge(17,9);
        gr.addEdge(9,22);
        gr.addEdge(8,25);
        gr.addEdge(8,11);
        gr.addEdge(5,8);


        gr.printNodes();
    }
}


class Graph{

    private Set<Integer> nodesList =  new HashSet<>();

    Map<Integer, List<Integer>> graph = new HashMap<>();

    void addNode(int data){
        nodesList.add(data);
    }

    void addEdge(int from, int to){
        if (!nodesList.contains(from) || !nodesList.contains(to) )
            System.out.println("Node not found");

        graph.putIfAbsent(from, new ArrayList<>());
        graph.get(from).add(to);
    }


    void BFS(){

        BFS((Integer) nodesList.toArray()[0]);
        
    }

    void BFS(int root){
        System.out.println();
    }


    void printNodes(){
        System.out.println(nodesList);
        for ( var i : graph.entrySet()){
            System.out.println(i.getKey()+" => "+i.getValue()
            );
        }
    }



}