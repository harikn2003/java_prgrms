package cycle1;
import java.util.Scanner;

public class c01BankAcc {
    String accountNumber;
    String accountHolder;
    double balance;

    c01BankAcc(String accNum, String accHolder, double bal) {
        accountNumber = accNum;
        accountHolder = accHolder;
        balance = bal;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Account Number: ");
        String accNum = scanner.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accHolder = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        double bal = scanner.nextDouble();

        c01BankAcc myAccount = new c01BankAcc(accNum, accHolder, bal);
        myAccount.displayAccountInfo();

        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        myAccount.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = scanner.nextDouble();
        myAccount.withdraw(withdrawAmount);

        myAccount.displayAccountInfo();
        scanner.close();
    }
}