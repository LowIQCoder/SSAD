// Marsel Berheev
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
        }
        for (int i = 0; i < n; i++) {
            for (int q = 0; q < n; q++) {
                Boolean wayExists = Boolean.parseBoolean(scanner.next());
                if (wayExists) {
                    graph.addEdge(i, q);
                }
            }
        }
        graph.MarselBerheev_dfs(0);
        scanner.close();
    }
}

class Graph<T extends Comparable<T>> {
    Vertex<T> rootVertex;
    public void addVertex(T key) {
        Vertex<T> newVertex = new Vertex<>(key);
        if (this.rootVertex == null) {
            this.rootVertex = newVertex;
        }

        this.rootVertex.prevVertex = newVertex;
        newVertex.nextVertex = this.rootVertex;
        this.rootVertex = newVertex;
    }
    public void addEdge(T k1, T k2) {
        Vertex<T> v1 = null;
        Vertex<T> v2 = null;
        Vertex<T> next = this.rootVertex;
        while (next != null) {
            if (next.getKey() == k1) {
                v1 = next;
            }
            if (next.getKey() == k2) {
                v2 = next;
            }
        }

        Edge<T> e = new Edge<T>(v1, v2);
        v1.addEdge(e);
        v2.addEdge(e);
    }
    public void MarselBerheev_dfs(T start) {
                
    }
}
class Edge<T extends Comparable<T>> {
    Vertex<T> from;
    Vertex<T> to;
    Edge<T> nextEdge;
    Edge<T> prevEdge;
    Edge(Vertex<T> v1, Vertex<T> v2) {
        this.from = v1;
        this.to = v2;
    }
}
class Vertex<T extends Comparable<T>> {
    private T value;
    Edge<T> rootEdge;
    Vertex<T> nextVertex;
    Vertex<T> prevVertex;
    Vertex(T key) {
        this.value = key;
    }
    public void addEdge(Edge<T> e) {
        if (this.rootEdge == null) {
            this.rootEdge = e;
        }

        this.rootEdge.prevEdge = e;
        e.nextEdge = this.rootEdge;
        this.rootEdge = e;
    }
    public T getKey() {
        return this.value;
    }
}
