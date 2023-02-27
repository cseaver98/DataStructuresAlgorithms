package datastructures.graph;

import java.util.*;

public class Graph {

    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public void printGraph() {
        System.out.println(adjList);
    }

    public boolean addVertex(String vertex) {
        if (adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2) {
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex) {
        if (adjList.get(vertex) != null) {
            for (String str : adjList.get(vertex)) {
                adjList.get(str).remove(vertex);
            }
            adjList.remove(vertex);
            return true;
        }
        return false;
    }

    public void printDepthFirstSearch(String vertex, Set visited) {
        Stack<String> stack = new Stack<>();
        visited.add(vertex);
        stack.push(vertex);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
            for (String neighbor : adjList.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                    visited.add(neighbor);
                    vertex = neighbor;
                }
            }
        }
    }

    public void printBreadthFirstSearch(String vertex, Set visited, Queue queue) {
        queue.add(vertex);
        visited.add(vertex);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
            for (String neighbor : adjList.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                    vertex = neighbor;
                }
            }
        }
    }
}
