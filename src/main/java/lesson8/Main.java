package lesson8;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ChainingHashMap<Integer, String> chm = new ChainingHashMap<>(16);
        chm.put(1, " ");
        chm.put(222, " ");
        chm.put(4545, " ");
        chm.put(56, " ");
        chm.put(1121, " ");
        chm.put(125, " ");

//
//        System.out.println(chm.get(1));

//        Random random = new Random();
//
//        for (int i = 0; i < 12; i++) {
//            chm.put(random.nextInt(100), "");
//        }

        System.out.println(chm);
        System.out.println("New chm");
        chm.delete(5);

        System.out.println(chm);
    }
    }

