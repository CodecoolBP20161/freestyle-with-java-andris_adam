package tiles;

import gfx.Assets;

public class TunnelEndBottomTile extends Tile {
    public TunnelEndBottomTile(int id) {
        super(Assets.tunnelVer, id);
        this.top = false;
        this.bottom = true;
        this.left = false;
        this.right = false;
    }
}