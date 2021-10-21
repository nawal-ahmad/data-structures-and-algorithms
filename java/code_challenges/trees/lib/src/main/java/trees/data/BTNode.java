package trees.data;

public class BTNode<T> {
  public T value;
  public BTNode<T> left;
  public BTNode<T> right;

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public BTNode<T> getLeft() {
    return left;
  }

  public void setLeft(BTNode<T> left) {
    this.left = left;
  }

  public BTNode<T> getRight() {
    return right;
  }

  public void setRight(BTNode<T> right) {
    this.right = right;
  }

  public BTNode(T value) {
    this.value = value;
  }
}
