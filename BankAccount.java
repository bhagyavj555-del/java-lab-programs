package module1;
import java.util.Scanner;

class BankAccount {
    long accountNumber;
    String accountHolder;
    double balance;
    BankAccount(long accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolder = name;
        balance = bal;
    }
    void deposit(double amount) {
        balance += amount;
    }

    void displayDetails() {
        System.out.println("\nAccount Details");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter Account Number: ");
        long accNo = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        System.out.print("Enter Deposit Amount: ");
        double dep = sc.nextDouble();

       
        BankAccount b = new BankAccount(accNo, name, bal);

      
        b.deposit(dep);

        // Output
        b.displayDetails();
    }
}
