// Problem 9.7
// Account class
// Chapter_9

import java.util.Date;

public class Problem9_7_Account {
    public static class Account {
        private int id = 0;
        private double balance = 0;
        private static double annualInterestRate = 0;
        private Date dateCreated = new Date();

        public Account() {
        }

        public Account(int id, double balance) {
            this.id = id;
            this.balance = balance;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double b) {
            this.balance = b;
        }

        public static double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public static void setAnnualInterestRate(double r) {
            annualInterestRate = r;
        }

        public Date getDateCreated() {
            return dateCreated;
        }

        public double getMonthlyInterestRate() {
            return annualInterestRate / 12 / 100;
        }

        public double getMonthlyInterest() {
            return balance * getMonthlyInterestRate();
        }

        public void withdraw(double amount) {
            balance -= amount;
        }

        public void deposit(double amount) {
            balance += amount;
        }
    }

    public static void main(String[] args) {
        Account acc = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);
        acc.withdraw(2500);
        acc.deposit(3000);
        System.out.printf("Balance: %.2f\n", acc.getBalance());
        System.out.printf("Monthly interest: %.2f\n", acc.getMonthlyInterest());
        System.out.println("Date created: " + acc.getDateCreated());
    }
}