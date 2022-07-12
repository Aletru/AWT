package com.mycompany.mavenproject1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Gui13 extends JFrame{
    private JTextField cantidad;
    
    public Gui13 (){
    super("conversor Euros-pesetas");
    JButton boton1 = new JButton("A euros");
    JButton boton2 = new JButton("A pesetas");
    TextField cantidad = new TextField(10);
    JLabel eti2 = new JLabel(new ImageIcon ("logo.gif"));
    add(eti2);  add(cantidad);
    add(boton1);    add(boton2);
    setLayout(new FlowLayout());
    boton1.addActionListener(new OyenteBoton());
    boton2.addActionListener(new OyenteBoton());
    setSize(300,250);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[]args){
        Gui13 vetana = new Gui13();
    }
    class OyenteBoton implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            Float f= new Float(cantidad.getText());
            float valor = f.floatValue();
            String s = (String)ae.getActionCommand();
            if(s.equals("a euros")){
                valor = (float) (valor / 166.321);
            }
            else if (s.equals("a pesetas")){
                valor = (float) (valor * 166.321);
            }
            cantidad.setText(Float.toString(valor));
        }
    }

}
