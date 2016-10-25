package tiles;

import gfx.Assets;

public class GrassDirtTile extends Tile {
    public GrassDirtTile(int id) {
        super(Assets.dirt, id);
        this.top = false;
        this.bottom = false;
        this.left = false;
        this.right = false;
    }
}

// TODO:
//átírni az assets.dirtet