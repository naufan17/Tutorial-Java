package com.tutorial;

public class TestBalok {
    public static void main(String[] args) {
        Balok balok1 = new Balok();
        Balok balok2 = new Balok(15, 10);
        Balok balok3 = new Balok(10, 5, 5);
        System.out.println("Banyak objek balok = " + Balok.getBanyakBalok());
    }
}