package map.tiles;

import gfx.Assets;
import map.Tile;
import java.awt.image.BufferedImage;

public class TunnelTright extends Tile{


    public TunnelTright(int x, int y){
        super(x, y);
        this.top = true;
        this.bottom = true;
        this.left = false;
        this.right = true;
        this.image = Assets.tunnelTright;
    }

}
