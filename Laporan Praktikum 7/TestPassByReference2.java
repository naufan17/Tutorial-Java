// package com.tutorial;

public class TestPassByReference2 {
    public static void main( String[] args ){
        Point2 p = new Point2(2,3);

        System.out.println("Point p = " + p.getX() + ", " + p.getY());

        change(p);

        System.out.println("Point p = " + p.getX() + ", " + p.getY());
    }

    public static void change(Point2 point) {
        point.setX(4);
        point.setY(5);
    }
}
