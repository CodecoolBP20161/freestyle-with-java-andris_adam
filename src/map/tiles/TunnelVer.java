package map.tiles;

import gfx.Assets;
import map.Tile;
import java.awt.image.BufferedImage;

public class TunnelVer extends Tile{


    public TunnelVer(int x, int y){
        super(x, y);
        this.top = true;
        this.bottom = true;
        this.left = false;
        this.right = false;
        this.image = Assets.tunnelVer;
    }

}
