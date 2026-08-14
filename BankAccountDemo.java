package module2;

import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    // Constructor
    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
    }

    // Display account details
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolder = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(
            accountNumber,
            accountHolder,
            balance
        );

        System.out.println("\n--- Account Details ---");
        account.displayDetails();

        System.out.print("\nEnter amount to deposit: ");
        double amount = sc.nextDouble();

        account.deposit(amount);

        System.out.println("\n--- Updated Account Details ---");
        account.displayDetails();

        sc.close();
    }
}