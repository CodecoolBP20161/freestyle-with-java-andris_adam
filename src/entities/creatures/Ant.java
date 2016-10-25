package entities.creatures;

import gfx.Assets;
import main.Game;
import tiles.Tile;
import utils.Utils;
import worlds.WorldGenerator;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Ant extends Creature {

    private Game game;
    private long timer;
    private long lastTime = System.nanoTime();
    private String last = "";
    private String movement = "left";

    public Ant(Game game, float x, float y, WorldGenerator world) {
        super(Utils.placeInTileX(x), Utils.placeInTileY(y), world);
        this.game = game;
    }

    @Override
    public void tick() {
//        Tile currentTile = this.world.getTile(this.getTileX(), this.getTileY());
//        System.out.println(currentTile);

        if (movement.equals("top"))
            y -= 1;
        if (movement.equals("bottom"))
            y += 1;
        if (movement.equals("left"))
            x -= 1;
        if (movement.equals("right"))
            x += 1;

        int tempX = (int) this.x - this.getTileX()*Tile.TILEWIDTH + Assets.ant_width/2;
        int tempY = (int) this.y - this.getTileY()*Tile.TILEHEIGHT + Assets.ant_height/2;
//        System.out.println(tempY + " " + tempX);
//        System.out.println();
        if((tempX > 30 && tempX < 32) && (tempY > 30 && tempY < 32)) {
            this.movement = this.decideDirection();

        }

    }

    public String decideDirection(){
        Tile currentTile = this.world.getTile(getTileX(), getTileY());
        ArrayList<String> options = new ArrayList<>();
        if(currentTile.top){ options.add("top"); }
        if(currentTile.bottom){ options.add("bottom"); }
        if(currentTile.left){ options.add("left"); }
        if(currentTile.right){ options.add("right"); }

        int idx = new Random().nextInt(options.size());
        return options.get(idx);
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