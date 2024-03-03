import javax.swing.*;
import java.awt.*;

public class Square extends JFrame {
    public Square(){
        setSize(600,700);
        setVisible(true);
    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(100,100,400,400);
        g.setColor(Color.GREEN);
        g.fillOval(200,200,200,200);
        g.setColor(Color.BLACK);
        g.drawString("Best of luck",270,170);
    }

}
