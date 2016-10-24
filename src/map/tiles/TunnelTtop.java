package map.tiles;

import gfx.Assets;
import map.Tile;
import java.awt.image.BufferedImage;

public class TunnelTtop extends Tile{


    public TunnelTtop(int x, int y){
        super(x, y);
        this.top = true;
        this.bottom = false;
        this.left = true;
        this.right = true;
        this.image = Assets.tunnelTtop;
    }

}
