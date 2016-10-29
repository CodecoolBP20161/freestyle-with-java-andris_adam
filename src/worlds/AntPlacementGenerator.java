package worlds;

import entities.creatures.Ant;
import main.Game;
import utils.Utils;
import java.awt.*;
import java.util.ArrayList;

public class AntPlacementGenerator {

    public ArrayList<ArrayList<Integer>> antsList = new ArrayList<>();

    public int antCount = 18;

    public AntPlacementGenerator (String path) {
        loadAnts(path);
    }

    public void tick() {

    }

    public void render(Graphics g) {

    }


    public void loadAnts(String path) {
        String string = Utils.loadFileAsString(path);
        String[] tokens = string.split("\\s+");
        int a = 0;
        for (int i = 0; i < antCount; i ++) {
            ArrayList<Integer> antPos = new ArrayList<>();
            int x = Utils.parseInt(tokens[i+a]);
            int y = Utils.parseInt(tokens[i+a+1]);
            a++;
            antPos.add(x);
            antPos.add(y);
            antsList.add(antPos);
        }
    }
}
