package entities.creatures;

import entities.Entity;
import worlds.WorldGenerator;

public abstract class Creature extends Entity {

    protected boolean alive;

    public Creature(float x, float y, WorldGenerator world) {
        super(x, y, world);
        alive = true;
    }
}