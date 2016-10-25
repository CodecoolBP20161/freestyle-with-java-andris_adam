package tiles;

import gfx.Assets;

public class TunnelTTopTile extends Tile {
    public TunnelTTopTile(int id) {
        super(Assets.tunnelTtop, id);
        this.top = true;
        this.bottom = false;
        this.left = true;
        this.right = true;
    }
}