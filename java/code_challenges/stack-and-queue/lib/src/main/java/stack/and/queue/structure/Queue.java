package stack.and.queue.structure;

import stack.and.queue.data.Node;

public class Queue {
  private Node front;
  private Node back;
  private int size;

  public void enqueue(String data) {
    if (isEmpty()) {
      Node Node = new Node(data);
      front = Node;
      back = Node;
      size++;
    } else {
      Node Node = new Node(data);
      back.setNext(Node);
      back = Node;
      size++;
    }
  }

  public String dequeue() throws Exception{
    if (isEmpty()) {
      throw new Exception("Queue is empty");
    } else {
      String data = front.getData();
      front = front.getNext();
      size--;
      return data;
    }
  }

  public String peek() throws Exception{
    if (isEmpty()){
      throw new Exception("Queue is empty");
    }
    return front.getData();
  }

  public boolean isEmpty() {
    return front == null;
  }

  public int getSize() {
    return size;
  }
}
