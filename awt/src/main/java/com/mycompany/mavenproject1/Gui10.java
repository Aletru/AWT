package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui10 extends JFrame{
    JButton botonCopiar;
    JTextField campoValor, resultado;
    public Gui10(){
        setLayout (new FlowLayout());
        add(new JLabel ("valor"));
        campoValor = new JTextField(5);
        add(campoValor);
        botonCopiar = new JButton("copiar");
        add(botonCopiar);
        botonCopiar.addActionListener(new OyenteBoton());
        add(new JLabel("       Copia "));
        resultado = new JTextField(6);
        setSize(400,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main (String[]args){
        Gui10 ventana = new Gui10();
    }
    class OyenteBoton implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String valor = campoValor.getText();
            resultado.setText(valor);
        }
    }
}
