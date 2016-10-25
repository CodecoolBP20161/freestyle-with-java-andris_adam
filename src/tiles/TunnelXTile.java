package tiles;

import gfx.Assets;

public class TunnelXTile extends Tile {
    public TunnelXTile(int id) {
        super(Assets.tunnelx, id);
        this.top = true;
        this.bottom = true;
        this.left = true;
        this.right = true;
    }
}