package lesson5;

import java.util.ArrayList;

public class BackPackApp {

    ArrayList <Thing> combinations;
    static ArrayList <Thing> list;
    int backPackWeight;
    static int size;

    public BackPackApp( ArrayList <Thing> list,int backPackWeight ) {
        combinations = new ArrayList();
        this.list = list;
        this.backPackWeight = backPackWeight;
        this.size = 4;
    }

    public static class Thing {

        public void set (int value, int weight) {
            this.value = value;
            this.weight = weight;
        }
        public void setValue(int value) {
            this.value = value;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        private int value;
        private int weight;


        public Thing (int value, int weight) {
            this.value = value;
            this.weight = weight;
        }

        public int getValue() {
            return value;
        }

        public int getWeight() {
            return weight;
        }
    }

    public void backPack (int newSize) {
        int sumWeight = 0;
        int sumValue = 0;

        // условие выхода
        if (list == null) {
            throw new NullPointerException("list is null");
        }
        if (newSize == 1) {
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            if (sumWeight + list.get(i).getWeight() < backPackWeight) {
                sumWeight += list.get(i).getWeight();
                sumValue+= list.get(i).getValue();
            } else {
                combinations.add(new Thing(sumValue,sumWeight));
                System.out.println("Новая комбинация ценность: "+ sumValue + " вес: " + sumWeight);
            }
            backPack(newSize - 1);
            rotate(newSize);
        }

    }

    public static void rotate (int newSize) {
        int i;
        int pos = size - newSize;
        Thing temp = list.get(pos);
        for (i = pos + 1; i < size; i++) {
            list.get(i -1).set(list.get(i).getValue(),list.get(i).getWeight());
        }
        list.get (i - 1).set(temp.getValue(),temp.getWeight());
    }

    public static void main(String[] args) {
        Thing A = new Thing(1,5);
        Thing B = new Thing(3,10);
        Thing C = new Thing(5,7);
        Thing D = new Thing(7,3);

        ArrayList <Thing> things = new ArrayList<>(4);
        things.add(A);
        things.add(B);
        things.add(C);
        things.add (D);

        BackPackApp app = new BackPackApp(things,10);
        app.backPack(4);
    }

}
