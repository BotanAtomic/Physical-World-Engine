package org.apollon.object;

import org.apollon.math.Vector2;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Entity {

    private double radius;

    public Circle(double x, double y, double force, double radius) {
        super(new Vector2(x, y, force), "Circle");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw(Graphics2D graphics) {
        graphics.fill(new Ellipse2D.Double((int) super.vector.getX(), (int) super.vector.getY(), (int) radius << 1, (int) radius << 1));
    }
}
