package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui20 extends JFrame {
    
    class PanelDatos extends JPanel{
        public PanelDatos(){
            setLayout(new GridLayout(4,2));
            JLabel etiquetaNombre = new JLabel("Nombre: ", JLabel.RIGHT);
            JTextField campoNombre = new JTextField();
            add(etiquetaNombre);
            add(campoNombre);
            JLabel etiquetaApellidos  = new JLabel("apellidos: ", JLabel.RIGHT);
            JTextField campoApellidos = new JTextField();
            add(etiquetaApellidos);
            add(campoApellidos);
            JLabel etiquetaNP = new JLabel ("numero personal:", JLabel.RIGHT);
            JTextField campoNP = new JTextField();
            add(etiquetaNP);
            add(campoNP);
            ButtonGroup grupoBotones = new ButtonGroup();
            JRadioButton mañana = new JRadioButton("Grupo Mañana", true);
            JRadioButton tarde = new JRadioButton ("Grupo Tarde");
            grupoBotones.add(mañana);
            grupoBotones.add(tarde);
            add(mañana);
            add(tarde);
        }
    }
    public Gui20(){
        super ("Titulo de la ventana");
        setLayout(new FlowLayout());
        PanelDatos pd = new PanelDatos();
        if (JOptionPane.showConfirmDialog(this, pd, "introduzca datos", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE)== JOptionPane.OK_OPTION){

        }
    }
    public static void main (String []agrs){
        Gui20 f= new Gui20();
    }
    
}
