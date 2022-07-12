package com.mycompany.mavenproject1;
import javax.swing.*;

import java.awt.*;

class MiPanel extends JPanel{
    public void paintComponent(Graphics  g){
        super.paintComponent(g);
        g.drawString("interfaz grafica", 40 ,40 );
    }
}
public class Gui5 extends JFrame{
    public Gui5(){
        super("ejemplo de dibujo");
        add(new MiPanel());
        setSize(200,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main (String []args){
        Gui5 interfaz = new Gui5 ();
    }

}