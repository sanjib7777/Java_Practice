import java.awt.*;
import javax.swing.*;
public class Flag extends JFrame {
    public Flag(){
        setSize(500,800);
        setVisible(true);
    }
    public void paint(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(50,50,300,700);
        int[] x1={100,300,100};
        int[] y1={100,300,300};
        g.setColor(Color.RED);
        g.fillPolygon(x1,y1,3);
        int[] x2={100,300,100};
        int[] y2={300,500,500};
        g.setColor(Color.RED);
        g.fillPolygon(x2,y2,3);
        g.setColor(Color.black);
        Font f=new Font("",Font.BOLD,30);
        g.setFont(f);
        g.drawLine(100,100,100,600);
        g.drawString("MY NEPAL",110,610);



    }
}
