/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author c4ptain
 **/

class Event extends JFrame {
    public Event (){
       setTitle("Demostracion del uso de eventos......");
       setSize(600,400);
       addWindowListener(new MainWindowListener());
       Container contenido = getContentPane();
       contenido.add(new ButtonPanel());
    }
}
class MainWindowListener extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}
public class EventFrame {
    public static void main (String []args){
        JFrame frame = new Event();
        frame.setVisible(true);
    }
}

class ButtonPanel extends JPanel implements ActionListener{
    private JButton redButton;
    private JButton greenButton;
    private JButton blueButton;
    public ButtonPanel(){
        this.add(redButton);
        this.add(greenButton);
        this.add(blueButton);
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
    }
    public void actionPerformed (ActionEvent event){
        Object source = event.getSource();
        Color color = getBackground();
        if(source == redButton)
        color = Color.RED;
        else if(source == greenButton)
        color = Color.GREEN;
        else if(source == blueButton)
        color = Color.BLUE;
        setBackground(color);
        repaint();

    }
}
