package map.tiles;

import map.Tile;
import java.awt.image.BufferedImage;

public class Grass extends Tile{

    public static BufferedImage image;

    public Grass(int x, int y, boolean top, boolean bottom, boolean left, boolean right){
        super(x, y);
        this.top = top;
        this.bottom = bottom;
        this.left = left;
        this.right = right;
    }

}
