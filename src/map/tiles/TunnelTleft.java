package map.tiles;

import gfx.Assets;
import map.Tile;
import java.awt.image.BufferedImage;

public class TunnelTleft extends Tile{


    public TunnelTleft(int x, int y){
        super(x, y);
        this.top = true;
        this.bottom = true;
        this.left = true;
        this.right = false;
        this.image = Assets.tunnelTleft;
    }

}
