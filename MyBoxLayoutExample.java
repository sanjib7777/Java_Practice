import javax.swing.*;
import java.awt.*;

public class MyBoxLayoutExample extends JFrame {
    JButton b1, b2, b3, b4, b5;

    public MyBoxLayoutExample() {
        setSize(400, 500);
        b1 = new JButton("button 1");
        b2 = new JButton("button 2");
        b3 = new JButton("button 3");
        b4 = new JButton("long named button 4"); 
        b5 = new JButton("button 5");
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);
        b5.setAlignmentX(Component.CENTER_ALIGNMENT);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MyBoxLayoutExample());
    }
}
