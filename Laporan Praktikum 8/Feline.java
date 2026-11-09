// package com.praktikum;

class Feline {
    boolean vocal = true;

    void makeNoise() {
        System.out.println("Non-specific cat sound");
    }

    void call(){
        System.out.println("Puss, Puss, Puss……");
        if(vocal) {
            makeNoise();
        }
    }

    void quiet(){
        vocal = false;
    }
}
