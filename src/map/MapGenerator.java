package map;

import map.tiles.*;

import java.awt.image.BufferedImage;

public class MapGenerator {

    public Tile[][] tile = new Tile[10][10];

    public MapGenerator(){
        tile[0][0] = new Grass(0, 0);
        tile[0][1] = new Dirt(62, 0);
        tile[0][2] = new GrassDirt(124, 0);
        tile[0][3] = new TunnelX(186, 0);
        tile[0][4] = new TunnelTtop(248, 0);
        tile[0][5] = new TunnelTbottom(310, 0);
        tile[0][6] = new Grass(372, 0);
        tile[0][7] = new Grass(434, 0);
        tile[0][8] = new Grass(496, 0);
        tile[0][9] = new Grass(558, 0);

    }

    public BufferedImage draw(){
        return tile[0][5].image;
    }


}
