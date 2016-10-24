package map;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Tile {

    protected int x, y;
    protected boolean top, bottom, left, right;
    public BufferedImage image;

    public Tile(int x, int y){
        this.x = x;
        this.y = y;
    }


}