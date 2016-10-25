package tiles;

import gfx.Assets;

public class TunnelVerTile extends Tile {
    public TunnelVerTile(int id) {
        super(Assets.tunnelVer, id);
        this.top = true;
        this.bottom = true;
        this.left = false;
        this.right = false;
    }
}