import java.util.Scanner;

// Bank Account class to store the user's balance
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

// ATM class representing the ATM machine
class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void displayMenu() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void performTransaction(int choice, double amount) {
        switch (choice) {
            case 1:
                boolean withdrawalSuccess = userAccount.withdraw(amount);
                if (withdrawalSuccess) {
                    System.out.println("Withdrawal successful. Remaining balance: $" + userAccount.getBalance());
                } else {
                    System.out.println("Insufficient funds. Withdrawal failed.");
                }
                break;
            case 2:
                userAccount.deposit(amount);
                System.out.println("Deposit successful. New balance: $" + userAccount.getBalance());
                break;
            case 3:
                System.out.println("Current Balance: $" + userAccount.getBalance());
                break;
            case 4:
                System.out.println("Exiting ATM. Thank you!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial account balance: $");
        double initialBalance = scanner.nextDouble();

        // Create a BankAccount instance with the initial balance
        BankAccount userAccount = new BankAccount(initialBalance);

        // Create an ATM instance connected to the user's account
        ATM atm = new ATM(userAccount);

        while (true) {
            // Display the ATM menu
            atm.displayMenu();

            // Get user input
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                // Exit the program if the user chooses to exit
                atm.performTransaction(choice, 0);
            } else {
                // For other choices, ask for the transaction amount
                System.out.print("Enter the transaction amount: $");
                double amount = scanner.nextDouble();

                // Validate user input
                if (amount < 0) {
                    System.out.println("Invalid amount. Please enter a positive value.");
                    continue;
                }

                // Perform the selected transaction
                atm.performTransaction(choice, amount);
            }
        }
    }
}
