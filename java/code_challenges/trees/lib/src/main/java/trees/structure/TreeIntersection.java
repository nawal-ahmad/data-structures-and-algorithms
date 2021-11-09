package trees.structure;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection {

  public static Integer[] treeIntersection(BinaryTree<Integer> tree1 , BinaryTree<Integer> tree2){
    HashTable<Integer , Integer> hashTable = new HashTable<>();
    List<Integer> intersection = new ArrayList<>();

    if (tree1.getRoot() == null || tree2.getRoot() == null){
      return null;
    }

    for(int i : tree1.inOrder(tree1.root) ) {
      hashTable.add(i , 0);
    }
    List<Integer> list = tree2.inOrder(tree2.root);
    for(int x : list){
      if(hashTable.contains(x)) {
        intersection.add(list.get(list.indexOf(x)));
      }
      else {
        hashTable.add(list.get(list.indexOf(x)) , 0);
      }
    }
    return intersection.toArray(new Integer[0]);
  }
}
