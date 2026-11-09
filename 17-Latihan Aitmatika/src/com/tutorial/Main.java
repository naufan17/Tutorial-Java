package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, tinggi;

        // Input panjang dan lebar
        System.out.print("Panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        lebar = userInput.nextInt();
        System.out.print("Tinggi = ");
        tinggi = userInput.nextInt();

        // menampilkan luas dan volume
        System.out.println("Luas = " + panjang * lebar);
        System.out.println("Luas = " + panjang * lebar * tinggi);
    }
}
