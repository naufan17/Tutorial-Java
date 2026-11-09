package com.praktikum;

public class PersegiPanjang {
    protected double panjang;
    protected double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    double hitungLuas() {
        return (panjang * lebar);
    }

    double getPanjang() {
        return panjang;
    }

    double getLebar() {
        return lebar;
    }
}
