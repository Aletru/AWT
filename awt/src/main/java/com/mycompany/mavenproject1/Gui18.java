/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author c4ptain
 */
public class Gui18 extends JFrame  {
    public Gui18(){
        super ("titulo de la ventana");
        setLayout(new FlowLayout());
        setSize(200,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JOptionPane.showMessageDialog(null, "debe introducir datos en todos los campos", "error de entrada ", JOptionPane.ERROR_MESSAGE);
    }
    public static void main (String [] args ){
       Gui18 f = new Gui18();
    }
}
