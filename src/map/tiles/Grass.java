package map.tiles;

import gfx.Assets;
import map.Tile;
//import java.awt.image.BufferedImage;

public class Grass extends Tile{

    public Grass(int x, int y){
        super(x, y);
        this.top = false;
        this.bottom = false;
        this.left = false;
        this.right = false;
        this.image = Assets.grass;
    }

}