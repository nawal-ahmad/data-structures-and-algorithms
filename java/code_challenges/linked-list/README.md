# Singly Linked List
Linked List is a linear data structure, LinkedList can be represented as a class and a Node as a separate class. The LinkedList class contains a reference of Node class type. 
## Challenge
- Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.
- Create a Linked List class include a head property.
The class contain the following methods: 
    - **insert** to adds a new node with value to the head of the list.
    - **includes** to indicates whether a specific value exists as a Node’s value somewhere within the list.
    - **to string**: return a string representing all the values in the Linked List, formatted as: `"{ a } -> { b } -> { c } -> NULL"`

## Approach & Efficiency
- in the insert method i added nodes to the first so I didnt use any loops.
```
Big O time = O(1)
Big O space = O(1)
```
- in the includes method i used while loop.
```
Big O time = O(n)
Big O space = O(1)
```
- in the toString method i used the while loop to assign the values of nodes to a String variable.
```
Big O time = O(n)
Big O space = O(1)
```
## API
insert : adding nodes to the linked list.
includes : checking for a specific value if it exist in the linked list.
toString : adding the values in a String variable to be printed.



# Linked List Insertion

# Challenge Summary
Add three methods:
- **append** : add a node to the end of the linked list.
- **insertBefore** : insert a node before another node.
- **insertAfter** :  insert a node after another node.

## Approach & Efficiency
> append :
- Time : big O(1)
-  space: big O(1).

> insertBefore:
- Time : big O(n).
- space: big O(1).

> insertAfter:
- Time : big O(n).
- space: big O(1).
