package states;


import entities.creatures.Player;
import gfx.Assets;
import main.Game;
import map.MapGenerator;

import java.awt.*;

public class GameState extends State {

    private Player player;
    private MapGenerator mapGenerator;

    public GameState(Game game){
        super(game);
        player = new Player(game, 100, 100);
        mapGenerator = new MapGenerator();
    }

    @Override
    public void tick() {
        player.tick();
    }

    @Override
    public void render(Graphics g) {
//        g.drawImage(Assets.grass, 10, 10, null);
//        g.drawImage(mapGenerator.draw(), 100, 100, null);
        for (int i = 0; i < mapGenerator.tile.length; i++) {
            g.drawImage(mapGenerator.tile[0][i].image, 0, i*62, null);
        }
//        player.render(g);
    }
}