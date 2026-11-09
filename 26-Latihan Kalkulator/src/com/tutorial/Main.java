package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner inputUser;
        float a, b, hasil;
        String operator;

        inputUser = new Scanner(System.in);
        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("Opeator = ");
        operator = inputUser.next();
        System.out.print("Nilai b = ");
        b = inputUser.nextFloat();

        System.out.println("input = " + a + " " + operator + " " + b);

        // operator tersedia  * / + -
        switch(operator){
            case "*":
                // perkalian
                hasil = a * b;
                System.out.println("Hasil = " + hasil);
            break;
            case "/":
                // pembagian
                if (b == 0){
                    System.out.println("Pembagi nol menghasilkan tak hingga");
                } else {
                    hasil = a / b;
                    System.out.println("Hasil = " + hasil);
                }
            break;
            case "+":
                // pertambahan
                hasil = a + b;
                System.out.println("Hasil = " + hasil);
            break;
            case "-":
                // pengurangan
                hasil = a - b;
                System.out.println("Hasil = " + hasil);
            break;
            default:
                // tidak ditemukan
                System.out.println("Operator tidak ditemukan");
        }

    }
}
