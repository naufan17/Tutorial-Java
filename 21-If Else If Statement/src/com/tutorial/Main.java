package com.tutorial;

public class Main {
    public static void main(String[] args){
        int nilai = 15;

        System.out.println("Nilai = " + nilai);

        if (nilai >= 80){
            System.out.println("Grade A");
        } else if ((nilai >= 60) && (nilai < 80)){
            System.out.println("Grade B");
        } else if ((nilai >= 40) && (nilai < 60)){
            System.out.println("Grade C");
        }  else if ((nilai >= 20) && (nilai < 40)){
            System.out.println("Grade D");
        }  else{
            System.out.println("Grade E");
        }
    }
}
