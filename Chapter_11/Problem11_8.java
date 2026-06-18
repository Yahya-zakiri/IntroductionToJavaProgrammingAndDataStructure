// Problem 11.8
// New Account class with Transactions
// Chapter_11

import java.util.ArrayList;
import java.util.Date;

public class Problem11_8 {
    public static class Transaction {
        private Date date;
        private char type;
        private double amount, balance;
        private String description;

        public Transaction(char type, double amount, double balance, String description) {
            this.date = new Date();
            this.type = type;
            this.amount = amount;
            this.balance = balance;
            this.description = description;
        }

        public String toString() {
            return date + " " + type + " " + amount + " " + balance + " " + description;
        }
    }

    public static class Account {
        private String name;
        private int id;
        private double balance;
        private double annualInterestRate;
        private ArrayList<Transaction> transactions = new ArrayList<>();

        public Account(String name, int id, double balance) {
            this.name = name;
            this.id = id;
            this.balance = balance;
        }

        public void deposit(double a) {
            balance += a;
            transactions.add(new Transaction('D', a, balance, "deposit"));
        }

        public void withdraw(double a) {
            balance -= a;
            transactions.add(new Transaction('W', a, balance, "withdraw"));
        }

        public String getName() {
            return name;
        }

        public double getAnnualInterestRate() {
            return annualInterestRate;
        }

        public double getBalance() {
            return balance;
        }

        public ArrayList<Transaction> getTransactions() {
            return transactions;
        }
    }

    public static void main(String[] args) {
        Account a = new Account("George", 1122, 1000);
        a.deposit(30);
        a.deposit(40);
        a.deposit(50);
        a.withdraw(5);
        a.withdraw(4);
        a.withdraw(2);
        System.out.println("Account holder: " + a.getName());
        System.out.println("Interest rate: " + a.getAnnualInterestRate());
        System.out.println("Balance: " + a.getBalance());
        for (Transaction t : a.getTransactions())
            System.out.println(t);
    }
}