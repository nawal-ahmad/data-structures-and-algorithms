# Hashtable

Hash tables datatype structure are created with an algorithm that stores the keys into hash buckets, which contain key-value pairs.
different keys may hash to the same bucket(collision), each bucket containing as few key-value pairs as possible.

## Challenge
implement HashTable class with 4 methods (add , hash , contains , get).

## Approach & Efficiency
the big O notation for time and space is big O(n)

## API

**hash()**: convert key to an integer index.

**add()**: add a new key-value pair to the hash table.

**get()**: get and return the value of the given key.

**contains()**: check if the key exists in hash table and returns a boolean true or false.
