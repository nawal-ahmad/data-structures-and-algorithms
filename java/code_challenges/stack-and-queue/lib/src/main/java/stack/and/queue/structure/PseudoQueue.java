package stack.and.queue.structure;

import stack.and.queue.data.Node;

public class PseudoQueue {
    private int size;
    Stack instance1 = new Stack();
    Stack instance2 = new Stack();

    public void enqueue(String value) throws Exception {
      while (true) {
        if (!instance1.isEmpty()) {
          instance2.push(instance1.pop());
        } else {
          break;
        }
      }
      instance1.push(value);
      while (true) {
        if (!instance2.isEmpty()) {
          instance1.push(instance2.pop());
        } else {
          break;
        }
      }
      size++;
    }

    public String dequeue() throws Exception {
      String returnValue = null;
      if (!instance1.isEmpty()) {
        returnValue = instance1.getTop().getData();
        instance1.pop();
        size--;

      }
      return returnValue;
    }


  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }
}
