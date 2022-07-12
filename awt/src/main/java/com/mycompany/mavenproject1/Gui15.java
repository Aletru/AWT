package com.mycompany.mavenproject1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Gui15 extends JFrame  {
    Container panel;
    JPanel p1, p2;
    JLabel l1,msg;
    JComboBox ch1;
    String [] lista = {"opcion 1", "opcion 2", "opcion 3"};
    JScrollBar bar1;
    public Gui15 (){
        super("controles");
        setLayout(new BorderLayout());
        p1 = new JPanel(new GridLayout(1,3,10,10));
        p1.setBackground(Color.lightGray);
        l1 = new JLabel("elegir:", Label.RIGHT);
        l1.setBackground(Color.yellow);
        p1.add(l1);
        ch1 = new JComboBox();
        for(int i=0;i< lista.length; i++)
        ch1.addItem(lista[i]);
        ch1.addItemListener(new OyenteCombo());
        p1.add(ch1);
        bar1 = new JScrollBar(Scrollbar.HORIZONTAL, 0, 0, 0, 100);
        bar1.addAdjustmentListener(new OyenteBarra());
        p1.add(bar1);
        p2 = new JPanel(new BorderLayout());
        p2.setBackground(Color.lightGray);
        msg = new JLabel("msg:", Label.LEFT);
        msg.setForeground(Color.blue);
        p2.add("North", msg);
        add(p1, "North");
        add(p2, "South");
        setSize(300,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);    
    }
    public static void main(String[]args){
        Gui15 vetana = new Gui15();
    }
    class OyenteCombo implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            int ind =ch1.getSelectedIndex();
            msg.setText((String)ch1.getSelectedItem());
        }
    }
    class OyenteBarra implements AdjustmentListener{
        public void adjustmentValueChanged(AdjustmentEvent e){
            int valor = bar1.getValue();
            String cad = "valor : " +valor;
            msg.setText(cad);
        }
    }
    
}
