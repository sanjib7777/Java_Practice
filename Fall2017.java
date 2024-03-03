import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Fall2017 extends JFrame implements ActionListener {
    JButton r,b,y;
    public Fall2017(){
        setSize(400,500);
        r=new JButton("RED");
        b=new JButton("BLUE");
        y=new JButton("YELLOW");
        add(r);
        add(b);
        add(y);
        r.addActionListener(this);
        b.addActionListener(this);
        y.addActionListener(this);
        setLayout(new FlowLayout());
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== r){

            getContentPane().setBackground(Color.RED);
        }
        else if(e.getSource()== b){
            getContentPane().setBackground(Color.BLUE);
        }
        else{
            getContentPane().setBackground(Color.YELLOW);
        }
    }
}
