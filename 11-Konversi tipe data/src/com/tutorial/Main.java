package com.tutorial;

public class Main {
    public static void main(String[] args){
        int nilaiInt = 130;
        System.out.println("Nilai int = " + nilaiInt);

        // memperluas rentang tipe data
        long nilaiLong = nilaiInt;
        System.out.println("Nilai Long = " + nilaiLong);

        //memperkecil rentang tipe data
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("Nilai Byte = " + nilaiByte);

        //casting pembagian
        int a = 10;
        float b = 3;
        float c = a / b;
        System.out.printf("%d / %f = %f \n", a, b ,c);

        int x = 15;
        int y = 4;
        float z = (float) x / y;
        System.out.printf("%d / %d = %f \n", x, y ,z);
    }
}
