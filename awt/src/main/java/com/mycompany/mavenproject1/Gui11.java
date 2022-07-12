package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui11 extends JFrame {
    public Gui11(){
        JButton boton1 = new JButton ("pulsa");
        JLabel label1 = new JLabel("pulsaciones: 0");
        add(boton1);
        add(label1);
        setLayout(new FlowLayout());
        boton1.addActionListener(new OyenteBotonPulsaciones());
    }
    class OyenteBotonPulsaciones implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent arg0) {
            contador++;
            AbstractButton label1;
            label1.setText("pulsaciones: " + contador);
        }
    }
    
}
