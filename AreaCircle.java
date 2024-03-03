import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class AreaCircle extends JFrame implements ActionListener{
    JTextField t1;
    JLabel label;
    JButton button;
    public AreaCircle() {
        setSize(400,500);
        t1 = new JTextField();
        label = new JLabel();
        button = new JButton("click");
        t1.setColumns(10);
        add(t1);
        add(label);
        add(button);
        button.addActionListener(this);
        setVisible(true);
        setLayout(new FlowLayout());
    }

    public void actionPerformed(ActionEvent e){
        float radius=Integer.parseInt(t1.getText());
        double area=3.14*radius*radius;
        label.setText("Area is "+area);

    }

}
