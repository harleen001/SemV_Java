import javax.swing.*;
import java.awt.*;

public class ShapeApplet extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Set the background color
        setBackground(Color.WHITE);

        // Draw and fill a rectangle
        g.setColor(Color.RED); // Set the color to red
        g.fillRect(50, 50, 100, 50); // Draw a filled rectangle

        // Draw and fill an oval
        g.setColor(Color.BLUE); // Set the color to blue
        g.fillOval(200, 50, 100, 50); // Draw a filled oval

        // Draw and fill another rectangle
        g.setColor(Color.GREEN); // Set the color to green
        g.fillRect(50, 150, 100, 50); // Draw a filled rectangle

        // Draw and fill a polygon
        g.setColor(Color.YELLOW); // Set the color to yellow
        int[] xPoints = {200, 250, 300}; // X coordinates of the polygon
        int[] yPoints = {150, 100, 150}; // Y coordinates of the polygon
        g.fillPolygon(xPoints, yPoints, 3); // Draw a filled polygon
    }

    public static void main(String[] args) {
        // Create a JFrame to hold the panel
        JFrame frame = new JFrame("Shape Drawing");
        ShapeApplet panel = new ShapeApplet();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
