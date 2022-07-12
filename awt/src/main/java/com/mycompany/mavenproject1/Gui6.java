package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.*;

class MiPanel extends JPanel{
    public void paintComponent(Graphics g){
        Color c = new Color (180, 10, 120);
        g.setColor(c);
        g.drawString("dibujar en el panel", 90 , 90);
        g.fillOval(1, 1, 90, 90);
    }
}
public class Gui6 extends JFrame {
    public Gui6(){
        super("ejemplo de dibujo");
        add(new MiPanel());
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String [] args){
        Gui6 dibujo = new Gui6 ();
    }
}
