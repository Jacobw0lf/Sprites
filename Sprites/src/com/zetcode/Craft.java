package com.zetcode;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.util.ArrayList;

public class Craft extends Sprite {

    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    private ArrayList<Missile> missiles;

  

    public Craft(int x, int y) {
        super(x, y);
        
        initCraft();
    }
    
    private void initCraft() {
        
        ImageIcon ii = new ImageIcon("images/Soldier.png");
        image = ii.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
       
        x = 20;
        y = 670;   
        
        missiles = new ArrayList();
        loadImage("craft.png"); 
        getImageDimensions();
        
    }
    
    public void move() {
        x += dx;
        y += dy;
    }
    
    public ArrayList getMissiles() {
        return missiles;
    }
    

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return image;
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_ENTER) {
            fire();
        }

        if (key == KeyEvent.VK_A) {
            dx = -1;
        }

        if (key == KeyEvent.VK_D) {
            dx = 1;
        }
            
    }
    
    public void fire() {
        missiles.add(new Missile(x + width, y + height / 2));
    }

    public void keyReleased(KeyEvent e) {
        
        int key = e.getKeyCode();
        
        if (key == KeyEvent.VK_ENTER) {
            fire();
        }
        
        if (key == KeyEvent.VK_A) {
            dx = 0;
        }

        if (key == KeyEvent.VK_D) {
            dx = 0;
        }   
    }
    
}
  