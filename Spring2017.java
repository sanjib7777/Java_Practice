import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Spring2017 extends JFrame implements ActionListener{
    JTextField t1,t2,t3;
    JButton b;
    public Spring2017(){
        setSize(300,400);
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        b=new JButton("check");
        t1.setColumns(10);
        t2.setColumns(10);
        t3.setColumns(10);
        add(t1);
        add(t2);
        add(t3);
        add(b);
        b.addActionListener(this);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int sum=num1+num2;
        t3.setText(""+sum);

    }


}
