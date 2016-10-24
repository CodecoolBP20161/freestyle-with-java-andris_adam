package map.tiles;

import gfx.Assets;
import map.Tile;
import java.awt.image.BufferedImage;

public class TunnelLbottomR extends Tile{

    public TunnelLbottomR(int x, int y){
        super(x, y);
        this.top = false;
        this.bottom = true;
        this.left = false;
        this.right = true;
        this.image = Assets.tunnelLbottomR;
    }

}

