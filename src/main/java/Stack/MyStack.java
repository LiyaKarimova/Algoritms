package Stack;

import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.EmptyStackException;

//1. Создать программу, которая переворачивает вводимые строки (читает справа налево).
//2. Создать класс для реализации дека.
//3. Реализовать расширение массива в стеке при заполнении стека.
//4. ***. Реализовать расширение массива в очереди при заполнении очереди.
public class MyStack <T> {

    private  T[] list;
    private int size;//указатель
    private final int DEFAULT_CAPACITY = 10;
    private int actualCapacity;

    public int size() {
        return size;
    }

    public MyStack (int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException() ;
        }
        list = (T[]) new Object[capacity];
        actualCapacity = capacity;
    }

    public MyStack() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
        actualCapacity = DEFAULT_CAPACITY;
    }

    public boolean isFull () {
        return size == list.length;
    }

    public boolean isEmpty () {
        return size == 0;
    }

    public void push (T item) {
        if (isFull()) {
           reCapacity();
        }
        list [size] = item;
        size++;
    }

    public int getActualCapacity() {
        return actualCapacity;
    }

    public T pop () {
        T temp = peek();
        list[size] = null;
        size--;
        return temp;
    }

    public T peek () {
        if (isEmpty()) {
           throw new EmptyStackException ();
        }
        return list [size-1];
    }

    public void reCapacity () {
        int newCapacity = (actualCapacity* 3/2) + 1;
        T [] reCapacityList = (T [])new Object[newCapacity];
        System.arraycopy(list,0,reCapacityList,0,size);
        list = reCapacityList;
        actualCapacity = newCapacity;
    }


}
