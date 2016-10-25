package gfx;

import java.awt.image.BufferedImage;

public class Assets {

    private static final int width = 62, height = 62;
    public static final int ant_width = 27, ant_height = 22;
    private static final int sun_width = 193, sun_height = 132;

    public static BufferedImage grass, dirt, grassDirt, tunnelx, tunnelTtop, tunnelTbottom, tunnelTleft, tunnelTright,
    tunnelLtopR, tunnelLtopL, tunnelLbottomL, tunnelLbottomR, tunnelHor, tunnelVer, antStayLeft, antRunLeft,
    antStayRight, antRunRight, antStayUpLeft, antRunUpLeft, antStayUpRight, antRunUpRight, antStayDownLeft,
    antRunDownLeft, antStayDownRight, antRunDownRight, sun, tunnelEndLeft, tunnelEndRight, tunnelEndTop, tunnelEndBottom,
    sunTile;

    public static void init(){
        SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/sheetv2.png"));

        grass = sheet.crop(15, 15, width, height);
        dirt = sheet.crop(279, 81, width, height);
        grassDirt = sheet.crop(279, 15, width, height);
        tunnelx = sheet.crop(213, 279, width, height);
        tunnelTtop = sheet.crop(147, 213, width, height);
        tunnelTbottom = sheet.crop(147, 147, width, height);
        tunnelTleft = sheet.crop(15, 81, width, height);
        tunnelTright = sheet.crop(81, 81, width, height);
        tunnelLtopR = sheet.crop(15, 146, width, height);
        tunnelLtopL = sheet.crop(279, 279, width, height);
        tunnelLbottomL = sheet.crop(279, 147, width, height);
        tunnelLbottomR = sheet.crop(147, 81, width, height);
        tunnelHor = sheet.crop(477, 279, width, height);
        tunnelVer = sheet.crop(477, 213, width, height);
        tunnelEndLeft = sheet.crop(411, 147, width, height);
        tunnelEndRight = sheet.crop(411, 213, width, height);
        tunnelEndTop = sheet.crop(411, 81, width, height);
        tunnelEndBottom = sheet.crop(411, 279, width, height);
        sunTile = sheet.crop(411, 15, width, height);


        SpriteSheet ants = new SpriteSheet(ImageLoader.loadImage("/textures/ants.png"));

        antStayLeft = ants.crop(20, 14, ant_width, ant_height);
        antRunLeft = ants.crop(51, 14, ant_width, ant_height);
        antStayRight = ants.crop(150, 43, ant_width, ant_height);
        antRunRight = ants.crop(119, 43, ant_width, ant_height);
        antStayUpLeft = ants.crop(51, 71, ant_height, ant_width);
        antRunUpLeft = ants.crop(51, 103, ant_height, ant_width);
        antStayUpRight = ants.crop(81, 72, ant_height, ant_width);
        antRunUpRight = ants.crop(81, 103, ant_height, ant_width);
        antStayDownLeft = ants.crop(113, 201, ant_height, ant_width);
        antRunDownLeft = ants.crop(113, 170, ant_height, ant_width);
        antStayDownRight = ants.crop(23, 202, ant_height, ant_width);
        antRunDownRight = ants.crop(24, 171, ant_height, ant_width);

        SpriteSheet suns = new SpriteSheet(ImageLoader.loadImage("/textures/sunnew.png"));

        sun = suns.crop(24, 53, sun_width, sun_height);

        SpriteSheet tounge = new SpriteSheet(ImageLoader.loadImage("/textures/sheetv2.png"));

    }
}