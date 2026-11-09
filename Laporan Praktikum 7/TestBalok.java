// package com.tutorial;

public class TestBalok {
    public static void main(String[] args) {
        Balok balok1 = new Balok();
        Balok balok2 = new Balok(15, 10);
        Balok balok3 = new Balok(10, 5, 5);

        System.out.println("Vol balok1 = " + balok1.hitungVolume());
        System.out.println("Vol balok2 = " + balok2.hitungVolume());
        System.out.println("Vol balok3 = " + balok3.hitungVolume());
        System.out.println("Luas balok1 = " + balok1.luasPermukaan());
        System.out.println("Luas balok2 = " + balok2.luasPermukaan());
        System.out.println("Luas balok3 = " + balok3.luasPermukaan());
    }
}