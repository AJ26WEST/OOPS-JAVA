import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {
        String s1 = JOptionPane.showInputDialog("Enter a string:");
        String keyInput = JOptionPane.showInputDialog("Enter the character to find:");
        char key = keyInput.charAt(0);

        int count = 0;
        int len = s1.length();

        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) == key) {
                count++;
            }
        }
        JOptionPane.showMessageDialog(null, "The count of '" + key + "' is: " + count);
    }
}
