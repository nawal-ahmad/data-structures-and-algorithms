package graph;

import java.util.Objects;

public class Vertices {

  public String data;
  public int weight ;

  public Vertices(String data) {
    this.data = data;
  }

  public Vertices(String data, int weight) {
    this.data = data;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Vertex{" +
      "label='" + data + '\'' + ',' +
      " weight=" + weight +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Vertices vertex = (Vertices) o;
    return Objects.equals(data, vertex.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }
}
