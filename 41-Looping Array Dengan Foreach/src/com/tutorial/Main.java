package com.tutorial;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] arrayAngka = {11, 12, 13, 14, 15, 16, 17, 19, 20, 21};

        System.out.println("\n === Looping Menggunakan Standar === \n");
        for(int i = 0; i < 9; i++){
            System.out.println("index ke-" + i + " adalah " + arrayAngka[i]);
        }

        System.out.println("\n === Looping Menggunakan length === \n");
        for(int i = 0; i < arrayAngka.length; i++){
            System.out.println("index ke-" + i + " adalah " + arrayAngka[i]);
        }

        System.out.println("\n === Looping Menggunakan for each === \n");
        for(int angka : arrayAngka){
            System.out.print(angka + " ");
        }
    }
}
