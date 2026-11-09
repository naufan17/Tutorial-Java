// package com.tutorial;

public class Balok {
    int panjang = 5;
    int lebar = 3;
    int tinggi = 2;

    Balok() {}

    Balok(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    Balok(int panjang, int lebar, int tinggi) {
        this(panjang, lebar);
        this.tinggi = tinggi;
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