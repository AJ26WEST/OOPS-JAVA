import java.util.*;
import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the string:");
        // String str = sc.nextLine();
        String str = JOptionPane.showInputDialog("enter the string");
        JOptionPane.showInputDialog(null, "this string is " + str);
        int flag = 0;
        int len = str.length();

        for (int i = 0; i <= len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            JOptionPane.showInputDialog("The string is a palindrome");
        } else {
            JOptionPane.showInputDialog("The string is not a palindrome");
        }
    }
}
