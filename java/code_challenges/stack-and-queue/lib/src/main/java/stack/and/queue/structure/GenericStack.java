package stack.and.queue.structure;

import stack.and.queue.data.GenericNode;

public class GenericStack <T>{

    private GenericNode<T> top;

    public GenericStack() {
    }

    public GenericNode<T> getTop() {
        return top;
    }

    public void setTop(GenericNode<T> top) {
        this.top = top;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void push(T data){
        if(isEmpty()){
            GenericNode<T> node = new GenericNode<>(data);
            top = node;
        }else{
            GenericNode<T> node = new GenericNode<>(data);
            node.setNext(top);
            top = node;
        }
    }

    public T peak(){
        return top.getData();
    }

    public T pop(){
        if(isEmpty()){
            return null;
        }
        else {
            T deletedItem=top.getData();
            top = top.getNext();
            return deletedItem;
        }
    }

    public int search(String data){
        if(isEmpty()){
            return -1;
        }else{
            GenericNode<T> temp = top;
            int counter=0;
            while(temp.getData() != data){
                temp=temp.getNext();
                counter++;
            }
            return counter;
        }
    }

}
