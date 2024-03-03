import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Exam_2 extends JFrame implements ActionListener  {
    JTextField t1,t2;
    JButton btn;
    public Exam_2(){
        setSize(300,400);
        t1=new JTextField();
        t1.setColumns(10);
        t2=new JTextField();
        t2.setColumns(10);
        btn=new JButton("Click");
        add(t1); add(t2); add(btn);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1=t1.getText();
        String s2=t2.getText();
        if(s1.equals(s2)){
            getContentPane().setBackground(Color.green);
//            setBackground(Color.green);
        }
        else{
            getContentPane().setBackground(Color.red);
        }
    }
    public static void main(String []args){
        new Exam_2();
    }
}
