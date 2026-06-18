// Problem 11.3
// Account subclasses: SavingsAccount and CheckingAccount
// Chapter_11

import java.util.Date;

public class Problem11_3 {
    public static class Account {
        protected int id;
        protected double balance;
        protected static double annualInterestRate;
        protected Date dateCreated = new Date();

        public Account(int id, double balance) {
            this.id = id;
            this.balance = balance;
        }

        public String toString() {
            return getClass().getSimpleName() + "[id=" + id + ", balance=" + balance + "]";
        }
    }

    public static class SavingsAccount extends Account {
        public SavingsAccount(int id, double b) {
            super(id, b);
        }
    }

    public static class CheckingAccount extends Account {
        private double overdraftLimit;

        public CheckingAccount(int id, double b, double limit) {
            super(id, b);
            overdraftLimit = limit;
        }
    }

    public static void main(String[] args) {
        Account a = new Account(1, 1000);
        SavingsAccount s = new SavingsAccount(2, 2000);
        CheckingAccount c = new CheckingAccount(3, 500, 100);
        System.out.println(a);
        System.out.println(s);
        System.out.println(c);
    }
}