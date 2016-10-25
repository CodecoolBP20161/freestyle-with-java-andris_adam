package states;


import entities.creatures.Ant;
import entities.creatures.Player;
import main.Game;
import worlds.WorldGenerator;

import java.awt.*;

public class GameState extends State {

    private Ant ant, ant1, ant2, ant3, ant4, ant5, ant6, ant7, ant8;
    private WorldGenerator world;

    public GameState(Game game){
        super(game);
        world = new WorldGenerator("res/worlds/world1.txt");
        ant = new Ant(game, 9, 2, world);
        ant1 = new Ant(game, 9, 2, world);
        ant2 = new Ant(game, 9, 2, world);
        ant3 = new Ant(game, 9, 2, world);
        ant4 = new Ant(game, 9, 2, world);
        ant5 = new Ant(game, 9, 2, world);
        ant6 = new Ant(game, 9, 2, world);
        ant7 = new Ant(game, 9, 2, world);
        ant8 = new Ant(game, 9, 2, world);
//        ant2 = new Ant(game, 8, 8, world);
    }

    @Override
    public void tick() {
        world.tick();
        ant.tick();
        ant1.tick();
        ant2.tick();
        ant3.tick();
        ant4.tick();
        ant5.tick();
        ant6.tick();
        ant7.tick();
        ant8.tick();
//        ant2.tick();

    }

    @Override
    public void render(Graphics g) {
        world.render(g);
        ant.render(g);
        ant1.render(g);
        ant2.render(g);
        ant3.render(g);
        ant4.render(g);
        ant5.render(g);
        ant6.render(g);
        ant7.render(g);
        ant8.render(g);
//        ant2.render(g);

    }
}