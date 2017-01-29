package com.zetcode;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class CollisionEx extends JFrame {

    public CollisionEx() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        
        setResizable(true);
        pack();
        
        setTitle("PLatformer");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                CollisionEx ex = new CollisionEx();
                ex.setVisible(true);
            }
        });
    }
}