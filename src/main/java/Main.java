import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        MyArrayList<Integer> mal = new MyArrayList<>();
        for (int i = 0; i < 100000; i++) {
            mal.add(random.nextInt(100000));
        }

        //сортировка выбором
        long startTime = System.currentTimeMillis();
        mal.selectionSort();
        System.out.println("Selection sort: " + (System.currentTimeMillis() - startTime) + "ms");

        //сортировка вставками
        startTime = System.currentTimeMillis();
        mal.insertionSort();
        System.out.println("Insertion sort: " + (System.currentTimeMillis() - startTime) + "ms");

        //сортировка пузырьком
        startTime = System.currentTimeMillis();
        mal.bubbleSort();
        System.out.println("Bubble sort: " + (System.currentTimeMillis() - startTime) + "ms");




       // mal.add (11,0);

        //mal.bubbleSort();
        //System.out.println(mal);

//        mal.selectionSort();
//        mal.insertionSort();
//        mal.bubbleSort();
//
//        System.out.println(mal);

    }
    }


