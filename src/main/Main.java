package main;


import utils.Utils;

public class Main {
    public static void main(String[] args){

//        Utils.playMusic();
        Game game = new Game("Niche", 620, 682);
        game.start();
    }
}