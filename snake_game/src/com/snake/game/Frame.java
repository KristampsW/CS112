package com.snake.game;

import com.graphics.Screen;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Snake Game");
        setResizable(true);
        init();
    }
    public void init(){
        setLayout(new GridLayout(1,1,0,0));
        Screen s = new Screen();
        add(s);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String [ ] arg){
        new Frame();
    }
}
