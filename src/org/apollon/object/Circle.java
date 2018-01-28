package org.apollon.object;

import org.apollon.math.Vector2;

public class Circle extends Entity {

    private double radius;

    public Circle(double x, double y, double force) {
        super(new Vector2(x, y, force));
    }

    public double getRadius() {
        return radius;
    }
}
