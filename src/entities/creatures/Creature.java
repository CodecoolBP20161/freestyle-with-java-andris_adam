package entities.creatures;

import entities.Entity;
import worlds.WorldGenerator;

public abstract class Creature extends Entity {

    protected int health;

    public Creature(float x, float y, WorldGenerator world) {
        super(x, y, world);
        health = 10;
    }
}