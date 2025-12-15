package atminterface;

import java.util.Scanner;


class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    
    public double checkBalance() {
        return balance;
    }

  
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance! Cannot withdraw.");
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive!");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        }
    }
}


public class ATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount userAccount = new BankAccount(5000); 

        int option;
        System.out.println("Welcome to the ATM Simulator!");

        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Your current balance is: " + userAccount.checkBalance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    userAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    userAccount.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }

        } while (option != 4);

        sc.close();
    }
}
