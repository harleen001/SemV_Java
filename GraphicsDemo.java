import javax.swing.*;
import java.awt.*;

public class GraphicsDemo extends JFrame {

    // Constructor to set up the frame
    public GraphicsDemo() {
        // Set the title of the window
        setTitle("Graphics Demo");

        // Set the size of the window
        setSize(600, 400);

        // Specify the action when the user closes the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a custom panel to the frame
        add(new CustomPanel());

        // Make the window visible
        setVisible(true);
    }

    // Custom panel class that overrides paintComponent to draw graphics
    class CustomPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Draw a filled rectangle
            g.setColor(Color.RED);
            g.fillRect(50, 50, 200, 100);

            // Draw an outlined rectangle
            g.setColor(Color.BLUE);
            g.drawRect(300, 50, 200, 100);

            // Draw a filled oval
            g.setColor(Color.GREEN);
            g.fillOval(50, 200, 200, 100);

            // Draw an outlined oval
            g.setColor(Color.MAGENTA);
            g.drawOval(300, 200, 200, 100);

            // Draw a line
            g.setColor(Color.BLACK);
            g.drawLine(50, 350, 550, 350);

            // Draw a string of text
            g.setColor(Color.BLACK);
            g.drawString("Graphics Drawing Example", 200, 370);
        }
    }

    public static void main(String[] args) {
        // Create and display the window
        new GraphicsDemo();
    }
}
