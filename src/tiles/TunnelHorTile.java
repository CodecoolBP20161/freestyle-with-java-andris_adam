package tiles;

import gfx.Assets;

public class TunnelHorTile extends Tile {
    public TunnelHorTile(int id) {
        super(Assets.tunnelHor, id);
        this.top = false;
        this.bottom = false;
        this.left = true;
        this.right = true;
    }
}