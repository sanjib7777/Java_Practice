import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class XY extends JFrame implements MouseMotionListener,MouseListener{
    JTextField t1,t2;
    public XY(){
        setSize(400,500);
        t1=new JTextField();
        t1.setColumns(10);
        t2=new JTextField();
        t2.setColumns(10);
        add(t1);
        add(t2);
        addMouseMotionListener(this);
        addMouseListener(this);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    public void mouseMoved(MouseEvent e){
        t1.setText("X="+e.getX()+"Y="+e.getY());
    }
    public void mouseEntered(MouseEvent e){
        t2.setText("IN");
    }
    public void mouseExited(MouseEvent e){
        t2.setText("OUT");
    }
    public void mouseClicked(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseDragged(MouseEvent e){}
}
