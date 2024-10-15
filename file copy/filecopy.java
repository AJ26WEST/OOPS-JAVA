/*
 * Name: ABHISHEK JOJI
 * Date: 14-10-2024
 * Purpose: Write a file handling problem in java to file copy-file related exceptions.
 */
import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        FileInputStream f1 = null;
        FileOutputStream f2 = null;

        try {
            // Open the input and output files
            f1 = new FileInputStream("test.txt");
            f2 = new FileOutputStream("cp.txt");

            // Read bytes from the input file and write them to the output file
            int c;
            while ((c = f1.read()) != -1) {
                f2.write(c); // Write the byte directly, no need to cast to char
                System.out.print((char) c); // Print the character to console
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading or writing file: " + e.getMessage());
        } finally {
            // Ensure the streams are closed properly
            try {
                if (f1 != null) f1.close();
                if (f2 != null) f2.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
