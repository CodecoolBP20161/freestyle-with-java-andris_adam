package entities.creatures;

import gfx.Assets;
import main.Game;
import tiles.Tile;
import utils.Utils;
import worlds.WorldGenerator;

import java.awt.*;

public class Ant extends Creature {

    private Game game;
    private long timer;
    private long lastTime = System.nanoTime();
    private String last = "";

    public Ant(Game game, float x, float y, WorldGenerator world) {
        super(Utils.placeInTileX(x), Utils.placeInTileY(y), world);
        this.game = game;
    }

    @Override
    public void tick() {
//        Tile currentTile = this.world.getTile(this.getTileX(), this.getTileY());
//        System.out.println(currentTile);

//        if (game.getKeyManager().up)
//            y -= 3;
//        if (game.getKeyManager().down)
//            y += 3;
//        if (game.getKeyManager().left)
//            x -= 3;
//        if (game.getKeyManager().right)
//            x += 3;

        x-=1;

    }

    @Override
    public void render(Graphics g) {
        long now = System.nanoTime();
        timer += now - lastTime;
        lastTime = now;
        if (timer > 600000000) {
            timer = 0;
        }
        if (game.getKeyManager().left) {
            last = "left";
            if (timer > 300000000) { g.drawImage(Assets.antStayLeft, (int) x, (int) y, null); }
            else { g.drawImage(Assets.antRunLeft, (int) x, (int) y, null); }
        }
        else if (game.getKeyManager().right) {
            last = "right";
            if (timer > 300000000) { g.drawImage(Assets.antStayRight, (int) x, (int) y, null); }
            else { g.drawImage(Assets.antRunRight, (int) x, (int) y, null); }
        }
        else if (game.getKeyManager().up) {
            last = "up";
            if (timer > 300000000) { g.drawImage(Assets.antStayUp, (int) x, (int) y, null); }
            else { g.drawImage(Assets.antRunUp, (int) x, (int) y, null); }
        }
        else if (game.getKeyManager().down) {
            last = "down";
            if (timer > 300000000) { g.drawImage(Assets.antStayDown, (int) x, (int) y, null); }
            else { g.drawImage(Assets.antRunDown, (int) x, (int) y, null); }

        } else if (last.equals("left")){ g.drawImage(Assets.antStayLeft, (int) x, (int) y, null); }
        else if (last.equals("right")) { g.drawImage(Assets.antStayRight, (int) x, (int) y, null); }
        else if (last.equals("up")) { g.drawImage(Assets.antStayUp, (int) x, (int) y, null); }
        else if (last.equals("down")) { g.drawImage(Assets.antStayDown, (int) x, (int) y, null); }
        else { g.drawImage(Assets.antStayLeft, (int) x, (int) y, null); }

    }

}