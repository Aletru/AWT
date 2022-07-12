package com.mycompany.mavenproject1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui22 extends JFrame {
    Container panel;
    JTextField JtfNum1, jtfNum2, jtfResult;
    JMenuItem jmiSuma, jmiResta, jmiMul, jmiDiv, jmiCerrar;

    public Gui22(){
        super("Menus");
        JMenuBar jbm = new JMenuBar();
        setJMenuBar(jbm);
        JMenu operationMenu = new JMenu("operacion");
        operationMenu.setMnemonic('O');
        jbm.add(operationMenu);
        operationMenu.add(jmiSuma = new JMenuItem("suma", 'S'));
        operationMenu.add(jmiResta = new JMenuItem("resta", 'R'));
        operationMenu.add(jmiMul = new JMenuItem("multiplica", 'M'));
        operationMenu.add(jmiDiv = new JMenuItem("divide", 'D'));
        JMenu exitMenu = new JMenu("Salir");
        jbm.add(exitMenu);
        exitMenu.add(jmiCerrar = new JMenuItem("cerrar", 'C'));
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(new JLabel("numero 1"));
        p1.add(JtfNum1 = new JTextField(3));
        p1.add(new JLabel("numero 2"));
        p1.add(jtfNum2 = new JTextField(3));
        p1.add(new JLabel ("resultado"));
        p1.add(jtfResult = new JTextField(4));
        jtfResult.setEditable(false);
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(p1, BorderLayout.CENTER);
        jmiSuma.addActionListener(new OyenteMenu());
        jmiResta.addActionListener(new OyenteMenu());
        jmiMul.addActionListener(new OyenteMenu());
        jmiCerrar.addActionListener(new OyenteMenu());
    }
    public static void main(String []args){
        Gui22 ventana = new Gui22();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack()  ;
        ventana.setVisible(true);      
    }
    private void calulate(char operator){
        int num1 = (Integer.parseInt(JtfNum1.getText().trim()));
        int num2 = (Integer.parseInt(jtfNum2.getText().trim()));
        int result = 0;
        switch (operator){
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num1 / num2; break;
        }
        jtfResult.setText(String.valueOf(result));

    } 
    class OyenteMenu implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String actionCommand = e.getActionCommand();
            if(e.getSource() instanceof JMenuItem){
                if("suma".equals(actionCommand)) calulate('+');
                else if("resta".equals(actionCommand)) calulate('-');
                else
                 if("multiplica".equals(actionCommand)) calulate('*');
                 else if ("divide". equals(actionCommand)) calulate('/');
                 else if ("cerrar".equals(actionCommand)) System.exit(0);
            }
        }
    }
}
