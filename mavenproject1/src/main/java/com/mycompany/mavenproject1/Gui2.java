package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.*;

public class Gui2 extends JFrame  {
    public Gui2 (){
        super("ejemplo de layout ");
        setLayout (new FlowLayout (FlowLayout.LEFT,10,20));
        for(int i=1; i<=10;i++){
            add(new JButton ("componentes " + i));
            setSize(200,200);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        
    }
    public static void main(String [] args ){
        Gui2 aplicacion = new Gui2();
    }
}
