package hashtable;

import java.util.ArrayList;
import java.util.Objects;

public class HashTable <K, V> {

  private ArrayList<HashNode<K, V>> bucketArray;

  // bucketArray size
  private int numBuckets;

  // hash nodes number in bucketArray
  private int size;

  public HashTable() {
    bucketArray = new ArrayList<>();
    numBuckets = 10;
    size = 0;

    // hash nodes number in bucketArray
    for (int index = 0; index < numBuckets; index++) {
      bucketArray.add(null);
    }
  }

  //hash
  private int hash(K key) {
    return Objects.hashCode(key);
  }

  private int getBucketIndex(K key) {
    int hashCode = hash(key);

    // Index is with in the bounds of the bucket array
    int index = hashCode % numBuckets;

    // guarantee that hashCode has positive value
    index = index < 0 ? index * -1 : index;

    return index;
  }

  public int getSize() {
    return size;
  }

  public boolean isEmpty() {
    return getSize() == 0;
  }


  // Add
  public void add(K key, V value) {

    // gets the head of a linked list for a given key
    int bucketIndex = getBucketIndex(key);
    int hashCode = hash(key);
    size++;
    HashNode<K, V> head = bucketArray.get(bucketIndex);

    // check if key present
    while (head != null) {
      if (head.key.equals(key) && head.hashCode == hashCode) { // checks for duplicates
        // if there is a duplicate just overwrite
        head.value = value;
        return;
      }

      // adds to the chain of the linkedlist, by adding to the front
      head = head.next;
    }
  }

  // get
  public V get(K key) {
    int bucketIndex = getBucketIndex(key);
    int hashCode = hash(key);

    HashNode<K, V> head = bucketArray.get(bucketIndex);

    // search the linked list
    while (head != null) {
      if (head.key.equals(key) && head.hashCode == hashCode) {
        return head.value;
      }

      head = head.next;
    }
    // key not found
    return null;
  }

  //contains
//  public boolean contains(K key){
//
//    int index = hash(key);
//    if (bucketArray.get(index) != null){
//      HashNode<K,V> current = bucketArray.get(index);
//      while (current != null){
//        if (current.key == key){
//          return true;
//        }else current= current.next;
//      }
//    }
//    return false;
//  }
}
