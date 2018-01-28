package org.apollon.core;

import org.apollon.handler.OutEventHandler;
import org.apollon.object.Entity;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class World {
    private final int width, height;

    private List<Entity> entities;

    private OutEventHandler outEventHandler;

    private World(int width, int height) {
        this.width = width;
        this.height = height;
        this.entities = new CopyOnWriteArrayList<>();
    }

    public static World new2D(int width, int height) {
        return new World(width, height);
    }


    public void setOutEventHandler(OutEventHandler outEventHandler) {
        this.outEventHandler = outEventHandler;
    }
}
