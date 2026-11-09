package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int hasil;
        int m, x, c, y;

        hasil = 5 + 5;
        System.out.println("5 + 5 = " + hasil);

        hasil = 2 * 5 + 5;
        System.out.println("2 * 5 + 5 = " + hasil);

        hasil = 2 * 5 + 10 / 2;
        System.out.println("2 * 5 + 10 / 2 = " + hasil);

        hasil = 2 * (5 + 5);
        System.out.println("2 * (5 + 5) = " + hasil);

        Scanner userInput = new Scanner(System.in);

        System.out.println("=== Mencari Nilai Persamaan ===");
        System.out.print(" Nilai x = ");
        x = userInput.nextInt();
        System.out.print(" Nilai m = ");
        m = userInput.nextInt();
        System.out.print(" Bias c = ");
        c = userInput.nextInt();

        y = m * x * x + c;
        System.out.println("Nilai y = " + y);
    }
}
