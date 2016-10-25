package tiles;

import gfx.Assets;

public class TunnelLTopRTile extends Tile {
    public TunnelLTopRTile(int id) {
        super(Assets.tunnelLbottomR, id);
        this.top = true;
        this.bottom = false;
        this.left = false;
        this.right = true;
    }
}