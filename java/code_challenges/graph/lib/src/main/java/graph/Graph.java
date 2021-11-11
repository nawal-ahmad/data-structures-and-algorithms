package graph;

import java.util.*;

public class Graph {

  private final Map<Vertices, List<Vertices>> adjacentVertex;

  public Graph() {
    this.adjacentVertex =  new HashMap<>();;
  }

  public void addNode(String data) {
    Vertices vertex = new Vertices(data);
    adjacentVertex.putIfAbsent(vertex, new ArrayList<>());
  }

  public void addEdge(String Value1, String value2) {
    Vertices vertex1 = new Vertices(Value1);
    Vertices vertex2 = new Vertices(value2);

    adjacentVertex.get(vertex1).add(vertex2);
    adjacentVertex.get(vertex2).add(vertex1);
  }

  public Set<Vertices> getNodes(){
    return adjacentVertex.keySet();
  }

  public List<Vertices> getNeighbors(String data) {
    return adjacentVertex.get(new Vertices(data));
  }

  public int size() {
    return adjacentVertex.size();
  }
}
