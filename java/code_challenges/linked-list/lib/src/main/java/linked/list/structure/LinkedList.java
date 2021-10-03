package linked.list.structure;

import linked.list.data.Node;

public class LinkedList {
  private Node head;
  private int size = 0;

  public int size() {
    return size;
  }

  public LinkedList() {

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

    if (size == 0) {
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

}

//  public void printList() {
//    if (head == null) {
//      System.out.println("List is empty");
//    } else {
//      Node current;
//      current = head;
//
//      System.out.print("HEAD -> ");
//
//      while (current != null) {
//        // moves the current reference along the list
//        System.out.print(current + " -> ");
//        current = current.getNext();
//      }
//
//      System.out.println("NULL");
//    }
//  }


