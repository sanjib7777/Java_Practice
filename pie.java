import javax.swing.*;
import java.awt.*;
public class pie extends JFrame {
    int []data={10,20,20};
    int x=200;
    int y=200;
    int height=100;
    int width=100;

    public pie(){
        setSize(400,500);
        setVisible(true);
    }
    public int getTotal(){
        int total=0;
        for(int i:data){
            total=total+i;
        }
        return total;
    }
    public int[] getAngles(){
        int total=getTotal();
        int angle[]=new int[data.length];
        for(int i=0;i<data.length;i++){
            angle[i]=Math.round((data[i]*360)/total);
        }
        return angle;
    }
    public void paint(Graphics g){
        Color []c={Color.BLUE,Color.GREEN,Color.RED};
        int start=0;
        int []value=getAngles();
        for(int i=0;i<value.length;i++){
            g.setColor(c[i]);
            g.fillArc(x,y,height,width,start,value[i]);
            start=start+value[i];
        }
    }
}
