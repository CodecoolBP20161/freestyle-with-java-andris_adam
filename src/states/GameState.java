package states;


import entities.creatures.Player;
import gfx.Assets;
import main.Game;
import map.MapGenerator;

import java.awt.*;

public class GameState extends State {

    private Player player;
    private MapGenerator tile;

    public GameState(Game game){
        super(game);
        player = new Player(game, 100, 100);
        tile = new MapGenerator();
    }

    @Override
    public void tick() {
        player.tick();
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.grass, 10, 10, null);
        g.drawImage(tile.draw(), 100, 100, null);
        player.render(g);
    }
}