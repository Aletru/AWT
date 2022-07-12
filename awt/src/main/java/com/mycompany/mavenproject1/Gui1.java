package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.*;

public class Gui1  extends JFrame{
    private Container panel;
    private JButton miboton;
    public Gui1 (){
        super("Ejemplo 01 con boton");
        miboton = new JButton ("Aceptar");
        panel= getContentPane();
        panel.add(miboton);

        setSize(200,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String []args){
        Gui1 aplicacion = new Gui1();
    }
}

/* JFrame sin container 
public class Gui01 extends JFrame {
    private Jbutton miboton;
    public Gui01 (){
        miboton = new Jbutton("Aceptar");
        add(miboton);
        setSize(200,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main (String []arsg){
        Gui01 aplicacion = new Gui01();
    }
} */

/* JFrame sin herencia con container 
public class Gui01 extends JFrame {
    private Jbutton miboton;
    private Container panel;
    public Gui01 (){
        JFrame frame= new JFrame("Ejemplo 01");
        panel = frame.getContentPane();
        miboton = new Jbutton("Aceptar");
        panel.add(miboton);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main (String []arsg){
        Gui01 aplicacion = new Gui01();
    }
} */


