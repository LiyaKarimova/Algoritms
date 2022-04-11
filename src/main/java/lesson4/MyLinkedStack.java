package lesson4;

import javax.xml.soap.Node;

public class MyLinkedStack <E>{

    private MyLinkedList <E> list;

    public MyLinkedStack() {
        list = new MyLinkedList<>();
    }

    public int size () {
        return list.size();
    }

    public boolean isEmpty () {
        return list.isEmpty();
    }

    public void add (E item) {
        list.insertLast(item);
    }

    public E peek () {
        return list.getLast();
    }

    public E remove () {
        return list.removeLast();
    }

    @Override
    public String toString() {
       return list.toString();
    }
}
