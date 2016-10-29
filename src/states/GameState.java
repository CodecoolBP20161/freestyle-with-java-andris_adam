package states;


import entities.creatures.Ant;
import entities.creatures.Player;
import gfx.Assets;
import main.Game;
import utils.Utils;
import worlds.AntPlacementGenerator;
import worlds.WorldGenerator;

import java.awt.*;
import java.util.ArrayList;

public class GameState extends State {

    private WorldGenerator world;
    private AntPlacementGenerator ants;
    private ArrayList<Ant> antObjList = new ArrayList<>();
    private Player player;

    public GameState(Game game){
        super(game);

        world = new WorldGenerator("res/worlds/world1.txt");
        ants = new AntPlacementGenerator("res/worlds/world1positions.txt");
        player = new Player(game, 4, 1, world);
        for (int i = 0; i < ants.antCount; i++) {
            int x = ants.antsList.get(i).get(0);
            int y = ants.antsList.get(i).get(1);
            antObjList.add(new Ant(game, x, y, world, player));
        }
    }

    @Override
    public void tick() {
        world.tick();
        for (Ant anAntObjList : antObjList) { anAntObjList.tick(); }
        player.tick();
    }

    @Override
    public void render(Graphics g) {
        world.render(g);

        for (Ant anAntObjList : antObjList) { anAntObjList.render(g); }
        g.drawImage(Assets.sun, 90, -60, null);
        g.drawImage(Assets.queen, 500, 620, null);
        player.render(g);
    }
}