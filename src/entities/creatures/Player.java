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
    private static final Integer[] VALUES = new Integer[] {28, 29, 30, 31, 32};
    public ArrayList<ArrayList<Double>> tongueBits = new ArrayList<>();


    public Player(Game game, float x, float y, WorldGenerator world) {
        super(Utils.placePlayerInTileX(x), Utils.placePlayerInTileY(y), world);
        this.game = game;

    }

    @Override
    public void tick() {
        Tile currentTile = this.world.getTile(getTileX(), getTileY());
        int tempX = (int) this.x - this.getTileX()*Tile.TILEWIDTH + Assets.tongue_width/2;
        int tempY = (int) this.y - this.getTileY()*Tile.TILEHEIGHT + Assets.tongue_height/2;

        if(game.getKeyManager().up) {
            ArrayList<Double> bits = new ArrayList<>();
            ArrayList<Double> range = new ArrayList<>();
            ArrayList<Double> range1 = new ArrayList<>();
            ArrayList<Double> range2 = new ArrayList<>();
            range.add((double) this.x+2);
            range.add((double) this.x-2);
            range1.add((double) this.y+2);
            range1.add((double) this.y-2);
            range.add((double) 0);
            range1.add((double) 0);
            range2.add((double) this.x+2);
            range2.add((double) this.x-2);
            range2.add((double) 0);
            bits.add((double) this.x);
            bits.add((double) this.y);
            bits.add((double) 0);

            if(!currentTile.top && tempY > 31) {
                y -= 2;
                if(tongueBits.contains(bits) || tongueBits.contains(range) || tongueBits.contains(range1)){
                    tongueBits.remove(bits);
                    tongueBits.remove(tongueBits.size()-1);

                }else{
                    tongueBits.add(bits);
                }
            }
            else if (currentTile.top && Arrays.asList(VALUES).contains(tempX) ){
                y -= 2;
                if(tongueBits.contains(bits) || tongueBits.contains(range) || tongueBits.contains(range1)){
                    tongueBits.remove(bits);
                    tongueBits.remove(tongueBits.size()-1);

                }else{
                    tongueBits.add(bits);
                }
            }
            else { y -= 0; } }
        if(game.getKeyManager().down) {
            ArrayList<Double> bits = new ArrayList<>();
            ArrayList<Double> range = new ArrayList<>();
            ArrayList<Double> range1 = new ArrayList<>();
            ArrayList<Double> range2 = new ArrayList<>();
            range.add((double) this.x+2);
            range.add((double) this.x-2);
            range1.add((double) this.y+2);
            range1.add((double) this.y-2);
            range.add((double) 0);
            range1.add((double) 0);
            range2.add((double) this.x+2);
            range2.add((double) this.x-2);
            range2.add((double) 0);
            bits.add((double) this.x);
            bits.add((double) this.y);
            bits.add((double) 0);

            if(!currentTile.bottom && tempY < 31) {
                y += 2;
                if(tongueBits.contains(bits) || tongueBits.contains(range) || tongueBits.contains(range1)){
                    tongueBits.remove(bits);
                    tongueBits.remove(tongueBits.size()-1);

                }else{
                    tongueBits.add(bits);
                }
            }
            else if (currentTile.bottom && Arrays.asList(VALUES).contains(tempX) ){
                y += 2;
                if(tongueBits.contains(bits) || tongueBits.contains(range) || tongueBits.contains(range1)){
                    tongueBits.remove(bits);
                    tongueBits.remove(tongueBits.size()-1);

                }else{
                    tongueBits.add(bits);
                }
            }
            else { y += 0; } }
        if(game.getKeyManager().left) {
            ArrayList<Double> bits = new ArrayList<>();
            ArrayList<Double> range = new ArrayList<>();
            ArrayList<Double> range1 = new ArrayList<>();
            ArrayList<Double> range2 = new ArrayList<>();
            range.add((double) this.x+2);
            range.add((double) this.x-2);
            range1.add((double) this.y+2);
            range1.add((double) this.y-2);
            range.add((double) 1);
            range1.add((double) 1);
            range2.add((double) this.x+2);
            range2.add((double) this.x-2);
            range2.add((double) 0);
            bits.add((double) this.x);
            bits.add((double) this.y);
            bits.add((double) 1);

            if(!currentTile.left && tempX > 31) {
                x -= 2;
                if(tongueBits.contains(bits) || tongueBits.contains(range) || tongueBits.contains(range1)){
                    tongueBits.remove(bits);
                    tongueBits.remove(tongueBits.size()-1);

                }else{
                    tongueBits.add(bits);
                }
            }
            else if (currentTile.left && Arrays.asList(VALUES).contains(tempY)) {
                x -= 2;
                if(tongueBits.contains(bits) || tongueBits.contains(range) || tongueBits.contains(range1)){
                    tongueBits.remove(bits);
                    tongueBits.remove(tongueBits.size()-1);

                }else{
                    tongueBits.add(bits);
                }
            }
            else { x -= 0; } }
        if(game.getKeyManager().right) {
            ArrayList<Double> bits = new ArrayList<>();
            ArrayList<Double> range = new ArrayList<>();
            ArrayList<Double> range1 = new ArrayList<>();
            ArrayList<Double> range2 = new ArrayList<>();
            range.add((double) this.x+2);
            range.add((double) this.x-2);
            range1.add((double) this.y+2);
            range1.add((double) this.y-2);
            range.add((double) 1);
            range1.add((double) 1);
            range2.add((double) this.x+2);
            range2.add((double) this.x-2);
            range2.add((double) 0);
            bits.add((double) this.x);
            bits.add((double) this.y);
            bits.add((double) 1);

            if(!currentTile.right && tempX < 31) {
                x += 2;
                if(tongueBits.contains(bits) || tongueBits.contains(range) || tongueBits.contains(range1)){
                    tongueBits.remove(bits);
                    tongueBits.remove(tongueBits.size()-1);

                }else{
                    tongueBits.add(bits);
                }
            }
            else if (currentTile.right && Arrays.asList(VALUES).contains(tempY)) {
                x += 2;
                if(tongueBits.contains(bits) || tongueBits.contains(range) || tongueBits.contains(range1)){
                    tongueBits.remove(bits);
                    tongueBits.remove(tongueBits.size()-1);

                }else{
                    tongueBits.add(bits);
                }
            }
            else { x += 0; } }
    }

    // TODO: egyszerre ne működjön le és fel

    @Override
    public void render(Graphics g) {

        for (ArrayList<Double> tongueBit : tongueBits) {
            if (tongueBit.get(2) == (double) 0) {
                g.drawImage(Assets.tongueBitVer, tongueBit.get(0).intValue(), tongueBit.get(1).intValue(), null);
            } else {
                g.drawImage(Assets.tongueBitHor, tongueBit.get(0).intValue(), tongueBit.get(1).intValue(), null);
            }
        }

        if(game.getKeyManager().up) {
            g.drawImage(Assets.tongueTipDown, (int) x, (int) y, null);

            last = "up";
        }
        if(game.getKeyManager().down) {
            g.drawImage(Assets.tongueTipDown, (int) x, (int) y, null);

            last = "down";
        }
        else if(game.getKeyManager().left) {
            g.drawImage(Assets.tongueTipLeft, (int) x, (int) y, null);

            last = "left";
        }
        else if(game.getKeyManager().right) {
            g.drawImage(Assets.tongueTipRight, (int) x, (int) y, null);

            last = "right";
        }
        else if (last.equals("up"))
            g.drawImage(Assets.tongueTipDown, (int) x, (int) y, null);
        else if (last.equals("down"))
            g.drawImage(Assets.tongueTipDown, (int) x, (int) y, null);
        else if (last.equals("right"))
            g.drawImage(Assets.tongueTipRight, (int) x, (int) y, null);
        else if (last.equals("left"))
            g.drawImage(Assets.tongueTipLeft, (int) x, (int) y, null);
    }


}