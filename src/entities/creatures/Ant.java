package entities.creatures;

import gfx.Assets;
import main.Game;
import states.GameState;
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
        if (movement.equals("left")) {
            last = "left";
            if (timer > 300000000) { g.drawImage(Assets.antStayLeft, (int) x, (int) y, null); }
            else { g.drawImage(Assets.antRunLeft, (int) x, (int) y, null); }
        }
        else if (movement.equals("right")) {
            last = "right";
            if (timer > 300000000) { g.drawImage(Assets.antStayRight, (int) x, (int) y, null); }
            else { g.drawImage(Assets.antRunRight, (int) x, (int) y, null); }
        }
        else if (movement.equals("top")) {
            switch (last) {
                case "left":
                    if (timer > 300000000) {
                        g.drawImage(Assets.antStayUpLeft, (int) x, (int) y, null);
                    } else {
                        g.drawImage(Assets.antRunUpLeft, (int) x, (int) y, null);
                    }
                    break;
                case "right":
                    if (timer > 300000000) {
                        g.drawImage(Assets.antStayUpRight, (int) x, (int) y, null);
                    } else {
                        g.drawImage(Assets.antRunUpRight, (int) x, (int) y, null);
                    }
                    break;
                default:
                    if (timer > 300000000) {
                        g.drawImage(Assets.antStayUpRight, (int) x, (int) y, null);
                    } else {
                        g.drawImage(Assets.antRunUpRight, (int) x, (int) y, null);
                    }
                    break;
            }
            last = "up";
        }
        else if (movement.equals("bottom")) {
            switch (last) {
                case "left":
                    if (timer > 300000000) {
                        g.drawImage(Assets.antStayDownLeft, (int) x, (int) y, null);
                    } else {
                        g.drawImage(Assets.antRunDownLeft, (int) x, (int) y, null);
                    }
                    break;
                case "right":
                    if (timer > 300000000) {
                        g.drawImage(Assets.antStayDownRight, (int) x, (int) y, null);
                    } else {
                        g.drawImage(Assets.antRunDownRight, (int) x, (int) y, null);
                    }
                    break;
                default:
                    if (timer > 300000000) {
                        g.drawImage(Assets.antStayDownRight, (int) x, (int) y, null);
                    } else {
                        g.drawImage(Assets.antRunDownRight, (int) x, (int) y, null);
                    }
                    break;
            }
            last = "down";

        } else if (last.equals("left")){ g.drawImage(Assets.antStayLeft, (int) x, (int) y, null); }
        else if (last.equals("right")) { g.drawImage(Assets.antStayRight, (int) x, (int) y, null); }
        else if (last.equals("up")) { g.drawImage(Assets.antStayUpLeft, (int) x, (int) y, null); }
        else if (last.equals("down")) { g.drawImage(Assets.antStayDownLeft, (int) x, (int) y, null); }
        else { g.drawImage(Assets.antStayLeft, (int) x, (int) y, null); }

    }

}