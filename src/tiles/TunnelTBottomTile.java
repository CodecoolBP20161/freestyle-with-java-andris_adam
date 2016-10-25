package tiles;

import gfx.Assets;

public class TunnelTBottomTile extends Tile {
    public TunnelTBottomTile(int id) {
        super(Assets.tunnelTbottom, id);
        this.top = false;
        this.bottom = true;
        this.left = true;
        this.right = true;
    }
}