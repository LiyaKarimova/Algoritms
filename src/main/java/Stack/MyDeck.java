package Stack;

import java.util.Arrays;

public class MyDeck<T> {
    private T [] list;
    private final int DEFAULT_CAPACITY = 10;
    private int beginLeft;
    private int endRight;
    private int size;


    public MyDeck(int capacity) {
        if (capacity <= 0) {
            throw new RuntimeException();
        }
        list = (T [])new Object[capacity];
    }

    public MyDeck() {
        list = (T [])new Object[DEFAULT_CAPACITY];
    }

    public void insertRight (T item) {
        if (isFull()) {
            throw new RuntimeException();
        }
        size++;
        list [endRight] = item;
        endRight = nextIndexRight(endRight);

    }

    public void insertLeft (T item) {
        if (isFull()) {
            throw new RuntimeException();
        }
        size++;
        list [nextIndexLeft(beginLeft)] = item;
        beginLeft = nextIndexLeft(beginLeft);

    }

    public T removeLeft () {
        T item = peekLeft();
        list [beginLeft] = null;
        size--;
        beginLeft = nextIndexRight(beginLeft);
        return item;
    }

    public T removeRight () {
        T item = peekRight();
        list [endRight - 1] = null;
        size--;
        endRight = nextIndexLeft(endRight);
        return item;
    }


    public T peekLeft() {
        if (isEmpty()) {
            throw new RuntimeException();
        }
        return list [beginLeft];

    }

    public T peekRight() {
        if (isEmpty()) {
            throw new RuntimeException();
        }
        return list [endRight - 1];

    }

    public boolean isFull () {
        return size == list.length;
    }


    public boolean isEmpty () {
        return size == 0;
    }

    private int nextIndexRight (int index) {
        return (index+1) % list.length;
    }

    private int nextIndexLeft (int index) {
        if (index == 0) {
            return list.length - 1;
        }
        return (index-1);

    }

    @Override
    public String toString() {
        return Arrays.toString(list) + " begin " + beginLeft + " end " + endRight;
    }
}
