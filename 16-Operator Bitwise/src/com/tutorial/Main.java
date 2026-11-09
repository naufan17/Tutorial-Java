package com.tutorial;

public class Main {
    public static void main(String[] args){
        // operator bitwise -> operator untuk melakukan operasi pada nilai bit
        byte a = 12;
        byte b, c, d;
        String a_bits, b_bits, c_bits, d_bits;
        a_bits = String.format("%8s", Integer.toBinaryString(a));
        System.out.printf("%s = %d\n", a_bits, a);

        // operator SHIFT LEFT
        System.out.println("==== SHIFT LEFT ====");
        b = (byte)(a << 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b));
        System.out.printf("%s = %d\n", b_bits, b);

        // operator SHIFT RIGHT
        System.out.println("==== SHIFT RIGHT ====");
        b = (byte)(a >> 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b));
        System.out.printf("%s = %d\n", b_bits, b);

        // operator BITWISE OR
        System.out.println("==== BITWISE OR (|) ====");
        b = 24;
        b_bits = String.format("%8s", Integer.toBinaryString(b));
        System.out.printf("%s = %d\n", b_bits, b);
        c = 12;
        c_bits = String.format("%8s", Integer.toBinaryString(c));
        System.out.printf("%s = %d\n", c_bits, c);
        System.out.println("----------------OR");
        d = (byte)(b | c);
        d_bits = String.format("%8s", Integer.toBinaryString(d));
        System.out.printf("%s = %d\n", d_bits, d);

        // operator BITWISE AND
        System.out.println("==== BITWISE AND (&) ====");
        b = 24;
        b_bits = String.format("%8s", Integer.toBinaryString(b));
        System.out.printf("%s = %d\n", b_bits, b);
        c = 12;
        c_bits = String.format("%8s", Integer.toBinaryString(c));
        System.out.printf("%s = %d\n", c_bits, c);
        System.out.println("----------------AND");
        d = (byte)(b & c);
        d_bits = String.format("%8s", Integer.toBinaryString(d));
        System.out.printf("%s = %d\n", d_bits, d);

        // operator BITWISE XOR
        System.out.println("==== BITWISE XOR (^) ====");
        b = 24;
        b_bits = String.format("%8s", Integer.toBinaryString(b));
        System.out.printf("%s = %d\n", b_bits, b);
        c = 12;
        c_bits = String.format("%8s", Integer.toBinaryString(c));
        System.out.printf("%s = %d\n", c_bits, c);
        System.out.println("----------------XOR");
        d = (byte)(b ^ c);
        d_bits = String.format("%8s", Integer.toBinaryString(d));
        System.out.printf("%s = %d\n", d_bits, d);

        // operator BITWISE NOT
        System.out.println("==== BITWISE NOT (~) ====");
        b = 24;
        c = (byte)(~b);
        b_bits = String.format("%8s", Integer.toBinaryString(b));
        System.out.printf("%s = %d\n", b_bits, b);
        c_bits = String.format("%8s", Integer.toBinaryString(c).substring(24));
        System.out.printf("%s = %d\n", c_bits, c);
    }
}
