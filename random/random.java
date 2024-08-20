import java.util.Random;
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Random random = new Random();

       int x;
       x = random.nextInt(6);
        boolean y = random.nextBoolean();
        System.out.println(y);
        System.out.println(x);
    }
}
