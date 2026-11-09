package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args){
        int input, x;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan Nilai : ");
        input = inputUser.nextInt();
5
        x = (input == 10) ? (input*input) : (input/2);

        // jika memakai if
        // if(input == 10){
        //     x = input*input;
        // } else{
        //     x = input/2;
        // }

        System.out.println("Nilainya = " + x);
    }
}
