package states;


import entities.creatures.Ant;
import entities.creatures.Player;
import main.Game;
import worlds.WorldGenerator;

import java.awt.*;

public class GameState extends State {

    private Ant ant;
    private WorldGenerator world;

    public GameState(Game game){
        super(game);
        world = new WorldGenerator("res/worlds/world1.txt");
        ant = new Ant(game, 9, 2, world);
    }

    @Override
    public void tick() {
        world.tick();
        ant.tick();
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
        ant.render(g);
    }
}