package map.tiles;

import gfx.Assets;
import map.Tile;
import java.awt.image.BufferedImage;

public class TunnelLtopR extends Tile{


    public TunnelLtopR(int x, int y, boolean top){
        super(x, y);
        this.top = true;
        this.bottom = false;
        this.left = false;
        this.right = true;
        this.image = Assets.tunnelLtopR;
    }

}
