// Simple Java program demonstrating core concepts
public class BankAccount {
    // Instance variables (encapsulation)
    private String accountHolder;
    private double balance;

    // Constructor (object initialization)
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {  // Conditional check
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {  // Conditional check
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }

    // Method to display account info
    public void displayInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: $" + balance);
    }

    // Main method (entry point)
    public static void main(String[] args) {
        // Create an object (instance) of BankAccount
        BankAccount myAccount = new BankAccount("John Doe", 1000.00);

        // Call methods on the object
        myAccount.displayInfo();
        myAccount.deposit(500.50);
        myAccount.withdraw(200.75);
        myAccount.displayInfo();

        // Demonstrate a simple loop
        System.out.println("\nCounting from 1 to 5:");
        for (int i = 1; i <= 5; i++) {  // For loop
            System.out.println(i);
        }
    }
}