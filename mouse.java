import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class mouse extends JFrame implements MouseListener, MouseMotionListener {
    JTextField t1,t2;
    public mouse(){
        setSize(300,400);
        t1=new JTextField();
        t1.setColumns(10);
        t2=new JTextField();
        t2.setColumns(10);
        add(t1); add(t2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    @Override
    public void mouseEntered(MouseEvent e){
        t1.setText("in");
    }
    public void mouseExited(MouseEvent e){
        t1.setText("out");
    }
    public void mouseMoved(MouseEvent e){
        t2.setText("X="+e.getX()+" Y="+e.getY());
    }
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseDragged(MouseEvent e){}
    public static void main (String []args){
        new mouse();
    }
}
