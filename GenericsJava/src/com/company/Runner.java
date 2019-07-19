package com.company;

import java.util.ArrayList;

public class Runner {
    public static void run(){
        Integer[] arr1 = {3,12,45,62,-34,0,54};
        Double[] arr2 = {0.34, 0.24, 4.3, 12.2, 0.0, 75.04, -100.04, 23.452};

        int res1 = MyTestMethod.calcNum(arr1, 20);
        int res2 = MyTestMethod.calcNum(arr2, 20.0);

        System.out.println("Cout int - >" + res1);
        System.out.println("Cout double - >" + res2);

        double res3 = MyTestMethod.sumElem(arr1, 20);
        double res4 = MyTestMethod.sumElem(arr2, 20.0);

        System.out.println("Cout sum int - >" + res3);
        System.out.println("Cout sum double - >" + res4);

        MyMixer<Integer> arr3 = new MyMixer<>(7);
        ArrayList<Integer> array1;
        array1 = arr3.getArray();
        for(int i = 0; i < 7; i++) {
            array1.add(arr1[i]);
        }
        System.out.println("Given array:");
        System.out.println(arr3);
        arr3.shuffle();
        System.out.println("Shuffled array:");
        System.out.println(arr3);


        MyMixer<Double> arr4 = new MyMixer<>(8);
        ArrayList<Double> array2;
        array2 = arr4.getArray();
        for(Double elem : arr2) {
            array2.add(elem);
        }
        System.out.println("Given array:");
        System.out.println(arr4);
        arr4.shuffle();
        System.out.println("Shuffled array:");
        System.out.println(arr4);

        MyMixer<String> arr5 = new MyMixer<>(5);
        ArrayList<String> array3;
        array3 = arr5.getArray();
        for(int i = 15; i<20; i++) {
            array3.add(i + "Yellow");
        }
        System.out.println("Given array:");
        System.out.println(arr5);
        arr5.shuffle();
        System.out.println("Shuffled array:");
        System.out.println(arr5);

    }
}
