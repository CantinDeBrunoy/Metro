package Controllers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import Views.Panel;



public class KeyController implements KeyListener{
    public Panel panel;
    public KeyController(Panel panel){
        this.panel = panel;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == 65) {
            panel.afficherACPM();
            panel.repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub 
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}