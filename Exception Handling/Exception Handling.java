import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Perform Division");
            System.out.println("2. Access Array Element");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter numerator: ");
                        int numerator = scanner.nextInt();
                        System.out.print("Enter denominator: ");
                        int denominator = scanner.nextInt();
                        // This method may throw ArithmeticException
                        double result = performDivision(numerator, denominator);
                        System.out.println("Result: " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: Cannot divide by zero.");
                    } finally {
                        System.out.println("Division operation completed.\n");
                    }
                    break;

                case 2:
                    try {
                        int[] array = {1, 2, 3, 4, 5};
                        System.out.print("Enter index to access (0-4): ");
                        int index = scanner.nextInt();
                        // This method may throw ArrayIndexOutOfBoundsException
                        int value = accessArrayElement(array, index);
                        System.out.println("Array value at index " + index + ": " + value);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Error: Index out of bounds.");
                    } finally {
                        System.out.println("Array access operation completed.\n");
                    }
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        } while (choice != 3);

        scanner.close();
    }

    // Method to perform division
    public static double performDivision(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator; // May throw ArithmeticException
    }

    // Method to access an array element
    public static int accessArrayElement(int[] array, int index) throws ArrayIndexOutOfBoundsException {
        return array[index]; // May throw ArrayIndexOutOfBoundsException
    }
}
