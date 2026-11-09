package com.tutorial;

public class Main {
    public static void main(String[] args){
        // unary = operasi yang dilakukan pada satu variabel saja
        // unary + dan -
        int a = 1;
        int b = -2;
        System.out.printf("unary '-', dari %d menjadi %d\n", a, -a);
        System.out.printf("unary '+', dari %d menjadi %d\n", b, +b);

        // unary decrement (--) dan increment (++)
        int c = 10;
        c++;
        System.out.printf("unary increment '++', menjadi %d\n", c);

        int d = 10;
        d--;
        System.out.printf("unary decrement '--', menjadi %d\n", d);

        // prefix dan postflix
        int e = 10;
        System.out.printf("unary preflix '++', menjadi %d\n", ++e);

        int f = 10;
        System.out.printf("unary postflix '++', menjadi %d\n", f++);
        System.out.printf("hasil postflix, menjadi %d\n", f);

        //unary boolean dengan ! untuk negasi
        boolean benar = true;
        System.out.println("nilai boolean benar = " + benar);
        System.out.println("nilai boolean benar = " + !benar);
    }
}
