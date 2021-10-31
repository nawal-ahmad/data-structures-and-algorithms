package stack.and.queue.structure;

import stack.and.queue.data.GenericNode;

public class GenericQueue<T> {
    GenericNode<T> front;
    GenericNode<T> rear;

    public GenericQueue() {
    }

    public boolean isEmpty(){
        return front == null;
    }

    public T peak(){
        if (isEmpty()){
            return null;
        }
        else {
            return front.getData();
        }
    }

    public void enqueue(T data){
        if (isEmpty()){
            GenericNode<T> node = new GenericNode<>(data);
            front = node;
            rear = node;
        }else{
            GenericNode<T> node = new GenericNode<>(data);
            rear.setNext(node);
            rear = node;
        }
    }

    public T dequeue(){
        if(isEmpty()){
            return null;
        } else{
            T deletedItem = front.getData();
            front = front.getNext();
            return deletedItem;
        }
    }
}
