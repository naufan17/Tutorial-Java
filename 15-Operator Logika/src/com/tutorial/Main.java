package com.tutorial;

public class Main {
    public static void main(String[] args){
        // Operator logika -> operasi yang bisa kita lakukan kepada tipe data boolean
        // AND, OR, XOR, negasi

        boolean a, b, c;

        // OR atau (||)
        System.out.println("==== OR (||) ====");
        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);

        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);

        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);

        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " || " + b + " = " + c);

        // AND dan (&&)
        System.out.println("==== OR (||) ====");
        a = true;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);

        a = false;
        b = true;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);

        a = true;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);

        a = false;
        b = false;
        c = (a&&b);
        System.out.println(a + " && " + b + " = " + c);

        // XOR exlusive or (^)
        System.out.println("==== XOR (^) ====");
        a = true;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);

        a = false;
        b = true;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);

        a = true;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);

        a = false;
        b = false;
        c = (a^b);
        System.out.println(a + " ^ " + b + " = " + c);

        // NOT negasi (!)
        System.out.println("==== NOT (!) ====");
        a = true;
        b = false;
        c = !a;
        System.out.println(a + " ! = " + c);

        a = true;
        b = false;
        c = !b;
        System.out.println(b + " ! = " + c);

    }
}
