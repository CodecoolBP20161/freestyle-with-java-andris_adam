package tiles;

import gfx.Assets;

public class SunTile extends Tile {
    public SunTile(int id) {
        super(Assets.sunTile, id);
        this.top = true;
        this.bottom = true;
        this.left = false;
        this.right = false;
    }
}