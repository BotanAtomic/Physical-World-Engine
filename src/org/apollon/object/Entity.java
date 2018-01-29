package org.apollon.object;

import org.apollon.math.Vector2;

import java.awt.*;

public abstract class Entity {

    protected Vector2 vector;
    private String name;

    public Entity(Vector2 vector, String name) {
        this.vector = vector;
        this.name = name;
    }

    public abstract void draw(Graphics2D graphics);

    public String getName() {
        return name;
    }

    public Vector2 getVector() {
        return vector;
    }
}
