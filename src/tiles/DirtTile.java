package tiles;

import gfx.Assets;

public class DirtTile extends Tile {
    public DirtTile(int id) {
        super(Assets.dirt, id);
        this.top = false;
        this.bottom = false;
        this.left = false;
        this.right = false;
    }
}