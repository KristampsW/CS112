package com.snaek.game.entite;

import java.awt.*;

public class Bodypart {
    private int xCoor;
    private int yCoor;
    private int width;
    private int height;

    public Bodypart(int xCoor, int yCoor, int tileSize){
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        width = tileSize;
        height =tileSize;
    }
    public void tick(){

    }
    public  void draw (Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(xCoor * width, yCoor * height, width, height);
        g.setColor(Color.GREEN);
        g.fillRect(xCoor * width +2, yCoor * height +2, width-4, height-4);
    }
}
