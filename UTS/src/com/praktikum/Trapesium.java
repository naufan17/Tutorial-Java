package com.praktikum;

public class Trapesium {
    private double sisiAtas, sisiBawah, tinggi, luas;
    private static int jumlahTrapesium = 0;

    Trapesium(){
        jumlahTrapesium++;
    }

    Trapesium(double sisiAtas, double sisiBawah){
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        jumlahTrapesium++;
    }

    Trapesium(double sisiAtas, double sisiBawah, double tinggi){
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
        jumlahTrapesium++;
    }

    void setSisiAtas(double sisiAtas){
        this.sisiAtas = sisiAtas;
    }

    void setSisiBawah(double sisiBawah){
        this.sisiBawah = sisiBawah;
    }

    void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    double getSisiAtas(){
        return this.sisiAtas;
    }

    double getSisiBawah(){
        return this.sisiBawah;
    }

    double getTinggi(){
        return this.tinggi;
    }

    double hitungLuas(){
        luas = ((sisiAtas + sisiBawah) * tinggi) / 2;
        return luas;
    }

    static int getJmlTrapesium(){
        return jumlahTrapesium;
    }

}
