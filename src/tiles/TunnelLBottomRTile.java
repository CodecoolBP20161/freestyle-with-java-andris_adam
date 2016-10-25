package tiles;

import gfx.Assets;

public class TunnelLBottomRTile extends Tile {
    public TunnelLBottomRTile(int id) {
        super(Assets.tunnelLbottomR, id);
        this.top = false;
        this.bottom = true;
        this.left = false;
        this.right = true;
    }
}