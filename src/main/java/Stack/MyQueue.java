package Stack;

import java.util.Arrays;

public class MyQueue <T> {
    private T [] list;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;
    private int size;
    private int actualCapacity;


    public MyQueue (int capacity) {
        if (capacity <= 0) {
            throw new RuntimeException();
        }
        list = (T [])new Object[capacity];
        this.actualCapacity = capacity;
    }

    public MyQueue () {
        list = (T [])new Object[DEFAULT_CAPACITY];
        this.actualCapacity = DEFAULT_CAPACITY;
    }

    public void insert (T item) {
        if (isFull()) {
            reCapacity();
        }
        size++;
        list [end] = item;
        end = nextIndex(end);

    }

    public T remove () {
        T item = peekFront();
        list [begin] = null;
        size--;
        begin = nextIndex(begin);
        return item;
    }

    public T peekFront () {
        if (isEmpty()) {
            throw new RuntimeException();
        }
        return list [begin];

    }

    public boolean isFull () {
        return size == list.length;
    }

    public boolean isEmpty () {
       return size == 0;
    }

    private int nextIndex (int index) {
        return (index+1) % list.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(list) + " begin " + begin + " end " + end;
    }

    public void reCapacity () {
        actualCapacity = (actualCapacity* 3/2) + 1;
        T [] reCapacityList = (T [])new Object[actualCapacity];
        if (end == list.length - 1) {
            System.arraycopy(list,0,reCapacityList,0,size);
        } else {
            System.arraycopy(list,begin,reCapacityList,0,list.length - begin);
            System.arraycopy(list,0,reCapacityList,list.length - begin ,end);
            begin = 0;
            end = list.length ;
        }
        list = reCapacityList;

    }
}
