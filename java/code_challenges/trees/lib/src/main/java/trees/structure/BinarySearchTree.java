package trees.structure;

import trees.data.BTNode;

public class BinarySearchTree<T> extends BinaryTree<T>{
  public BinarySearchTree() {
  }

  public BinarySearchTree(T value) {
    super(value);
  }

  public void add(T value){
    BTNode<T> newNode = new BTNode<>(value);
    BTNode<T> temp = root;
    if (root == null){
      root = newNode;
    }else {
      while (true) {
        if (temp.left!=null && (int) newNode.value < (int) temp.value)  {
          temp = temp.left;
        }else if(temp.right!=null && (int) newNode.value > (int) temp.value){
          temp = temp.right;
        }else{
          break;
        }
      }
      if ((int)temp.value >= (int)newNode.value){
        newNode.left = temp.left;
        temp.left= newNode;
      }else {
        newNode.right = temp.right;
        temp.right = newNode;
      }
    }
  }

  public boolean contains(T value, BTNode<T> rootNode){
    BTNode<T> current = rootNode;
    if (rootNode != null){
      if ((int)value == (int)current.value){
        return true;
      }else if((int)value < (int)current.value){
        current=current.left;
        return contains(value,current);
      }else{
        current=current.right;
        return contains(value,current);
      }}
    return false;
  }
}
