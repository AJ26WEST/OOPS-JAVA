// Class for the thread that prints odd numbers
class OddThread extends Thread {
    public void run() {
        for (int i = 1; i < 100; i += 2) { // Print odd numbers up to 19
            System.out.println("Odd Thread: " + i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd Thread is finished.");
    }
}

// Class for the thread that prints even numbers
class EvenThread extends Thread {
    public void run() {
        for (int j = 0; j <100 ; j += 2) { // Print even numbers up to 18
            System.out.println("Even Thread: " + j);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even Thread is finished.");
    }
}
   ///main class
 public class Main {
        public static void main(String[] args) {
            // Create instances of each thread class
            OddThread oddThread = new OddThread();
            EvenThread evenThread = new EvenThread();

            // Start both threads
            oddThread.start();
            evenThread.start();
        }
    }
