package map;

import map.tiles.Grass;

import java.awt.image.BufferedImage;

public class MapGenerator {

    Tile[][] tile = new Tile[10][10];

    public MapGenerator(){
        tile[0][0] = new Grass(0, 0, false, false, false, false);

    }

    public BufferedImage draw(){

    }

}
