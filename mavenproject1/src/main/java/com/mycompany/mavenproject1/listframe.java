package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ListFrame extends JFrame implements ActionListener{
    JPanel tools;
    JComboBox font;
    JComboBox fontsize;
    JCheckBox bold;
    JCheckBox italic;
    FontPanel panel;

    public ListFrame(){
        setTitle ("dmostracion del uso de eventos");
        setSize(600,150);
        addWindowListener(new MainWindowListener());
        tools = new JPanel();
        tools.add(new JLabel("fuente"));
        font = new JComboBox<>();
        font.setEditable(false);
        font.addItem("serif");
        font.addItem("sansserif");
        font.addItem("monospaced");
        font.addActionListener(this);
        tools.add(font);
        tools.add(new JLabel("tamaño "));
        fontsize = new JComboBox();
        fontsize.setEditable(true);
        fontsize.addItem("12");
        fontsize.addItem("16");
        fontsize.addItem("24");
        fontsize.addActionListener(this);
        tools.add(fontsize);
        bold = new JCheckBox("negrita");
        bold.addActionListener(this);
        tools.add(bold);

        italic = new JCheckBox("cursiva");
        italic.addActionListener(this);
        tools.add(italic);
        getContentPane().add(tools, "south");
        panel= new FontPanel();
        getContentPane().add(panel, "center");
    }
    public void actionPerformed(ActionEvent event){
        String tipo = (String)font.getSelectedItem();
        String str = (String)fontsize.getSelectedItem();
        int dim = Integer.valueOf(str).intValue();
        int estilo = (bold.isSelected()? Font.BOLD: 0);

        panel.setFont(tipo, estilo, dim);
        repaint();
    }
}
class MainWindowListener extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}

class FontPanel extends JPanel{
    private Font font;
    public void setFont (String font, int style, int size){
        this.font = new Font(font,style,size);
    }
    public void paintComponent (Graphics g){
        if (font!=null)
        g.setFont(font);
        g.drawString("texto del panel", 50 ,50);
    }
}
public class listframe{
    public static void main(String []args){
        JFrame frame= new ListFrame();
        frame.setVisible(true);
    }
}
