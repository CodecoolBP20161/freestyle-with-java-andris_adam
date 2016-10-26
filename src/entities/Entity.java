package entities;

import tiles.Tile;
import worlds.WorldGenerator;

import java.awt.*;

public abstract class Entity {

    protected float x, y;
    protected WorldGenerator world;

    public Entity(float x, float y, WorldGenerator world){
        this.x = x;
        this.y = y;
        this.world = world;
    }

    public abstract void tick();
    public abstract void render(Graphics g);

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getTileX(){
        return (int) this.x / Tile.TILEWIDTH;
    }

    public int getTileY(){
        return (int) this.y / Tile.TILEHEIGHT;
    }

}