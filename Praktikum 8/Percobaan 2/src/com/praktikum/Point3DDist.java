package com.praktikum;

class Point3DDist {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(30, 40, 10);
        Point3D p2 = new Point3D(0, 0, 0);
        Point p = new Point(4, 6);
        System.out.println("p1 = " + p1.x + ", " + p1.y + ", " + p1.z);
        System.out.println("p2 = " + p2.x + ", " + p2.y + ", " + p2.z);
        System.out.println("p = " + p.x + ", " + p.y);
        System.out.println("p1.distance(p2) = " + p1.distance(p2));
        System.out.println("p1.distance(4,6) = " + p1.distance(4, 6));
        System.out.println("p1.distance(p) = " + p1.distance(p));
    }
}
