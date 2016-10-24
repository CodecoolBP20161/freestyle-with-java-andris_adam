package gfx;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 62, height = 62;

    public static BufferedImage grass, dirt, grassDirt, tunnelx, tunnelTtop, tunnelTbottom, tunnelTleft, tunnelTright,
    tunnelLtopR, tunnelLtopL, tunnelLbottomL, tunnelLbottomR, tunnelHor, tunnelVer;

    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheet.png"));

        grass = sheet.crop(15, 15, width, height);
        dirt = sheet.crop(280, 81, width, height);
        grassDirt = sheet.crop(280, 15, width, height);
        tunnelx = sheet.crop(213, 279, width, height);
        tunnelTtop = sheet.crop(147, 213, width, height);
        tunnelTbottom = sheet.crop(147, 147, width, height);
        tunnelTleft = sheet.crop(15, 81, width, height); // NINCS ILYEN A SHEET-BEN !!! --done
        tunnelTright = sheet.crop(81, 81, width, height); // NINCS ILYEN A SHEET-BEN !!! --done
        tunnelLtopR = sheet.crop(15, 146, width, height);
        tunnelLtopL = sheet.crop(279, 279, width, height);
        tunnelLbottomL = sheet.crop(279, 147, width, height);
        tunnelLbottomR = sheet.crop(147, 81, width, height); // NINCS ILYEN A SHEET-BEN !!! --done
        tunnelHor = sheet.crop(477, 279, width, height);
        tunnelVer = sheet.crop(477, 213, width, height);

    }
}