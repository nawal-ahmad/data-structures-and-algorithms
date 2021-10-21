//package trees.structure;
//import trees.data.QNode;
//import trees.data.BTNode;
//
//public class TreeBreadthFirst {
//    private BTNode root;
//    public BTNode getRoot() {
//      return root;
//    }
//
//    public void setRoot(BTNode root) {
//      this.root = root;
//    }
//
//  public void BreadthFirst() {
//    if (root != null) {
//      Queue<BTNode> queue = new Queue<>();
//      queue.enqueue(root);
//
//      BTNode node;
//      while (!queue.isEmpty()) {
//        node = queue.dequeue();
//        System.out.print(node.left + " => ");
//        if (node.left != null) {
//          queue.enqueue(node.left);
//        }
//
//        if (node.right != null) {
//          queue.enqueue(node.right);
//        }
//      }
//    } else {
//      System.out.println("Tree empty");
//    }
//  }
//
//}
