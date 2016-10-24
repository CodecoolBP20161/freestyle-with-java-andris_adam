package map.tiles;

import gfx.Assets;
import map.Tile;
import java.awt.image.BufferedImage;

public class TunnelTbottom extends Tile{


    public TunnelTbottom(int x, int y){
        super(x, y);
        this.top = false;
        this.bottom = true;
        this.left = true;
        this.right = true;
        this.image = Assets.tunnelTbottom;
    }

}
