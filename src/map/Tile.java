package map;

import java.awt.*;

public abstract class Tile {

    protected int x, y;
    protected boolean top, bottom, left, right;

    public Tile(int x, int y){
        this.x = x;
        this.y = y;
    }


}