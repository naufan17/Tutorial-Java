package com.tutorial;

import java.util.*;

public class Main {
    public static void main(String[] args){
        String input;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Pesan makanan apa : ");
        input = inputUser.next();

        switch(input){
            case "rendang":
                System.out.println("Rendang 1 porsi");
                break;
            case "bakso":
                System.out.println("Bakso 1 porsi");
                break;
            default:
                System.out.println(" Menu " + input + " kosong");
        }
    }
}
