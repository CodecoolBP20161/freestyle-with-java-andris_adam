package map.tiles;

import gfx.Assets;
import map.Tile;
//import java.awt.image.BufferedImage;

public class TunnelX extends Tile{


    public TunnelX(int x, int y){
        super(x, y);
        this.top = true;
        this.bottom = true;
        this.left = true;
        this.right = true;
        this.image = Assets.tunnelx;
    }

}
