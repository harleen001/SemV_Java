import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/* <applet code="ShapeApplet.class" width="400" height="400"></applet> */

public class ShapeApplet extends Applet {

    @Override
    public void paint(Graphics g) {
        // Set the background color
        setBackground(Color.WHITE);

        // Draw and fill a rectangle
        g.setColor(Color.RED); // Set the color to red
        g.fillRect(50, 50, 100, 50); // Draw a filled rectangle

        // Draw and fill an oval
        g.setColor(Color.BLUE); // Set the color to blue
        g.fillOval(200, 50, 100, 50); // Draw a filled oval

        // Draw and fill a rectangle with different color
        g.setColor(Color.GREEN); // Set the color to green
        g.fillRect(50, 150, 100, 50); // Draw a filled rectangle

        // Draw and fill a polygon
        g.setColor(Color.YELLOW); // Set the color to yellow
        int[] xPoints = {200, 250, 300}; // X coordinates of the polygon
        int[] yPoints = {150, 100, 150}; // Y coordinates of the polygon
        g.fillPolygon(xPoints, yPoints, 3); // Draw a filled polygon
    }
}
