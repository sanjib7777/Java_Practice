import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Menu extends JFrame implements ActionListener, MouseListener {
    JLabel label;
    JMenuItem first,second;
    JPopupMenu menu;
    public Menu(){
        setLayout(null);
        setSize(400,500);
        label=new JLabel();
        label.setBounds(400,400,400,400);
        add(label);
        menu=new JPopupMenu();
        add(menu);
        first= new JMenuItem("first");
        second= new JMenuItem("second");
        menu.add(first);
        menu.add(second);
        first.addActionListener(this);
        second.addActionListener(this);
        addMouseListener(this);

        setVisible(true);
    }
  public void mouseClicked(MouseEvent e){
        menu.show(this,e.getX(),e.getY());
  }
  public void actionPerformed(ActionEvent e){
        label.setText(e.getActionCommand()+" is selected");
  }
  public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}

    public void mouseExited(MouseEvent e){}





}
