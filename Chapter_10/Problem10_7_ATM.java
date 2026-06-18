// Problem 10.7
// ATM machine (uses simple Account)
// Chapter_10

import java.util.Scanner;

public class Problem10_7_ATM {
    public static class Account {
        private int id;
        private double balance;

        public Account(int id, double balance) {
            this.id = id;
            this.balance = balance;
        }

        public int getId() {
            return id;
        }

        public double getBalance() {
            return balance;
        }

        public void withdraw(double a) {
            balance -= a;
        }

        public void deposit(double a) {
            balance += a;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++)
            accounts[i] = new Account(i, 100);
        while (true) {
            System.out.print("Enter an id: ");
            int id = in.nextInt();
            if (id < 0 || id > 9)
                continue;
            Account acc = accounts[id];
            while (true) {
                System.out.println("Main menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit");
                System.out.print("Enter a choice: ");
                int choice = in.nextInt();
                if (choice == 1)
                    System.out.println("The balance is " + acc.getBalance());
                else if (choice == 2) {
                    System.out.print("Enter an amount to withdraw: ");
                    acc.withdraw(in.nextDouble());
                } else if (choice == 3) {
                    System.out.print("Enter an amount to deposit: ");
                    acc.deposit(in.nextDouble());
                } else if (choice == 4)
                    break;
            }
        }
    }
}