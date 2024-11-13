import java.util.StringTokenizer;
import java.io.FileWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        String s = "AJ26WEST IS SOME NEXT NIGGA";
        StringTokenizer tokenizer = new StringTokenizer(s, " ");

        System.out.println("Tokens in the sentence:");
        try {
            // Create a FileWriter to write tokens to a file
            FileWriter writer = new FileWriter("aj.txt");

            // Print and write each token to the file
            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                System.out.println(token);
                writer.write(token + "\n"); // Write token followed by a newline
            }

            // Close the FileWriter
            writer.close();
            System.out.println("Tokens have been written to aj.txt.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
