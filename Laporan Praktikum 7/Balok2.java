// package com.tutorial;

public class Balok2 {
    int panjang = 5;
    int lebar = 3;
    int tinggi = 2;
    static int banyakBalok = 0;

    Balok2() {
        banyakBalok++;
    }

    Balok2(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        banyakBalok++;
    }

    Balok2(int panjang, int lebar, int tinggi) {
        this(panjang, lebar);
        this.tinggi = tinggi;
        banyakBalok++;
    }

    void setLebar(int lb) {
        lebar = lb;
    }

    void setPanjang(int pj) {
        panjang = pj;
    }

    void setTinggi(int tg) {
        tinggi = tg;
    }

    double hitungVolume() {
        double v = panjang * lebar * tinggi;
        return v;
    }

    double luasPermukaan() {
        double luas = (2 * panjang * lebar) + (2 * panjang * tinggi) + (2 * lebar * tinggi);
        return luas;
    }
}