package stack.and.queue.structure;

import stack.and.queue.data.Node;

public class Stack {
  private Node top;
  private int size;

  public void push(String data) {
    if (isEmpty()) {
      top = new Node(data);
      size++;
    } else {
      Node node = new Node(data);
      node.setNext(top);
      top = node;
      size++;
    }
  }

  public String pop() throws Exception{
    if (isEmpty()) {
      throw new Exception("Stack is Empty");
    } else {
      String data = top.getData();
      top = top.getNext();
      size--;
      return data;
    }
  }

  public String peek() {
    if (isEmpty()) {
      return "The stack is empty";
    } else {
      return top.getData();
    }
  }

  public Node getTop() {
    return top;
  }

  public boolean isEmpty() {
    return top == null;
  }

  public int getSize() {
    return size;
  }

  @Override
  public String toString() {
    return "Stack{" +
      "top=" + top +
      '}';
  }
}



