package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args){
        // membuat objek untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);

        // program untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukkan nilai tebakan anda = ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai tebakan anda = " + nilaiTebakan);

        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan anda = " + statusTebakan);

        // operasi aljabar boolean (and / or)
        System.out.print("Masukkan nilai diantara 4 sampai dengan 12 = ");
        nilaiTebakan = inputUser.nextInt();
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 12);
        System.out.println("Tebakan anda = " + statusTebakan);
    }
}
