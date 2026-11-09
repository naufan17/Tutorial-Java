package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner inputUser;
        float a, b, hasil;
        char operator;

        inputUser = new Scanner(System.in);
        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("Opeator = ");
        operator = inputUser.next().charAt(0);
        System.out.print("Nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("input = " + a + " " + operator + " " + b);

        // operator tersedia  * / + -

        if (operator == '*'){
            // perkalian
            hasil = a * b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '/') {
            // pembagian
            if (b == 0){
                System.out.println("Pembagi nol menghasilkan tak hingga");
            } else {
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
            }
        } else if (operator == '+') {
            // pertambahan
            hasil = a + b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '-') {
            // pengurangan
            hasil = a - b;
            System.out.println("Hasil = " + hasil);
        } else {
            // tidak ditemukan
            System.out.println("Operator tidak ditemukan");
        }
    }
}
