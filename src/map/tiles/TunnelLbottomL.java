package map.tiles;

import gfx.Assets;
import map.Tile;
import java.awt.image.BufferedImage;

public class TunnelLbottomL extends Tile{

    public TunnelLbottomL(int x, int y){
        super(x, y);
        this.top = false;
        this.bottom = true;
        this.left = true;
        this.right = false;
        this.image = Assets.tunnelLbottomL;
    }

}
