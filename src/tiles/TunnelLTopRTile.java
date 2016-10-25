package tiles;

import gfx.Assets;

public class TunnelLTopRTile extends Tile {
    public TunnelLTopRTile(int id) {
        super(Assets.tunnelLtopR, id);
        this.top = true;
        this.bottom = false;
        this.left = false;
        this.right = true;
    }
}