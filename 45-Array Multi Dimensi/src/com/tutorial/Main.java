package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        // cara membuat array 2 dimensi dengan assignment
        int[][] array_2D = {
                            {1, 2},
                            {4, 5}
                            };
        printArray2D(array_2D);

        // cara membuat array 2 dimensi dengan deklarasi
        int[][] arrayAngka = new int[5][4];
        printArray2D(arrayAngka);

        // looping lengkap secara manual
        for(int i = 0; i < arrayAngka.length; i++){
            System.out.print("[");
            for(int j = 0; j < arrayAngka[i].length; j++){
                System.out.print(arrayAngka[i][j] + ", ");
            }
            System.out.print("]\n");
        }

        //looping foreach
        for(int[] baris : arrayAngka){
            System.out.print("[");
            for(int angka : baris){
                System.out.print(angka + ", ");
            }
            System.out.print("]\n");
        }

    }
    private static void printArray2D(int[][] dataArray){
        for(int i = 0; i < dataArray.length; i++){
            System.out.println(Arrays.toString(dataArray[i]));
        }
    }
}
