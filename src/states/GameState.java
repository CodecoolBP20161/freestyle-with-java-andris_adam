package states;


import entities.creatures.Ant;
import entities.creatures.Player;
import gfx.Assets;
import main.Game;
import map.MapGenerator;

import java.awt.*;

public class GameState extends State {

    private Player player;
    private Ant ant;
    private MapGenerator mapGenerator;

    public GameState(Game game){
        super(game);
//        player = new Player(game, 100, 100);
        ant = new Ant(game, 100, 100);
        mapGenerator = new MapGenerator();
    }

    @Override
    public void tick() {
        ant.tick();
    }

    @Override
    public void render(Graphics g) {
//        g.drawImage(Assets.grass, 10, 10, null);
//        g.drawImage(mapGenerator.draw(), 100, 100, null);
        for (int i = 0; i < mapGenerator.tile.length; i++) {
            for (int j = 0; j < mapGenerator.tile.length; j++) {
                g.drawImage(mapGenerator.tile[0][3].image, j*62, i * 62, null);
            }
        }
        ant.render(g);
    }
}