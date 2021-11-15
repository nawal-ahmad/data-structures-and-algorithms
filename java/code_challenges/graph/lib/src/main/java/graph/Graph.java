package graph;


import java.util.*;

public class Graph {

  private final Map<Vertex, List<Vertex>> adjacentVertex;
  public Map<String, Integer> weightList = new HashMap<>();

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

  public void addEdge(String Value1, String value2, int weight) {
    Vertex NewNode1 = new Vertex(Value1);
    Vertex NewNode2 = new Vertex(value2);

    adjacentVertex.get(NewNode1).add(NewNode2);
    adjacentVertex.get(NewNode2).add(NewNode1);
    weightList.put(Value1 +value2 , weight);
    weightList.put(value2 + Value1 , weight);
  }

//  public void addEdge(String value1, String value2, int weight) {
//    Vertex vertex1 = new Vertex(value1);
//    if (value1.equals(value2)) {
//      adjacentVertex.get(vertex1).add(vertex1);
//      weightList.put(value1 + "->" + value1, 0);
//    } else {
//      Vertex vertex2 = new Vertex (value2);
//      adjacentVertex.get(vertex1).add(vertex2);
//      adjacentVertex.get(vertex2).add(vertex1);
//      weightList.put(value1 + "->" + value2, weight);
//      weightList.put(value2 + "->" + value1, weight);
//    }
//  }


  public String businessTrip(String [] cities) {
    int cost = 0;
    for (int i = 0; i < cities.length -1; i++) {
      if (getNeighbors(cities[i]).contains(new Vertex(cities[i+1]))) {
        cost += weightList.get(cities[i] +cities[i+1]);
      } else {
        return "False,$0";
      }
    }
    return "True"+",$" + cost ;
  }

//  public String businessTrip(String value, String[] arr) {
//    int cost = 0;
//    for (int i = 0; i < arr.length - 1; i++) {
//      if (getNeighbors(arr[i]).contains(new Vertex(arr[i + 1]))) {
//        cost += weightList.get(arr[i] + "->" + arr[i + 1]);
//      } else {
//        return "False, $0";
//      }
//    }
//    return true + ", $" + cost;
//  }

}
