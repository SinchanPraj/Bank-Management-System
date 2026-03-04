import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String name;
    double balance;

    void createAccount(int accNo, String accName, double initialBalance) {
        accountNumber = accNo;
        name = accName;
        balance = initialBalance;
        System.out.println("Account created successfully!");
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class BankManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();
        int choice;

        do {
            System.out.println("\n--- Bank Management System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = sc.nextDouble();
                    account.createAccount(accNo, name, balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;

                case 4:
                    account.displayBalance();
                    break;

                case 5:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}