package lesson5;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println(recNumberToPower(5, 10));
    }

    public static int recNumberToPower (int x, int n) {
        if (n == 1) {
            return x;
        }
        return recNumberToPower(x,n-1) * x;
    }

//    private class Thing {
//        private int value;
//        private int weight;
//
//        public Thing(int value, int weight) {
//            this.value = value;
//            this.weight = weight;
//        }
//
//        public int getValue() {
//            return value;
//        }
//
//        public int getWeight() {
//            return weight;
//        }
//    }
//
//
//    // A B C D E
//    //A
//
//
//    public void backPack (ArrayList <Thing> list, int backPackWeight, int newSize) {
//        int sumWeight = 0;
//        int sumValue = 0;
//        ArrayList <Thing> combinations = new ArrayList();
//
//        // условие выхода
//        if (list.size() == 1) {
//            return;
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            backPack(list, backPackWeight,newSize - 1);
//            rotate;
//            if (sumWeight + list.get(i).getWeight() < backPackWeight) {
//                sumWeight +=list.get(i).getWeight();
//                sumValue+= list.get(i).getValue();
//            } else {
//                combinations.add(new Thing(sumValue,sumWeight));
//            }
//        }
//
//    }

//    public static void rotate(int newSize) {
//        int i;
//        int pos = list.size - newSize;
//        char temp = arr[pos];
//        for (i = pos + 1; i < size; i++) {
//            arr[i - 1] = arr[i];
//        }
//        arr[i - 1] = temp;
//    }
}
