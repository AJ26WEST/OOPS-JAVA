import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TrafficLight extends JFrame implements ActionListener {
    JLabel label;
    JTextField display;
    JRadioButton r1, r2, r3;
    ButtonGroup bg;
    Container c;

    TrafficLight() {
        setLayout(new FlowLayout());
        c = getContentPane();

        // Adding label
        label = new JLabel("Traffic Light");

        // TextField to display the selected light
        display = new JTextField(20);
        display.setEditable(false);  // Make it non-editable

        // Radio buttons for Red, Yellow, and Green
        r1 = new JRadioButton("Red");
        r2 = new JRadioButton("Yellow");
        r3 = new JRadioButton("Green");

        // Group the radio buttons to allow only one selection at a time
        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        // Add components to the container
        c.add(label);
        c.add(r1);
        c.add(r2);
        c.add(r3);
        c.add(display);

        // Add ActionListeners to the radio buttons
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        // Set the frame properties
        setSize(500, 500);
        setVisible(true);
        c.setBackground(Color.white); // Default background color
    }

    // Handle the button click events
    public void actionPerformed(ActionEvent e) {
        if (r1.isSelected()) {
            display.setText("Stop");
            c.setBackground(Color.red); // Set background to red
        } else if (r2.isSelected()) {
            display.setText("Ready");
            c.setBackground(Color.yellow); // Set background to yellow
        } else if (r3.isSelected()) {
            display.setText("Go");
            c.setBackground(Color.green); // Set background to green
        }
    }

    // Main method to launch the application
    public static void main(String[] args) {
        new TrafficLight();
    }
}
