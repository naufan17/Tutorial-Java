package com.tutorial;

public class Main {
    public static void main(String[] args){
        int x = 15;
        int y = 2;
        int hasil;

        // penjumlahan
        hasil = x + y;
        System.out.println(x + " + " + y + " = " + hasil);

        // pengurangan
        hasil = x - y;
        System.out.printf("%d - %d = %d \n" , x, y, hasil);

        // perkalian
        hasil = x * y;
        System.out.printf("%d x %d = %d \n" , x, y, hasil);

        // pembagian
        hasil = x / y;
        System.out.printf("%d / %d = %d \n" , x, y, hasil);

        // modulus
        hasil = x % y;
        System.out.printf("%d x %d = %d \n" , x, y, hasil);
    }
}
