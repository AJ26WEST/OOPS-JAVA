import java.io.FileWriter;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the string from the user
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Step 2: Reverse the string
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Step 3: Write the reversed string to a file
        try {
            FileWriter writer = new FileWriter("reversed_string.txt");
            writer.write(reversed);
            writer.close();
            System.out.println("Reversed string saved to 'reversed_string.txt'");
        } catch (Exception e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
