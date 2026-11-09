package com.tutorial;

public class Main {
    public static void main(String[] args){
        // operator komparasi akan menghasilkan nilai dalam bentuk boolean
        // operator persamaan
        System.out.println("===sama dengan===");
        int a = 10;
        int b = 10;
        boolean hasilKomparasi = (a == b);
        System.out.printf("%d sama dengan %d => %s \n", a, b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d sama dengan %d => %s \n", a, b, hasilKomparasi);

        // operator pertidaksamaan
        System.out.println("===pertidaksamaan===");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d tidak sama dengan %d => %s \n", a, b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d tidak sama dengan %d => %s \n", a, b, hasilKomparasi);

        // operator kurang dari
        System.out.println("===kurang dari===");
        a = 9;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d kurang dari %d => %s \n", a, b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d kurang dari %d => %s \n", a, b, hasilKomparasi);

        // operator lebih dari
        System.out.println("===lebih dari===");
        a = 9;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d lebih dari %d => %s \n", a, b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d lebih dari %d => %s \n", a, b, hasilKomparasi);

        // operator kurang dari sama dengan
        System.out.println("===kurang dari sama dengan===");
        a = 9;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d kurang dari sama dengan %d => %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 9;
        hasilKomparasi = (a <= b);
        System.out.printf("%d kurang dari sama dengan %d => %s \n", a, b, hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d kurang dari sama dengan %d => %s \n", a, b, hasilKomparasi);

        // operator lebih dari sama dengan
        System.out.println("===lebih dari sama dengan===");
        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d lebih dari sama dengan %d => %s \n", a, b, hasilKomparasi);

        a = 9;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d lebih dari sama dengan %d => %s \n", a, b, hasilKomparasi);

        a = 12;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d lebih dari sama dengan %d => %s \n", a, b, hasilKomparasi);
    }
}
