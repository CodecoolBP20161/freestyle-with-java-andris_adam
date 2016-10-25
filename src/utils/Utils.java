package utils;

import gfx.Assets;
import tiles.Tile;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.*;

import java.io.*;

public class Utils {
    public static String loadFileAsString(String path){
        StringBuilder builder = new StringBuilder();

        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while((line = br.readLine()) != null){
                builder.append(line + "\n");
            }

            br.close();

        }catch(IOException i){
            i.printStackTrace();
        }

        return builder.toString();
    }

    public static int parseInt(String number){
        try{
            return Integer.parseInt(number);
        }catch(NumberFormatException e){
            e.printStackTrace();
            return 0;
        }
    }

    public static int placeInTileX(float x){
        return (int) (Tile.TILEWIDTH*x + Tile.TILEWIDTH/2) - Assets.ant_width/2;
    }

    public static int placeInTileY(float y){
        return (int) (Tile.TILEHEIGHT*y + Tile.TILEHEIGHT/2)-Assets.ant_height/2;
    }

    public static void playMusic() {
        try{
            File file = new File("/home/handris/CodeCool/freestyle-with-java-andris_adam/src/utils/down_music.mp3");
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);

            Player player  = new Player(bis);
            player.play();

        }catch(JavaLayerException | IOException ex){
            ex.printStackTrace();
        }
    }

}