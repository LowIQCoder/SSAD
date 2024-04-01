import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Graph<Integer> graph = new Graph<Integer>();
        for (int i = 0; i < n; i++) {
            Vertex<Integer> v = new Vertex<Integer>(i);
            graph.addVertex(v);
        }
        for (int i = 0; i < n; i++) {
            for (int q = 0; q < n; q++) {
                Boolean wayExists = Boolean.parseBoolean(scanner.next());
                if (wayExists) {
                    graph.addEdge(i, q);
                }
            }
        }
        graph.DFS();
        scanner.close();
    }
}

class Graph<T extends Comparable<T>> {
    ArrayList<Vertex<T>> vertices;
    ArrayList<Edge<T>> edges;
    public void addVertex(Vertex<T> v) {
        this.vertices.add(v);
    }
    public void removeVertex(Vertex<T> v) {
        this.vertices.remove(v);
    }
    public void addEdge(T k1, T k2) {
        Vertex<T> v1 = null;
        Vertex<T> v2 = null;
        for (int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i).getKey() == k1) {
                v1 = vertices.get(i);
            }
            if (vertices.get(i).getKey() == k2) {
                v2 = vertices.get(i);
            }
        }
        if (v1 == null || v2 == null) {
            System.err.println("No vertex exists");
        }
        Edge<T> e = new Edge<T>(v1, v2);
        v1.addEdge(e);
        v2.addEdge(e);
        this.edges.add(e);
    }
    public void removeEdge(Vertex<T> v1, Vertex<T> v2) {
        return;
    }
    public void DFS() {

    }
}
class Edge<T extends Comparable<T>> {
    Vertex<T> first;
    Vertex<T> second;
    Edge(Vertex<T> v1, Vertex<T> v2) {
        this.first = v1;
        this.second = v2;
    }
}
class Vertex<T extends Comparable<T>> {
    private T value;
    List<Edge<T>> adjacencyList;
    Vertex(T key) {
        this.value = key;
    }
    public void setValue(T v) {
        this.value = v;
    }
    public T getValue() {
        return this.value;
    }
    public void addEdge(Edge<T> e) {
        this.adjacencyList.add(e);
    }
    public void removeEdge(Edge<T> e) {
        this.adjacencyList.remove(e);
    }
    public T getKey() {
        return this.value;
    }
}
