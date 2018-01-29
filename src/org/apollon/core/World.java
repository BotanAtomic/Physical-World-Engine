package org.apollon.core;

import org.apollon.handler.OutEventHandler;
import org.apollon.object.Entity;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class World {
    private final Executor executor = Executors.newCachedThreadPool();

    private final int width, height;

    private List<Entity> entities;

    private OutEventHandler outEventHandler;

    private long startTime;

    private double gravity;

    private World(int width, int height, double gravity) {
        this.width = width;
        this.height = height;
        this.gravity = gravity
        this.entities = new CopyOnWriteArrayList<>();
    }

    public static World new2D(int width, int height) {
        return new World(width, height, 9.81);
    }

    public static World new2D(int width, int height, double gravity) {
        return new World(width, height, gravity);
    }

    public void setOutEventHandler(OutEventHandler outEventHandler) {
        this.outEventHandler = outEventHandler;
    }

    public void addEntity(Entity entity) {
        this.entities.add(entity);
    }

    public void start() {
        this.startTime = System.currentTimeMillis();

        executor.execute(() -> {
            while(true) {

            }
        });
    }

    public BufferedImage preview() {
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        Graphics2D graphics2D = bufferedImage.createGraphics();

        this.entities.forEach(entity -> entity.draw(graphics2D));

        return bufferedImage;
    }
}
