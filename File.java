import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class File extends JFrame implements ActionListener {
    JMenu file;
    JMenuItem first,second;
    JLabel label;
    public File(){
        setSize(300,400);
        file=new JMenu("file");

        first=new JMenuItem("first");
        second=new JMenuItem("second");
        label=new JLabel();
        label.setBounds(100,100,200,200);
        file.add(first);
        file.add(second);
        add(file);
        add(label);
        add(label);
        setLayout(new FlowLayout());
        setVisible(true);
        add(label);
        first.addActionListener(this);
        second.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String str=e.getActionCommand();
        label.setText(str);
        if(str.equals("first")){
            getContentPane().setBackground(Color.RED);
        }
        else{
            getContentPane().setBackground(Color.GREEN);
        }

    }
}
