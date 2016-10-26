package entities.creatures;


import gfx.Assets;
import main.Game;
import tiles.Tile;
import utils.Utils;
import worlds.WorldGenerator;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Player extends Creature{

    private String last = "down";
    private Game game;
    private static final Integer[] VALUES = new Integer[] {27, 28, 29, 30, 31, 32, 33};

    public Player(Game game, float x, float y, WorldGenerator world) {
        super(Utils.placePlayerInTileX(x), Utils.placePlayerInTileY(y), world);
        this.game = game;
    }

    @Override
    public void tick() {
        Tile currentTile = this.world.getTile(getTileX(), getTileY());
        int tempX = (int) this.x - this.getTileX()*Tile.TILEWIDTH + Assets.tongue_width/2;
        int tempY = (int) this.y - this.getTileY()*Tile.TILEHEIGHT + Assets.tongue_height/2;
        System.out.println(tempX);
        System.out.println(tempY);
        System.out.println();
        if(game.getKeyManager().up)
            if(!currentTile.top && tempY > 31) { y -= 2; }
            else if (currentTile.top && Arrays.asList(VALUES).contains(tempX) ){ y -= 2; }
            else { y -= 0; }
        if(game.getKeyManager().down)
            if(!currentTile.bottom && tempY < 31) { y += 2; }
            else if (currentTile.bottom && Arrays.asList(VALUES).contains(tempX) ){ y += 2; }
            else { y += 0; }
        if(game.getKeyManager().left)
            if(!currentTile.left && tempX > 31) { x -= 2; }
            else if (currentTile.left && Arrays.asList(VALUES).contains(tempY)) { x -= 2; }
            else { x -= 0; }
        if(game.getKeyManager().right)
            if(!currentTile.right && tempX < 31) { x += 2; }
            else if (currentTile.right && Arrays.asList(VALUES).contains(tempY)) { x += 2; }
            else { x += 0; }
    }

    @Override
    public void render(Graphics g) {
        if(game.getKeyManager().down || game.getKeyManager().up) {
            g.drawImage(Assets.tongueTipDown, (int) x, (int) y, null);
//            g.drawImage(Assets.tongueBitHor, (int) this.x-Assets.tongueBitWidth/2, (int) this.y-Assets.tongueBitHeight/2, null);
            last = "down";
        }
        else if(game.getKeyManager().left) {
            g.drawImage(Assets.tongueTipLeft, (int) x, (int) y, null);
//            g.drawImage(Assets.tongueBitVer, (int) this.x-Assets.tongueBitWidth/2, (int) this.y-Assets.tongueBitHeight/2, null);
            last = "left";
        }
        else if(game.getKeyManager().right) {
            g.drawImage(Assets.tongueTipRight, (int) x, (int) y, null);
//            g.drawImage(Assets.tongueBitHor, (int) this.x-Assets.tongueBitWidth/2, (int) this.y-Assets.tongueBitHeight/2, null);
            last = "right";
        }
        else if (last.equals("down"))
            g.drawImage(Assets.tongueTipDown, (int) x, (int) y, null);
        else if (last.equals("right"))
            g.drawImage(Assets.tongueTipRight, (int) x, (int) y, null);
        else if (last.equals("left"))
            g.drawImage(Assets.tongueTipLeft, (int) x, (int) y, null);
    }


}