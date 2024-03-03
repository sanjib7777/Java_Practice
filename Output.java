import javax.swing.*;
import java.awt.*;
public class Output extends JFrame {
   JButton b1,b2,b3,a1,a2;
    JPanel panel;
   public Output(){

       setSize(400,500);

       b1=new JButton("West");
       b2=new JButton("Center");
       b3=new JButton("East");
       a1=new JButton("North");
       a2=new JButton("South");
       add(b1,BorderLayout.WEST);
       add(b2,BorderLayout.CENTER);
       add(b3,BorderLayout.EAST);
       add(a1,BorderLayout.NORTH);
       add(a2,BorderLayout.SOUTH);

       setVisible(true);

   }

}
