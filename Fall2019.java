import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Fall2019 extends JFrame implements ActionListener{
    JTextField t1,t2;
    JButton b;
    public Fall2019(){
        setSize(400,500);
        t1=new JTextField();
        t2=new JTextField();
        b=new JButton("check");
        b.setBounds(100,100,100,100);
        t1.setColumns(10);
        t2.setColumns(10);
        add(t1);
        add(t2);
        add(b);
        b.addActionListener(this);
        setVisible(true);
        setLayout(new FlowLayout());
    }
    public void actionPerformed(ActionEvent e){
        int num=Integer.parseInt(t1.getText());
        if(num%2==0){
            t2.setText("even");
        }
        else{
            t2.setText("odd");
        }
    }

}
