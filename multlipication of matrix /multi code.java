import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read dimensions of matrix A
        System.out.print("Enter the number of rows in matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns in matrix A: ");
        int colsA = scanner.nextInt();

        // Read dimensions of matrix B
        System.out.print("Enter the number of rows in matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns in matrix B: ");
        int colsB = scanner.nextInt();

        // Check if matrices can be multiplied
        if (colsA != rowsB) {
            System.out.println("Matrices cannot be multiplied");
            return;
        }

        // Read matrix A
        int[][] matrixA = new int[rowsA][colsA];
        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Read matrix B
        int[][] matrixB = new int[rowsB][colsB];
        System.out.println("Enter the elements of matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Initialize the result matrix
        int[][] result = new int[rowsA][colsB];

        // Perform matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Print the result matrix
        System.out.println("Result matrix:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

                
    }
}
