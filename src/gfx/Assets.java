package gfx;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 32, height = 32;

    public static BufferedImage player, dirt, grass, stone, tree;

    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sun.jpg"));

        player = sheet.crop(0, 0, width, height);
//        dirt = sheet.crop(width, 0, width, height);

    }
}