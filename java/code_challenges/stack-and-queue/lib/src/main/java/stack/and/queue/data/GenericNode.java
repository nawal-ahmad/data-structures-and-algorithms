package stack.and.queue.data;

public class GenericNode<T> {
  private GenericNode<T> next;
  private T data;

  public GenericNode(T data) {
    this.data = data;
  }

  public GenericNode<T> getNext() {
    return next;
  }

  public void setNext(GenericNode<T> next) {
    this.next = next;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "GenericNode{" +
      "next=" + next +
      ", data=" + data +
      '}';
  }
}
