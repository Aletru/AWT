package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Gui17 extends JFrame{
    JButton boton;
    List lista;
    Container panel;
    public Gui17 (){
        this.addMouseMotionListener(new OyenteMover());
    }
    class OyenteMover implements MouseMotionListener{
        @Override
        public void mouseDragged(MouseEvent e) {
            lista.add("moviendo");
            
        }
        @Override
        public void mouseMoved(MouseEvent e) {
            lista.add("arrastrando...");
            
        }
    }
    public static void main(String[]args){
        Gui17 c = new Gui17();
    }
}

