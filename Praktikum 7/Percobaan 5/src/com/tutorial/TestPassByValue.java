package com.tutorial;

public class TestPassByValue {
    public static void main( String[] args ){
        int i = 10;
        System.out.println( i );

        //memanggil method test, passing i pada method test
        test( i );

        System.out.println( i );
    }

    public static void test( int j ) {
        //merubah nilai parameter j
        j = 33;
    }
}
