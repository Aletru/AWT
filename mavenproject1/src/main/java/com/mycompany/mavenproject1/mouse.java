package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mouse {
    public static void main(String[]args){
        JFrame frame = new MouseFrame();
        frame.setVisible(true);
    }
}

class MouseFrame extends JFrame{
    public JLabel info;
    public MouseFrame(){
        setTitle("demostracion del uso de eventos ");
        setSize(600,400);
        addWindowListener(new MainWindowListener());
        info = new JLabel ("juegue con el raton");
        Container contenido = getContentPane();
        contenido.add(info, BorderLayout.SOUTH);
        this.addMouseListener(new MiMouseAdapter(this));
        this.addMouseMotionListener(new MiMouseMotionAdapter(this));
    }
}
class MiWindowListener extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}
class MiMouseAdapter extends MouseAdapter{
    private MouseFrame frame;
    public MiMouseAdapter (MouseFrame frame)
    { this.frame = frame; }
    public void mouseClicked (MouseEvent event){
        frame.info.setText ("raton pulsdo en(" + event.getX() + "," + event.getY() + ")");
    }
    public void mouseEntered (MouseEvent event){
        frame.info.setText("el raton entro en la ventana");
    }
    public void mouseExited(MouseEvent event){
        frame.info.setText("el raton salio de la ventana");
    }
}
class MiMouseMotionAdapter extends MouseMotionAdapter{
    private MouseFrame frame;
    public MiMouseMotionAdapter (MouseFrame frame) 
    {this.frame = frame;}
    public void mouseMoved (MouseEvent event){
        frame.info.setText ("raton en(" + event.getX() + "," + event.getY() + ")");
    }
}