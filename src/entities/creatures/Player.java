package entities.creatures;


import gfx.Assets;
import main.Game;

import java.awt.*;

public class Player extends Creature {

    private Game game;
    private long timer;
    private long lastTime = System.nanoTime();

    public Player(Game game, float x, float y) {
        super(x, y);
        this.game = game;
    }

    @Override
    public void tick() {
        if (game.getKeyManager().up)
            y -= 3;
        if (game.getKeyManager().down)
            y += 3;
        if (game.getKeyManager().left)
            x -= 3;
        if (game.getKeyManager().right)
            x += 3;
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
            if (timer > 300000000) {
                g.drawImage(Assets.antStayLeft, (int) x, (int) y, null);
            } else {
                g.drawImage(Assets.antRunLeft, (int) x, (int) y, null);
            }
        }
        else if (game.getKeyManager().right) {
            if (timer > 300000000) {
                g.drawImage(Assets.antStayRight, (int) x, (int) y, null);
            } else {
                g.drawImage(Assets.antRunRight, (int) x, (int) y, null);
            }
        }
        else if (game.getKeyManager().up) {
            if (timer > 300000000) {
                g.drawImage(Assets.antStayUp, (int) x, (int) y, null);
            } else {
                g.drawImage(Assets.antRunUp, (int) x, (int) y, null);
            }
        }
        else if (game.getKeyManager().down) {
            if (timer > 300000000) {
                g.drawImage(Assets.antStayDown, (int) x, (int) y, null);
            } else {
                g.drawImage(Assets.antRunDown, (int) x, (int) y, null);
            }
        } else {
            g.drawImage(Assets.antStayLeft, (int) x, (int) y, null);
        }

    }
}