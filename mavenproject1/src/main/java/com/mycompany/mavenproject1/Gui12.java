package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui12 extends JFrame{
    JButton rojo = new JButton("rojo ");
    JButton azul = new JButton("azul");
    Container p;
    public Gui12(){
        super("color de fondo");
        p = this.getContentPane();
        setLayout(new FlowLayout());
        add(rojo);
        add(azul);
        rojo.addActionListener(new OyenteRojo());
        azul.addActionListener(new OyenteAzul());
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[]args){
        Gui12 ventana = new Gui12();
    }
    class OyenteRojo implements ActionListener {
        public void actionPerformed(ActionEvent evento){
            p.setBackground(Color.red);
        }
    }
    class OyenteAzul implements ActionListener {
        public void actionPerformed(ActionEvent evento){
            p.setBackground(Color.blue);
        }
    }
}
