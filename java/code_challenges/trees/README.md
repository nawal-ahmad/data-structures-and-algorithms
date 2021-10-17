# Trees
A tree is a hierarchical data structure defined as a collection of nodes.


## Challenge
Create a binary tree, preorder, inorder, postorder methods.
Create binary search tree which has add, contain methods.

## Approach & Efficiency
in all of our methods the big O notation equal to O(n).

## API
### BinaryTree class methods:
- preOrder: a method accept Node root as a parameter and return a list contain the tree values in (root,left,right) order.
- inOrder: a method accept Node root as a parameter and return a list contain the tree values in (left,root,right) order.
- postOrder: a method accept Node root as a parameter and return a list contain the tree values in (left,right,root) order.

### BinarySearchTree class methods:
- add: a method accept a value and add it to a certain location in the tree whereas the left node is smaller and the right node is bigger.
- contains: a method which take a value and a root node as parameters and search for that value in the tree based on binary search concepts.
