package FinanceApplication;


import FinanceApplication.com.finance.accounts.Account;
import FinanceApplication.com.finance.tax.Tax;

public class Main {
    public static void main(String[] args) {

        Account account = new Account(101, "Rahul", 50000);

        System.out.println("--- Account Details ---");
        account.displayAccount();

        account.deposit(10000);
        account.withdraw(5000);

        System.out.println("\n--- Updated Account Details ---");
        account.displayAccount();

        Tax tax = new Tax();

        System.out.println("\n--- Tax Calculation ---");
        tax.displayTax(account.getBalance());
    }
}






































// javac -d . com/finance/accounts/Account.java com/finance/tax/TaxCalculator.java Main.java