import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int cols;
        String symbol;

        System.out.println("Enter the number of rows:");
        rows = scanner.nextInt();
        System.out.println("Enter the number of columns:");
        cols = scanner.nextInt();
        System.out.println("Enter the symbol:");
        symbol = scanner.next();  // Use next() instead of nextInt() for a string

        for (int i = 0; i < rows; i++) {  // Start loop from 0 and use < instead of <=
            for (int j = 0; j < cols; j++) {
                System.out.print(symbol);  // Use print instead of println to keep symbols on the same line
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
