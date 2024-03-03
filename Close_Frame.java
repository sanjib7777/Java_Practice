import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Close_Frame extends JFrame implements ActionListener {
    JButton b;
    public Close_Frame(){
        setSize(400,500);
        b=new JButton("close");
        setTitle("close frame");
        add(b,BorderLayout.CENTER);
        setVisible(true);
        b.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}
