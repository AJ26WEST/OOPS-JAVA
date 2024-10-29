import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    // Declare components and variables
    JFrame frame;  // Frame to hold the calculator
    JTextField textField;  // Text field to display inputs and results
    JButton[] numberButtons = new JButton[10];  // Array of buttons for numbers 0-9
    JButton[] functionButtons = new JButton[8];  // Array for function buttons (+, -, *, /, etc.)
    JButton addButton, subButton, mulButton, divButton;  // Arithmetic function buttons
    JButton decButton, equButton, delButton, clrButton;  // Decimal, equals, delete, clear buttons
    JPanel panel;  // Panel to organize number and function buttons

    Font myFont = new Font("Ink Free", Font.BOLD, 30);  // Font for buttons and text

    // Variables to store inputs and results
    double num1 = 0, num2 = 0, result = 0;  
    char operator;  // Stores the current operator (+, -, *, /)

    // Constructor for the Calculator class
    Calculator() {
        // Setup frame
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close operation for frame
        frame.setSize(420, 550);  // Frame size
        frame.setLayout(null);  // No layout manager for custom positioning

        // Setup text field
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);  // Position and size of the text field
        textField.setFont(myFont);  // Set font for text field
        textField.setEditable(false);  // Make text field non-editable
        frame.add(textField);  // Add text field to frame

        // Initialize function buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("Clr");

        // Store function buttons in the array for easy iteration
        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;

        // Set properties for function buttons
        for (int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);  // Add action listener for button click
            functionButtons[i].setFont(myFont);  // Set font for buttons
            functionButtons[i].setFocusable(false);  // Disable focus for buttons
        }

        // Initialize number buttons 0-9
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));  // Set button text as the number
            numberButtons[i].addActionListener(this);  // Add action listener for button click
            numberButtons[i].setFont(myFont);  // Set font for buttons
            numberButtons[i].setFocusable(false);  // Disable focus for buttons
        }

        // Set bounds for delete and clear buttons
        delButton.setBounds(150, 430, 100, 50);
        clrButton.setBounds(250, 430, 100, 50);

        // Setup panel for number and arithmetic buttons
        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);  // Position and size of the panel
        panel.setLayout(new GridLayout(4, 4, 10, 10));  // 4x4 grid layout with spacing

        // Add number and arithmetic buttons to the panel
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        // Add components to the frame
        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);

        frame.setVisible(true);  // Make the frame visible
    }

    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle number button clicks
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));  // Append the number to the text field
            }
        }
        // Handle decimal button click
        if (e.getSource() == decButton) {
            textField.setText(textField.getText().concat("."));  // Append a decimal point
        }
        // Handle add button click
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());  // Store the first number
            operator = '+';  // Set the operator
            textField.setText("");  // Clear the text field
        }
        // Handle subtract button click
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textField.getText());  // Store the first number
            operator = '-';  // Set the operator
            textField.setText("");  // Clear the text field
        }
        // Handle multiply button click
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textField.getText());  // Store the first number
            operator = '*';  // Set the operator
            textField.setText("");  // Clear the text field
        }
        // Handle divide button click
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textField.getText());  // Store the first number
            operator = '/';  // Set the operator
            textField.setText("");  // Clear the text field
        }
        // Handle equals button click
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textField.getText());  // Store the second number

            // Perform the operation based on the operator
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            textField.setText(String.valueOf(result));  // Display the result
            num1 = result;  // Store the result for the next operation
        }
        // Handle clear button click
        if (e.getSource() == clrButton) {
            textField.setText("");  // Clear the text field
        }
        // Handle delete button click
        if (e.getSource() == delButton) {
            String string = textField.getText();
            textField.setText("");
            // Remove the last character from the text field
            for (int i = 0; i < string.length() - 1; i++) {
                textField.setText(textField.getText() + string.charAt(i));
            }
        }
    }
}
