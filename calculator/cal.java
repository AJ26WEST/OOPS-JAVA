import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {

    // Creating a frame
    private JFrame frame;
   
    // Creating text fields
    private JTextField textField1, textField2, resultField;
   
    // Creating buttons
    private JButton addButton, subtractButton, multiplyButton, divideButton;

    // Default constructor
    public SimpleCalculator() {
        // Create a new frame
        frame = new JFrame("Simple Calculator");

        // Create text fields
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        resultField = new JTextField(10);
       
        // Set the resultField to be non-editable
        resultField.setEditable(false);

        // Create buttons
        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");
        multiplyButton = new JButton("Multiply");
        divideButton = new JButton("Divide");

        // Adding action listeners to the buttons
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);

        // Creating a panel
        JPanel panel = new JPanel();
       
        // Adding components to the panel
        panel.add(new JLabel("Number 1:"));
        panel.add(textField1);
        panel.add(new JLabel("Number 2:"));
        panel.add(textField2);
        panel.add(new JLabel("Result:"));
        panel.add(resultField);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);

        // Adding panel to frame
        frame.add(panel);
       
        // Setting frame size and visibility
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String num1 = textField1.getText();
        String num2 = textField2.getText();
        double number1 = Double.parseDouble(num1);
        double number2 = Double.parseDouble(num2);
        double result = 0.0;

        if (e.getSource() == addButton) {
            result = number1 + number2;
        } else if (e.getSource() == subtractButton) {
            result = number1 - number2;
        } else if (e.getSource() == multiplyButton) {
            result = number1 * number2;
        } else if (e.getSource() == divideButton) {
            result = number1 / number2;
        }

        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
