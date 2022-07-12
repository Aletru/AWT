package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui21 extends JFrame {
    public Gui21(){
    JMenuBar barramenu = new JMenuBar();
    setJMenuBar(barramenu);
    JMenu menuOptiones = new JMenu ("menu de opciones");
    Container menuOpciones;
    barramenu.add(menuOpciones);
    JMenuItem listar = new JMenuItem("listar los alumnos");
    menuOpciones.add(listar);
    menuOpciones.add(new JSeparator());
    JMenu submenu = new JMenu("subemnu");
    JMenuItem opcionsubmenu = new JMenuItem("opcion de submenu");
    submenu.add(opcionsubmenu);
    menuOpciones.add(submenu);
    listar.addActionListener(new OyenteMenu());
    opcionsubmenu.addActionListener(new OyenteMenu());    
    }
}

class OyenteMenu implements ActionListener {
    public void actionPerformed(ActionEvent e){
        if(e.getSource() instanceof JMenuItem){
            if("listar los alumnos".equals(actionCommand)){
                texto.setText("listar los alumnos");
            }
            if("opcion de submenu".equals (actionCommand)){
                texto.setText("opcion de submenu");
            }
        }
    }
}
