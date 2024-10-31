import java.util.Scanner;

class ExceptionHandling {
    public static int divideNumber(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero!!!");
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numerator, denominator, result;
        String choice;

        do {
            try {
                System.out.print("Provide two numbers (numerator and denominator): ");
                numerator = scan.nextInt();
                denominator = scan.nextInt();
                result = divideNumber(numerator, denominator);
                System.out.println("Result of division: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Exception caught: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Unexpected error occurred: " + e.getMessage());
            } finally {
                System.out.println("Process finished.");
            }

            System.out.print("Do you want to perform another operation? (yes/no): ");
            choice = scan.next();
        } while (choice.equalsIgnoreCase("yes"));

        scan.close();
        System.out.println("Program terminated.");
    }
}
