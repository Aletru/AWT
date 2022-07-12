package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.*;

public class Gui4 extends JFrame{
    public Gui4(){
        setTitle("horno de microondas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,3));
        for (int i=1;i<=9;i++){
            p1.add(new JButton("" +i ));
        }
        p1.add(new JButton(""+0));
        p1.add(new JButton("start"));
        p1.add(new JButton("stop"));
         JPanel p2 = new JPanel();
         p2.setLayout(new BorderLayout());
         p2.add(new JTextField("aqui el tiempo"), BorderLayout.NORTH);
         p2.add(p1, BorderLayout.CENTER);
         add(p2, BorderLayout.EAST);
         add(new Button("aqui la comida"), BorderLayout.CENTER);
         setSize(400,250);
         setVisible(true);
    }
    public static void main(String []args){
        Gui4 frame= new Gui4();
    }
}
