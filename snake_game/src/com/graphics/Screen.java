package com.graphics;
import com.snaek.game.entite.Bodypart;

import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;

public class Screen extends JPanel implements Runnable {
    private static final long  serialVersionUID = 1L;
    public static final int WIDTH = 800, HEIGHT = 800;
    private Thread thread;
    private boolean running = false;
    private Bodypart b;
    private ArrayList<Bodypart> snake;
    private int xCoor=10;
    private int yCoor=10;
    private int size=5;
    public Screen(){
        snake = new ArrayList<Bodypart>();
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        start();
    }
    public void start(){
        running = true;
        thread = new Thread(this, "Game Loop");
        thread.start();

    }
    public void tick(){
        if(snake.size() == 0){
            b = new Bodypart(xCoor,yCoor,10);
            snake.add(b);
        }

    }
    public void paint(Graphics g){
        for(int i = 0; i < WIDTH/10; i++ ){
            g.drawLine(i*10,0,i*10,HEIGHT);
        }
        for(int i = 0; i<HEIGHT/10 ; i++){
            g.drawLine(0,i*10,WIDTH, i*10);
        }
        for(int i = 0; i <snake.size(); i++){
            snake.get(i).draw(g);
        }
    }
    public void stop(){

    }
    public void run(){
        while (running){
            tick();
            repaint();
        }

    }

}
