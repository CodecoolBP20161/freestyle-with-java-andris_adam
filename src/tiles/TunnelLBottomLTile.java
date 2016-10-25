package tiles;

import gfx.Assets;

public class TunnelLBottomLTile extends Tile {
    public TunnelLBottomLTile(int id) {
        super(Assets.tunnelLbottomL, id);
        this.top = false;
        this.bottom = true;
        this.left = true;
        this.right = false;
    }
}