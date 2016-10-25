package tiles;

import gfx.Assets;

public class TunnelEndLeftTile extends Tile {
    public TunnelEndLeftTile(int id) {
        super(Assets.tunnelHor, id);
        this.top = false;
        this.bottom = false;
        this.left = true;
        this.right = false;
    }
}