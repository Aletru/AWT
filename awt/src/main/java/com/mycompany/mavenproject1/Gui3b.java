package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.*;

public class Gui3b extends JFrame{
    public Gui3b(){
        super("ejemplo de layout");
        setLayout(new GridLayout(4,3,5,5));
        for(int i=1;i<=10;i++)
        add(new JButton(Integer.toString(i)));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    public static void main(String []args){
        Gui3b aplicacion= new Gui3b();
    }
}
