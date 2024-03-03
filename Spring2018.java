import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Spring2018 extends JFrame implements ActionListener {
    JTextField t1;
    JButton b;
    public Spring2018(){
        setSize(300,400);
        t1=new JTextField();
        b=new JButton("Click");
        t1.setColumns(10);
        add(b);
        add(t1);
        b.addActionListener(this);
        setVisible(true);
        setLayout(new FlowLayout());

    }
    public void actionPerformed(ActionEvent e){
        t1.setText((t1.getText()).toUpperCase());
        t1.setBackground(Color.RED);
    }
}
