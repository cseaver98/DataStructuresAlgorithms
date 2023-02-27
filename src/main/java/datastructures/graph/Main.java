package datastructures.graph;

import java.util.HashSet;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");
        myGraph.addVertex("E");
        myGraph.addVertex("F");
        myGraph.addVertex("G");
        myGraph.addVertex("H");

        myGraph.addEdge("A", "B");
        myGraph.addEdge("A", "C");
        myGraph.addEdge("A", "D");
        myGraph.addEdge("B", "D");
        myGraph.addEdge("C", "D");
        myGraph.addEdge("D", "E");
        myGraph.addEdge("E", "F");
        myGraph.addEdge("F", "G");
        myGraph.addEdge("F", "H");



        System.out.println("\nGraph:");
        myGraph.printGraph();
        System.out.println("\nDFS:");
        myGraph.printDepthFirstSearch("A", new HashSet<String>());
        System.out.println("\nBFS:");
        myGraph.printBreadthFirstSearch("A", new HashSet<String>(), new PriorityQueue<String>());

    }

}