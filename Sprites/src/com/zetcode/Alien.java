package com.zetcode;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Alien extends Sprite {

    private final int INITIAL_X = 400;

    public Alien(int x, int y) {
        super(x, y);

        initAlien();
    }

    private void initAlien() {

    	  ImageIcon ii = new ImageIcon("images/newZombie.png");
          image = ii.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
         
          x = 20;
          y = 670;   
          
    }

    public void move() {

        if (x < 0) {
            x = INITIAL_X;
        }

        x -= 1;
    }
}
