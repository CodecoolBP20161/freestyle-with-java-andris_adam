package tiles;

import gfx.Assets;

public class TunnelTLeftTile extends Tile {
    public TunnelTLeftTile(int id) {
        super(Assets.tunnelTleft, id);
        this.top = true;
        this.bottom = true;
        this.left = true;
        this.right = false;
    }
}