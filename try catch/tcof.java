/*
 * Name: ABHISHEK JOJI
 * Date: 30-09-2024
 * Purpose: Write a Java program that demonstrates the use of try, catch, and finally blocks.
 *          The program verifies if a person is eligible to vote based on their age.
 */

import java.util.Scanner;

class AgeVerify {
    void vote(int age) throws IllegalAccessException {
        try {
            if (age < 18) {
                throw new IllegalAccessException("You must be at least 18 years old to vote.");
            } else {
                System.out.println("You can vote!");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        } finally {
            System.out.println("Finally, age verification done.");
        }
    }
}

public class usageoftry {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter age of voter:");
        age = sc.nextInt();
        AgeVerify av = new AgeVerify();
        av.vote(age);
        System.out.println("Verification completed successfully");
    }
}
