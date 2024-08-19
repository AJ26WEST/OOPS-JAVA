import javax.swing.JOptionPane;
 public class Main {
     public static void main(String[] args){
         String name = JOptionPane.showInputDialog("enter the name");
          JOptionPane.showInputDialog(null, "hello " + name);

         int age =Integer.parseInt(JOptionPane.showInputDialog("enter the age "));
         JOptionPane.showInputDialog(null,"your age is "+age);
     }

 }
