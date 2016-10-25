package tiles;

import gfx.Assets;

public class TunnelEndTopTile extends Tile {
    public TunnelEndTopTile(int id) {
        super(Assets.tunnelVer, id);
        this.top = true;
        this.bottom = false;
        this.left = false;
        this.right = false;
    }
}