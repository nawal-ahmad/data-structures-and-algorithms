package trees.data;

public class BTNode<T> {
  public T value;
  public BTNode<T> left;
  public BTNode<T> right;


  public BTNode(T value) {
    this.value = value;
  }
}
