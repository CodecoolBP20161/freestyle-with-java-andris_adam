package entities.creatures;


import gfx.Assets;
import main.Game;
import worlds.WorldGenerator;

import java.awt.*;

public class Player extends Creature{

    private Game game;

    public Player(Game game, float x, float y, WorldGenerator world) {
        super(x, y, world);
        this.game = game;
    }

    @Override
    public void tick() {
        if(game.getKeyManager().up)
            y -= 3;
        if(game.getKeyManager().down)
            y += 3;
        if(game.getKeyManager().left)
            x -= 3;
        if(game.getKeyManager().right)
            x += 3;
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.grass, (int) x, (int) y, null);
    }


}