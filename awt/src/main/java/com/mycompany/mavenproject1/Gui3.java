package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.*;

public class Gui3 extends JFrame{
    public Gui3(){
        super ("ejemplo de layout");
        setLayout(new BorderLayout(5,10));
        add(new JButton("1"), BorderLayout.EAST);
        add(new JButton("2"), BorderLayout.SOUTH);
        add(new JButton("3"), BorderLayout.WEST);
        add(new JButton("4"), BorderLayout.NORTH);
        add(new JButton("5"), BorderLayout.CENTER);
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main (String [] args ){
        Gui3 aplicacion = new Gui3();
    }
}
