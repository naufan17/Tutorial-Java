package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        // assigment
        int[] arrayInteger = {1, 2, 3, 4, 5};

        System.out.println("Assignment Array");
        System.out.println(arrayInteger[0]);
        System.out.println(arrayInteger[1]);
        System.out.println(arrayInteger[2]);
        System.out.println(arrayInteger[3]);
        System.out.println(arrayInteger[4]);

        // deklarasi

        float[] arrayFloat = new float[5];

        System.out.println("Assignment Array");
        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);
        System.out.println(arrayFloat[4]);

        System.out.println(Arrays.toString(arrayInteger));
    }
}
