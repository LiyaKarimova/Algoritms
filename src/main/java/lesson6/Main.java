package lesson6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int  balance = 0;
        int disbalance = 0;
        for (int i = 0; i < 100000; i++) {
            if (makeTreeMap()) {
                balance++;
            } else disbalance++;
        }
        System.out.println(balance);
        double percent = (double) balance/ 100000 * 100;
        System.out.println(percent);
    }



    //1. Создать и запустить программу для построения двоичного дерева.
    // В цикле построить двадцать деревьев с глубиной в 6 уровней.
    // Данные, которыми необходимо заполнить узлы деревьев, представляются в виде чисел типа int.
    // Число, которое попадает в узел, должно генерироваться случайным образом в диапазоне от -100 до 100.

    //2. Проанализировать, какой процент созданных деревьев являются несбалансированными.


    public static boolean makeTreeMap () {
        MyTreeMap treeMap = new MyTreeMap();
        int a = 0;
        while (treeMap.height() < 6) {
            Random random = new Random();
            a = random.nextInt(201) - 100;
            treeMap.put(a,a);
        }
        treeMap.delete(a);
        return treeMap.isBalanced();
    }


}
