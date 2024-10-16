/*
 * Name: ABHISHEK JOJI
 * Date: 10-10-2024
 * Purpose: Demonstrate the use of a garbage collector and custom exceptions in Java.
 */

import java.util.Scanner;

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class Customer_Exception {
    private static final int MAX_ACCOUNTS = 25;
    
    public static void main(String[] args) {
        int[] accNumber = new int[MAX_ACCOUNTS];
        int[] amount = new int[MAX_ACCOUNTS];
        String[] Names = new String[MAX_ACCOUNTS];
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter No. of Customers: ");
        int n = scan.nextInt();

        Customer_Exception e = new Customer_Exception();
        e.setupAccounts(n, Names, accNumber, amount);
        e.bankMenu(n, Names, accNumber, amount);

        scan.close();
    }

    public void setupAccounts(int n, String[] Names, int[] accNumber, int[] amount) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Customer Name: ");
            Names[i] = scan.next();
            System.out.print("Enter Account Number: ");
            accNumber[i] = scan.nextInt();
            System.out.print("Enter Balance: ");
            amount[i] = scan.nextInt();
            System.out.println();
        }
    }

    public void bankMenu(int n, String[] Names, int[] accNumber, int[] amount) {
        Scanner scan = new Scanner(System.in);
        int choice, flag = 1;
        
        while (flag == 1) {
            System.out.println("Banking System");
            System.out.println("1. Display All Accounts\n2. Search Account\n3. Deposit Amount\n4. Withdraw Amount\n5. Exit");
            System.out.print("Enter Choice: ");
            choice = scan.nextInt();
            
            switch (choice) {
                case 1 -> displayAccounts(n, Names, accNumber, amount);
                case 2 -> searchAccount(n, Names, accNumber, amount);
                case 3 -> processTransaction(n, accNumber, amount, true); // Deposit
                case 4 -> processTransaction(n, accNumber, amount, false); // Withdraw
                case 5 -> flag = 0;
                default -> System.out.println("Invalid Choice");
            }
        }
    }

    public void displayAccounts(int n, String[] Names, int[] accNumber, int[] amount) {
        for (int i = 0; i < n; i++) {
            System.out.println("Account Name: " + Names[i] + " -> Account Number: " + accNumber[i] + " -> Balance: " + amount[i]);
        }
    }

    public void searchAccount(int n, String[] Names, int[] accNumber, int[] amount) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        int acno = scan.nextInt();
        int pos = search(n, accNumber, acno);

        if (pos != -1) {
            System.out.println("Account Name: " + Names[pos] + " -> Account Number: " + accNumber[pos] + " -> Balance: " + amount[pos]);
        } else {
            System.out.println("Account not found");
        }
    }

    public int search(int n, int[] accNumber, int acno) {
        for (int i = 0; i < n; i++) {
            if (accNumber[i] == acno) return i;
        }
        return -1;
    }

    public void processTransaction(int n, int[] accNumber, int[] amount, boolean isDeposit) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        int acno = scan.nextInt();
        int pos = search(n, accNumber, acno);

        if (pos != -1) {
            System.out.print("Enter amount: ");
            int amt = scan.nextInt();
            
            try {
                if (amt <= 0) throw new InvalidAmountException("Invalid amount entered");

                if (isDeposit) {
                    amount[pos] += amt;
                    System.out.println("Deposit Successful!");
                } else {
                    if (amt > amount[pos]) throw new InsufficientFundsException("Insufficient funds");
                    amount[pos] -= amt;
                    System.out.println("Withdraw Successful!");
                }
            } catch (InvalidAmountException | InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Account not found");
        }
    }
}
