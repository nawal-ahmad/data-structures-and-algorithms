package trees.structure;


import trees.data.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeBreadthFirst {
  public static ArrayList<Integer> breadthFirst(BinaryTree<Integer> tree) {
    ArrayList<Integer> values = new ArrayList<Integer>();
    Queue<Node> test = new LinkedList<>();
    if (tree.root != null) {
      test.add(tree.root);
      while (!test.isEmpty()) {
        Node node = test.remove();
        values.add((Integer) node.value);
        if (node.left != null) {
          test.add(node.left);
        }
        if (node.right != null) {
          test.add(node.right);
        }
      }
    }
    return values;
  }
}
