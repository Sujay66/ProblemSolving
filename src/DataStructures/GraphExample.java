package DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class Graph {
    class Edge {
        int vertex;
        int weight;

        public Edge(int x, int y) {
            this.vertex = x;
            this.weight = y;
        }
    }

    ArrayList<Edge>[] graph;

    public Graph(int n) {
        graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<Edge>();
        }
    }
    public boolean isConnected(int u,int v)  {
        for(Edge e:graph[u]){
            if(e.vertex == v) return true;
        }
        return false;
    }
    public void addEdge(int u,int v,int w){
        graph[u].add(new Edge(v,w));
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < graph.length; i++) {
            result += i + "-->" ;
                 for(Edge j:graph[i]){
                    result+=j.vertex+",";
                 }
              result+= "\n";
        }
        return result;
    }
}

public class GraphExample{
     public static void main(String[] args){
         Graph graph = new Graph(3);
         graph.addEdge(0,1,2);
         graph.addEdge(2,0,3);
         graph.addEdge(1,2,5);

         System.out.println(graph);
         System.out.println(graph.isConnected(2,0));
     }
}