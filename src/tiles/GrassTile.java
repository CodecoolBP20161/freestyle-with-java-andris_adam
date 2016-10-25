package tiles;

import gfx.Assets;

public class GrassTile extends Tile {
    public GrassTile(int id) {
        super(Assets.grass, id);
        this.top = false;
        this.bottom = false;
        this.left = false;
        this.right = false;
    }
}