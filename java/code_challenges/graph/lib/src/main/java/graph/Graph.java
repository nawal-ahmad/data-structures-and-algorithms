package graph;


import java.util.*;

public class Graph {

  private final Map<Vertex, List<Vertex>> adjacentVertex;

  public Graph() {
    this.adjacentVertex =  new HashMap<>();;
  }

  public Vertex addVertex(String data) {
    Vertex vertex = new Vertex(data);
    adjacentVertex.putIfAbsent(vertex, new ArrayList<>());
    return vertex;
  }

  public void addEdge(String Value1, String value2) {
    Vertex vertex1 = new Vertex(Value1);
    Vertex vertex2 = new Vertex(value2);

    adjacentVertex.get(vertex1).add(vertex2);
    adjacentVertex.get(vertex2).add(vertex1);
  }

  public Set<Vertex> getVertex(){
    return adjacentVertex.keySet();
  }

  public List<Vertex> getNeighbors(String data) {
    return adjacentVertex.get(new Vertex(data));
  }

  public int size() {
    return adjacentVertex.size();
  }

  public List<Vertex> breadthFirst(Vertex root){
    List<Vertex> list = new ArrayList<>();
    Set<Vertex> visited = new HashSet<>();
    List<Vertex> newList = new ArrayList<>();

    newList.add(root);
    visited.add(root);

    while(!newList.isEmpty()){
      Vertex front = newList.get(0);
      newList.remove(0);
      list.add(front);

      for (int i = 0; i < adjacentVertex.get(front).size(); i++) {
        if (! visited.contains(adjacentVertex.get(front).get(i))){
          visited.add(adjacentVertex.get(front).get(i));
          newList.add(adjacentVertex.get(front).get(i));
        }
      }
    }
    int i;
    for (i = 0; i < list.size()-1; i++) {
      System.out.print(list.get(i).data+", ");
    }
    System.out.print(list.get(i).data);
    return list;
  }

}
