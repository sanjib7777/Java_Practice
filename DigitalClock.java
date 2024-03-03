import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;

class DigitalClock extends JFrame{
    SimpleDateFormat timeFormat;
    JLabel label;
    String time;
    public DigitalClock(){
        setSize(300,400);
        label=new JLabel();
        timeFormat=new SimpleDateFormat("HH:mm:ss");
        setLayout(new FlowLayout());
        setVisible(true);
        add(label);
        getTime();
    }
    public void getTime(){
        while(true){
            time=timeFormat.format(Calendar.getInstance().getTime());
            label.setText(time);
            try{
                Thread.sleep(1000);

            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String []args){
        new DigitalClock();
    }
}