package tiles;

import gfx.Assets;

public class TunnelLTopLTile extends Tile {
    public TunnelLTopLTile(int id) {
        super(Assets.tunnelLtopL, id);
        this.top = true;
        this.bottom = false;
        this.left = true;
        this.right = false;
    }
}