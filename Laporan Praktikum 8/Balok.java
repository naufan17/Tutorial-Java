// package com.praktikum;

public class Balok extends PersegiPanjang{
    protected double tinggi;

    public Balok(double panjang, double lebar, double tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    double hitungLuas(){
        return ((panjang * lebar + panjang * tinggi + lebar * tinggi) * 2);
    }

    double getTinggi(){
        return tinggi;
    }
}
