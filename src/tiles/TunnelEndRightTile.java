package tiles;

import gfx.Assets;

public class TunnelEndRightTile extends Tile {
    public TunnelEndRightTile(int id) {
        super(Assets.tunnelHor, id);
        this.top = false;
        this.bottom = false;
        this.left = false;
        this.right = true;
    }
}