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
    } else if(head.getValue()==val){
      Node node=new Node(newVal);
      node.setNext(head);
      head=node;
    }else {
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
  }}


//  public void insertBefore(String value, String newValue) {
//      Node current = head;
//      Node newNode = new Node(newValue);
//      while(current.getNext() != null && current.getValue()!=value && current.getValue()!=value){
//        current = current.getNext();
//      }
//      if (current == head){
//        insert(newValue);
//      }else if (current.getNext() !=null){
//          newNode.setNext(current.getNext());
//          current.setNext(newNode);
//      }
//      size++;
//  }

  public void insertAfter(String value, String newValue) {
    Node newNode = new Node(newValue);
    Node current = head;

    while(current.getNext() != null && current.getValue()!=value){
      current = current.getNext();
    }
    if (current.getValue() == value){
      newNode.setNext(current.getNext());
      current.setNext(newNode);
    }
    size++;
  }

  public String kthFromEnd(int k) throws Exception {
    int size = size();
    if (k < 0 || k >= size) {
      throw new Exception("number out of the range");
    }
    int nodeIndex = size-1-k;
    Node current = null;
    if (nodeIndex > 0) {
      current = head;
      for (int i = 1; i < nodeIndex; i++) {
        current = current.getNext();
      }
    }

    return current.getValue();
  }

  public static SinglyLinkedList zipLists(SinglyLinkedList list1, SinglyLinkedList list2){
    Node current1 = list1.head;
    Node current2 = list2.head;
    while(true){
      if(current1 != null && current2 != null) {
        list1.insertAfter(current1.getValue(), current2.getValue());
        current1 = current1.getNext();
        current2 = current2.getNext();
      }else if(current1 == null && current2 != null){
        list1.append((current2.getValue()));
        current2 = current2.getNext();
      }else {
        break;
      }
    }
    return list1;
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


