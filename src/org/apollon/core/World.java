package org.apollon.core;

import org.apollon.object.Entity;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class World extends Thread {
    private final int width, height;

    private List<Entity> entities;

    private World(int width, int height) {
        this.width = width;
        this.height = height;
        this.entities = new CopyOnWriteArrayList<>();
    }

    public static World new2D(int width, int height) {
        return new World(width, height);
    }

    @Override
    public void run() {

    }
}
