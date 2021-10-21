package trees.structure;


import trees.data.BTNode;

import java.util.ArrayList;


public class BinaryTree<T> {
  BTNode<T> root;
  ArrayList<T> preOrderList = new ArrayList<>();
  ArrayList<T> inOrderList = new ArrayList<>();
  ArrayList<T> postOrderList = new ArrayList<>();

  public BTNode<T> getRoot() {
    return root;
  }

  public void setRoot(BTNode<T> root) {
    this.root = root;
  }

  public BinaryTree() {

  }

  public BinaryTree(T value) {
    this.root = new BTNode<>(value);
  }

  public ArrayList<T> preOrder(BTNode<T> root) {
    if (root != null) {
      this.preOrderList.add(root.value);
      if (root.left != null) {
        preOrder(root.left);
      }
      if (root.right != null) {
        preOrder(root.right);
      }
    }
    return this.preOrderList;
  }

  public ArrayList<T> inOrder(BTNode<T> root) {
    if (root != null) {
      if (root.left != null) {
        inOrder(root.left);
      }
      this.inOrderList.add(root.value);
      if (root.right != null) {
        inOrder(root.right);
      }
    }
    return this.inOrderList;
  }

  public ArrayList<T> postOrder(BTNode<T> root) {
    if (root != null) {
      if (root.left != null) {
        postOrder(root.left);
      }
      if (root.right != null) {
        postOrder(root.right);
      }
      this.postOrderList.add(root.value);
    }
    return this.postOrderList;
  }

  public Integer maximum() {
    Integer max = 0;
    ArrayList<T> list = preOrder(this.root);
    for (T t : list) {
      if (max < (Integer) t) {
        max = (Integer) t;
      }
    }
    return max;
  }

  public Integer summation() {
    BTNode node = root;
    int sum = 0;
    ArrayList<Integer> list = (ArrayList<Integer>) postOrder((BTNode<T>) node);
    if (node.value == null) {
      return -1;
    }
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) % 2 != 0) {
        sum += list.get(i);
      }
    }
    return sum;
  }

  public void BreadthFirst() {
    if (root != null) {
      Queue<BTNode> queue = new Queue<>();
      queue.enqueue(root);
      BTNode node;
      while (!queue.isEmpty()) {
        node = queue.dequeue();
        System.out.print(node.value + " => ");
        if (node.left != null) {
          queue.enqueue(node.left);
        }

        if (node.right != null) {
          queue.enqueue(node.right);
        }
      }
    } else {
      System.out.println("Tree empty");
    }
  }
}

