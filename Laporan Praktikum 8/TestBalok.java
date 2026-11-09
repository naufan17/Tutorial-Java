// package com.praktikum;

public class TestBalok {
    public static void main(String[] Args){
        Balok Balok1 = new Balok(7, 8, 16);
        Balok Balok2 = new Balok(5, 12, 15);
        Balok Balok3 = new Balok(10, 11, 24);

        System.out.println("Balok 1");
        System.out.println("Panjang = " + Balok1.getPanjang());
        System.out.println("Lebar = " + Balok1.getLebar());
        System.out.println("Tinggi = " + Balok1.getTinggi());
        System.out.println("Luas Permukaan Balok " + Balok1.hitungLuas());

        System.out.println("Balok 2");
        System.out.println("Panjang = " + Balok2.getPanjang());
        System.out.println("Lebar = " + Balok2.getLebar());
        System.out.println("Tinggi = " + Balok2.getTinggi());
        System.out.println("Luas Permukaan Balok " + Balok2.hitungLuas());

        System.out.println("Balok 3");
        System.out.println("Panjang = " + Balok3.getPanjang());
        System.out.println("Lebar = " + Balok3.getLebar());
        System.out.println("Tinggi = " + Balok3.getTinggi());
        System.out.println("Luas Permukaan Balok " + Balok3.hitungLuas());

    }
}
