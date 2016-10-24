package map.tiles;

import gfx.Assets;
import map.Tile;
import java.awt.image.BufferedImage;

public class TunnelHor extends Tile{

    public TunnelHor(int x, int y){
        super(x, y);
        this.top = false;
        this.bottom = false;
        this.left = true;
        this.right = true;
        this.image = Assets.tunnelHor;
    }

}

