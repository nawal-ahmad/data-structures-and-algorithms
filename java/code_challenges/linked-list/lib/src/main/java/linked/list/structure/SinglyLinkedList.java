package linked.list.structure;

import linked.list.data.Node;

public class SinglyLinkedList {
  private Node head;
  private int size = 0;

  public int size() {
    return size;
  }

  public SinglyLinkedList() {

  }

  public void insert(String value) {
    Node newNode = new Node(value);
    if (head != null) {
      newNode.setNext(head);
    }
    head = newNode;
    size++;
  }

  public boolean includes(String value) {
    Node current = head;
    while (current != null) {
      if (current.getValue() == value) {
        return true;
      }
      current = current.getNext();
    }
    return false;
  }

  public String toString() {
    String printResult = "";
    Node current = head;
    if (head == null) {
      System.out.println("List is empty");
    }
    while (current != null) {
      printResult += "{ " + current.getValue() + " } -> ";
      current = current.getNext();
    }
    printResult += "Null";
    return printResult;
  }

  public void append(String value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
    } else {
      Node current = head;
      while (current.getNext() != null) {
        current = current.getNext();
      }
      current.setNext(newNode);
    }
    size++;
  }

  public void insertBefore(String val, String newVal) {
    if (head == null) {
      System.out.println("List is Empty");
    } else if (head.getValue() == val) {
      Node node = new Node(newVal);
      node.setNext(head);
      head = node;
      size++;
    } else {
      Node prev = null;
      Node current = head;
      while (current.getValue() != val) {
        prev = current;
        current = current.getNext();
      }
      Node node = new Node(newVal);
      prev.setNext(node);
      node.setNext(current);
      current = node;
      size++;
    }
  }

  public void insertAfter(String val, String newVal) {
    if (head == null) {
      System.out.println("List is empty");
    }
    Node current = head;
    while (current.getValue() != val) {
      current = current.getNext();
    }
    Node node = new Node(newVal);
    node.setNext(current.getNext());
    current.setNext(node);
    size++;
  }

  public String kthFromEnd(int k) throws Exception {
    int size = size();
    if (head == null) {
      System.out.println("List is empty");
    }
    if (k < 0 || k >= size) {
      throw new Exception("number out of the range");
    } else {
      int nodeIndex = size - k - 1;
      Node current = head;
      int counter = 0;
      while (counter != nodeIndex) {
        current = current.getNext();
        counter++;
      }
      return current.getValue();
    }
  }

  public static SinglyLinkedList zipLists(SinglyLinkedList ll1, SinglyLinkedList ll2) {
    SinglyLinkedList out = new SinglyLinkedList();
    Node current1 = ll1.head;
    Node current2 = ll2.head;
    while (current1 != null || current2 != null) {
      if (current1 == null) {
        out.append(current2.getValue());
        current2 = current2.getNext();
      } else if (current2 == null) {
        out.append(current1.getValue());
        current1 = current1.getNext();
      } else {
        out.append(current1.getValue());
        out.append(current2.getValue());

        current1 = current1.getNext();
        current2 = current2.getNext();
      }
    }
    return out;
  }
}

