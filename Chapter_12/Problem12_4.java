// Problem12_4
// Chapter 12 - Exercise 12.4
// Modified Loan class that throws IllegalArgumentException for invalid inputs

public class Problem12_4 {
    public static void main(String[] args) {
        try {
            Loan loan = new Loan(5.0, 0, 10000); // invalid years
        } catch (IllegalArgumentException ex) {
            System.out.println("Invalid loan: " + ex.getMessage());
        }

        try {
            Loan loan2 = new Loan(5.0, 30, 10000);
            System.out.println("Monthly payment: " + loan2.getMonthlyPayment());
        } catch (IllegalArgumentException ex) {
            System.out.println("Invalid loan: " + ex.getMessage());
        }
    }
}

class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        if (annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0)
            throw new IllegalArgumentException("Interest rate, years, and amount must be > 0");
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyRate / (1 - Math.pow(1 + monthlyRate, -numberOfYears * 12));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }
}
