import javax.swing.*;
import java.awt.*;

public class BarDiagram extends JFrame {
    int[] data = {20, 35, 30,15};
    int barWidth = 30;
    int gap = 20;

    public BarDiagram() {
        setSize(400, 500);
        setVisible(true);
    }

    public int getTotal() {
        int total = 0;
        for (int i : data) {
            total = total + i;
        }
        return total;
    }

    public int[] getBarHeights() {
        int total = getTotal();
        int[] heights = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            heights[i] = Math.round((data[i] * 300) / total); // Scaling for better visualization
        }
        return heights;
    }

    public void paint(Graphics g) {
        // Draw x-axis and y-axis lines
        g.drawLine(50, 400, 350, 400); // x-axis
        g.drawLine(50, 50, 50, 400);  // y-axis

        // Draw bars
        int startX = 70;
        int[] barHeights = getBarHeights();
        for (int i = 0; i < barHeights.length; i++) {
            g.setColor(Color.BLUE);  // You can customize the color
            g.fillRect(startX, 400 - barHeights[i], barWidth, barHeights[i]);
            g.setColor(Color.BLACK);
            g.drawString(Integer.toString(data[i]), startX + barWidth / 2 - 5, 415); // Display data value above each bar
            startX += barWidth + gap;
        }
    }

    public static void main(String[] args) {
        new BarDiagram();
    }
}
 