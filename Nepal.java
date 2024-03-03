import javax.swing.*;
import java.awt.*;
public class Nepal extends JFrame{
    public Nepal(){
        setSize(800,800);
        setVisible(true);
    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        int []x1={100,250,100};
        int []y1={100,300,300};
        g.fillPolygon(x1,y1,3);
        int []x2={100,250,100};
        int []y2={300,550,550};
        g.fillPolygon(x2,y2,3);
        g.setColor(Color.BLACK);
        g.drawLine(100,100,100,700);
    }

}
