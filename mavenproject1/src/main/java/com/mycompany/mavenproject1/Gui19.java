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
public class Gui19 extends JFrame {
    Container p;
    public Gui19(){
        super ("titulo de la ventana");
        p = getContentPane();
        setLayout(new FlowLayout());
        setSize(200,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Object[] textoOpciones={"si adelante", "ahora no", " no se "};
        int opcion = JOptionPane.showOptionDialog(null, "¿Desea continuar?", "mensaje", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, textoOpciones, textoOpciones[0]);
        
    }
    public static void main (String []args){
        Gui19 g = new Gui19();
    
    }
    
}
