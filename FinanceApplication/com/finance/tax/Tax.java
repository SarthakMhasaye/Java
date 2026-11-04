package FinanceApplication.com.finance.tax;
public class Tax {

    public double calculateTax(double income) {
        double taxRate = 10.0;

        return income * taxRate / 100;
    }
    public void displayTax(double income) {
        double tax = calculateTax(income);

        System.out.println("Annual Income: " + income);
        System.out.println("Tax Rate: 10%");
        System.out.println("Tax Amount: " + tax);
        System.out.println("Income After Tax: " + (income - tax));
    }
}

