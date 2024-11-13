import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {
        // Get the number of terms from the user through a dialog box
        String input = JOptionPane.showInputDialog("Enter the number of terms:");

        // Convert the input to an integer
        int terms = Integer.parseInt(input);

        // Initialize the first two terms of the Fibonacci series
        int t1 = 0, t2 = 1;

        // Start the result string with an initial message
        String fibonacciSeries = "Fibonacci series: ";

        // Calculate and append each term of the Fibonacci series
        for (int i = 1; i <= terms; i++) {
            fibonacciSeries += t1 + " ";
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

        // Display the result in a dialog box
        JOptionPane.showMessageDialog(null, fibonacciSeries);
    }
}
