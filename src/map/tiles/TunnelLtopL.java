package map.tiles;

import gfx.Assets;
import map.Tile;
import java.awt.image.BufferedImage;

public class TunnelLtopL extends Tile{


    public TunnelLtopL(int x, int y){
        super(x, y);
        this.top = true;
        this.bottom = false;
        this.left = true;
        this.right = false;
        this.image = Assets.tunnelLtopL;
    }

}
