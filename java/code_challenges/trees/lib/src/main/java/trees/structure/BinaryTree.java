package trees.structure;

import trees.data.Node;

import java.util.ArrayList;

public class BinaryTree <T>{
  Node<T> root;
  ArrayList<T> preOrderList = new ArrayList<>();
  ArrayList<T> inOrderList = new ArrayList<>();
  ArrayList<T> postOrderList = new ArrayList<>();

  public BinaryTree() {

  }
  public BinaryTree(T value) {
    this.root = new Node<>(value);
  }

  public ArrayList<T> preOrder(Node<T> root){
    if(root != null){
      this.preOrderList.add(root.value);
      if (root.left != null){
        preOrder(root.left);
      }
      if (root.right != null) {
        preOrder(root.right);
      }}
    return this.preOrderList;
  }

  public ArrayList<T> inOrder(Node<T> root){
    if(root != null){
      if (root.left != null){
        inOrder(root.left);
      }
      this.inOrderList.add(root.value);
      if (root.right != null) {
        inOrder(root.right);
      }
    }
    return this.inOrderList;
  }

  public ArrayList<T> postOrder(Node<T> root){
    if(root != null){
      if (root.left != null){
        postOrder(root.left);
      }
      if (root.right != null) {
        postOrder(root.right);
      }
      this.postOrderList.add(root.value);
    }
    return this.postOrderList;
  }

}
