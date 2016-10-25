package tiles;

import gfx.Assets;

public class TunnelTRightTile extends Tile {
    public TunnelTRightTile(int id) {
        super(Assets.tunnelTright, id);
        this.top = true;
        this.bottom = true;
        this.left = false;
        this.right = true;
    }
}