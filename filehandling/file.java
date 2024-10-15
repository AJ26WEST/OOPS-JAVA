/*
 * Name: ABHISHEK JOJI
 * Date: 14-10-2024
 * Purpose: Write a file handling problem in java with reader/writer
 */

import java.io.*;
import java.util.*;

class filehandling {
    public static void main(String args[]) throws IOException {
        String s = "";
        Scanner sc = new Scanner(System.in);
        // writing to file
        FileWriter fw = new FileWriter("output.txt"); // specify the file name
        System.out.println("Enter lines of text (type 'stop' to end):");
        while (true) {
            s = sc.nextLine();
            if (s.equals("stop")) {
                break;
            }
            fw.write(s);
            fw.write("\n");
        }
        fw.close();

        try {
            FileReader fr = new FileReader("output.txt"); // specify the file name
            BufferedReader br = new BufferedReader(fr);
            System.out.println("Content in the file is:");
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }
    }
}
