package gfx;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 60, height = 60;

    public static BufferedImage dirt, grass, stone, tree;

    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));

        grass = sheet.crop(15, 15, width, height);
//        dirt = sheet.crop(width, 0, width, height);

    }
}