import javax.swing.*;
import java.awt.*;

public class SmileyFace extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw the face (a yellow circle)
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 200, 200);

        // Draw the eyes (two black circles)
        g.setColor(Color.BLACK);
        g.fillOval(90, 100, 30, 30);  // Left eye
        g.fillOval(180, 100, 30, 30); // Right eye

        // Draw the mouth (a black arc)
        g.drawArc(100, 150, 100, 50, 0, -180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Smiley Face");
        SmileyFace smileyFace = new SmileyFace();
        
        frame.add(smileyFace);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

