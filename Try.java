
class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance = 5000;

    void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Withdrawal amount must be positive.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance!");
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful.");
        System.out.println("Withdrawn Amount: " + amount);
        System.out.println("Remaining Balance: " + balance);
    }
}

public class Try {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        try {
            System.out.println("Initial Balance: "
                    + account.balance);

            account.withdraw(7000);
        }

        catch (InsufficientBalanceException e) {
            System.out.println("Custom Exception: "
                    + e.getMessage());
        }

        catch (IllegalArgumentException e) {
            System.out.println("Invalid Input: "
                    + e.getMessage());
        }

        finally {
            System.out.println("Transaction process completed.");
        }
    }
}
