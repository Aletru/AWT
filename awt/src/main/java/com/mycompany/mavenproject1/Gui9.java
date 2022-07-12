package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui9 extends JFrame{
    JButton boton;
    public Gui9(){
        boton = new JButton ("pulsa");
        add(boton);
        boton.addActionListener(new OyenteBoton());
        setSize(100,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main (String []args){
        Gui9 f = new Gui9 ();
    }
}

class OyenteBoton implements ActionListener {
    public void actionPerformed(ActionEvent e){
        Toolkit.getDefaultToolkit().beep();
    }
}
