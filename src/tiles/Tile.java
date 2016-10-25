package tiles;


import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {

    public boolean top, bottom, left, right;

    public static Tile[] tiles = new Tile[32];
    public static Tile grassTile = new GrassTile(0);
    public static Tile dirtTile = new DirtTile(1);
    public static Tile grassDirtTile = new GrassDirtTile(2);
    public static Tile tunnelXTile = new TunnelXTile(3);
    public static Tile tunnelTTopTile = new TunnelTTopTile(4);
    public static Tile tunnelTBottomTile = new TunnelTBottomTile(5);
    public static Tile tunnelTLeftTile = new TunnelTLeftTile(6);
    public static Tile tunnelTRightTile = new TunnelTRightTile(7);
    public static Tile tunnelLTopRightTile = new TunnelLTopRTile(8);
    public static Tile tunnelLBottomRightTile = new TunnelLBottomRTile(9);
    public static Tile tunnelLBottomLeftTile = new TunnelLBottomLTile(10);
    public static Tile tunnelLTopLeftTile = new TunnelLTopLTile(11);
    public static Tile tunnelHorTile = new TunnelHorTile(12);
    public static Tile tunnelVerTile = new TunnelVerTile(13);
    public static Tile tunnelEndTopTile = new TunnelEndTopTile(14);
    public static Tile tunnelEndBottomTile = new TunnelEndBottomTile(15);
    public static Tile tunnelEndLeftTile = new TunnelEndLeftTile(17);
    public static Tile tunnelEndRightTile = new TunnelEndRightTile(16);




    public static final int TILEWIDTH = 62;
    public static final int TILEHEIGHT = 62;

    protected BufferedImage texture;
    protected final int id;

    public Tile(BufferedImage texture, int id){
        this.texture = texture;
        this.id = id;
        tiles[id] = this;
    }

    public int getId(){
        return id;
    }

    public void tick(){

    }

    public void render(Graphics g, int x, int y){
        g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
    }

    public boolean isSolid(){
        return false;
    }

}