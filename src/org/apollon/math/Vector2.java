package org.apollon.math;

public class Vector2 {

    private double x;

    private double y;

    private double force;

    public Vector2(double x, double y, double force) {
        this.x = x;
        this.y = y;
        this.force = force;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getForce() {
        return force;
    }
}
