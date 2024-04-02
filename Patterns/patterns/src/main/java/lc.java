// Marsel Berheev
import java.util.ArrayList;
import java.util.Scanner;

public class lc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Graph<Integer> graph = new Graph<Integer>();
        for (int i = 0; i < n; i++) {
            graph.addVertex(i);
        }
        for (int i = 0; i < n; i++) {
            for (int q = 0; q < n; q++) {
                if (scanner.nextInt() == 1) {
                    graph.addEdge(i, q);
                }
            }
        }
        ArrayList <Integer> path = graph.MarselBerheev_dfs(1, n);
        if (path.size() != n) {
            System.out.println("NO");
            scanner.close();
            return;
        }
        System.out.println("YES");
        scanner.close();
    }
}

class Graph<T extends Integer> {
    Vertex<T> rootVertex;
    public void addVertex(T key) {
        Vertex<T> newVertex = new Vertex<>(key);
        if (this.rootVertex == null) {
            this.rootVertex = newVertex;
            return;
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
            next = next.nextVertex;
        }

        Edge<T> e = new Edge<T>(v1, v2);
        v1.addEdge(e);
        v2.addEdge(e);
    }
    public void MarselBerheev_dfs_rec(T start, boolean isVisited[], ArrayList<Integer> visited) {
        isVisited[start] = true;
        visited.add(start);
        // Looking for vertex
        Vertex<T> next = this.rootVertex;
        Vertex<T> v1 = null;
        while (next != null) {
            if (next.getKey() == start) {
                v1 = next;
            }
            next = next.nextVertex;
        }

        Edge<T> curEdge = v1.rootEdge;
        while (curEdge.nextEdge != null) {
            T n = curEdge.to.getKey();

            if (!isVisited[n]) {    
                MarselBerheev_dfs_rec(n, isVisited, visited);
            }
            curEdge = curEdge.nextEdge;
        }
    }
    public ArrayList<Integer> MarselBerheev_dfs(T start, int numOfVertices) {
        boolean isVisited[] = new boolean[numOfVertices];
        ArrayList<Integer> visited = new ArrayList<>();
        MarselBerheev_dfs_rec(start, isVisited, visited);
        return visited;
    }
}
class Edge<T extends Integer> {
    Vertex<T> from;
    Vertex<T> to;
    Edge<T> nextEdge;
    Edge<T> prevEdge;
    Edge(Vertex<T> v1, Vertex<T> v2) {
        this.from = v1;
        this.to = v2;
    }
}
class Vertex<T extends Integer> {
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
            return;
        }

        this.rootEdge.prevEdge = e;
        e.nextEdge = this.rootEdge;
        this.rootEdge = e;
    }
    public T getKey() {
        return this.value;
    }
}
