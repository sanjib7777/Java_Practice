import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MoveCircle extends JFrame implements ActionListener {
    JPanel btnpanel;
    JButton up,down,left,right;
    int x=200;
    int y=200;
    public MoveCircle(){
        setSize(500,500);
        btnpanel= new JPanel();
        up= new JButton("up");
        down= new JButton("down");
        left= new JButton("left");
        right= new JButton("right");
        btnpanel.add(up);btnpanel.add(down);btnpanel.add(left);btnpanel.add(right);
        add(btnpanel, BorderLayout.SOUTH);
        up.addActionListener(this);
        down.addActionListener(this);
        left.addActionListener(this);
        right.addActionListener(this);
        setVisible(true);

    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillOval(x,y,15,15);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==up){
            y=y-20;
        }
        else if(e.getSource()==down){
            y=y+20;
        }
        else if(e.getSource()==left){
            x=x-20;
        }
        else{
            x=x+20;
        }
        repaint();
    }
}
