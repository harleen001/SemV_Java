import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlingDemo {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Event Handling Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        // Create a label
        JLabel label = new JLabel("Click the button to see the message.");
        frame.add(label);

        // Create a button
        JButton button = new JButton("Click Me!");
        frame.add(button);

        // Add action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change the label text when the button is clicked
                label.setText("Button was clicked!");
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
