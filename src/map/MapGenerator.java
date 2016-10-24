package map;

import map.tiles.Grass;

import java.awt.image.BufferedImage;

public class MapGenerator {

    Tile[][] tile = new Tile[10][10];

    public MapGenerator(){
        tile[0][0] = new Grass(0, 0, false, false, false, false);
        tile[0][1] = new Grass(60, 0, false, false, false, false);
        tile[0][2] = new Grass(120, 0, false, false, false, false);
        tile[0][3] = new Grass(180, 0, false, false, false, false);
        tile[0][4] = new Grass(240, 0, false, false, false, false);
        tile[0][5] = new Grass(300, 0, false, false, false, false);
        tile[0][6] = new Grass(360, 0, false, false, false, false);
        tile[0][7] = new Grass(420, 0, false, false, false, false);
        tile[0][8] = new Grass(480, 0, false, false, false, false);
        tile[0][9] = new Grass(540, 0, false, false, false, false);

    }

    public BufferedImage draw(){
        return tile[0][0].image;
    }

}
