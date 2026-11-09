package com.tutorial;

public class Main {
    public static void main(String[] args){
        int a = 5;
        int b = 10;

        System.out.println("Nilai A = " + a);
        System.out.println("Nilai B = " + b);

        if (a == 5){
            if (b == 10){
                System.out.println("Nilai A = 5, Nilai B = 10");
            } else {
                System.out.println("Nilai A = 5, Nilai B != 10");
            }
        } else {
            System.out.println("Nilai A != 5");
        }
    }
}
