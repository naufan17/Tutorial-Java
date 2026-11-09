package com.praktikum;

public class Main {
    public static void main(String[] Args){
        double[] arrTrap = new double[3];
        int i = 0;

        Trapesium Trapesium1 = new Trapesium();
        Trapesium1.setSisiAtas(5);
        Trapesium1.setSisiBawah(15);
        Trapesium1.setTinggi(8);
        Trapesium Trapesium2 = new Trapesium(13,11);
        Trapesium1.setSisiBawah(15);
        Trapesium2.setTinggi(2);
        Trapesium Trapesium3 = new Trapesium(8,10,16);
        Trapesium3.setSisiAtas(18);

        arrTrap[0] = Trapesium1.hitungLuas();
        arrTrap[1] = Trapesium2.hitungLuas();
        arrTrap[2] = Trapesium3.hitungLuas();

//        while(i < 3){
//            System.out.println("Luas Trapesium " + arrTrap[i]);
//            i++;
//        }

        for(i = i; i < 3; i++){
            System.out.println("Luas Trapesium " + arrTrap[i]);
        }

        System.out.println("Jumlah Objek Trapesium " + Trapesium.getJmlTrapesium());
    }
}
