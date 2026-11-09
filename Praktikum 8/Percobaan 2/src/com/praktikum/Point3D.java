package com.praktikum;

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    double distance(int x, int y, int z) {
        int dx = this.x - x;
        int dy = this.y - y;
        int dz = this.z - z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    double distance(Point3D other) {
        return distance(other.x, other.y, other.z);
    }

    double distance(int x, int y) {
        double dx = (this.x / z) - x;
        double dy = (this.y / z) - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
