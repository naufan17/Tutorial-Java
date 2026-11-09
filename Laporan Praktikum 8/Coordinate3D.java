// package com.praktikum;

class Coordinate3D extends Coordinate2D {
    protected int z;

    public Coordinate3D(int inX, int inY, int inZ) {
        super(inX, inY);
        z = inZ;
    }

    public int getZ() {
        return z;
    }
}
