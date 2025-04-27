package Basics;

import java.sql.SQLOutput;
import java.util.Scanner;

abstract class BankAccount {
    protected double balance;

    abstract void deposit(double amount);
    abstract void withdrawal(double amount);
    abstract void displayBalance();
}
class UserAccount extends BankAccount{
    UserAccount(double initialBalance){
        this.balance = initialBalance;
    }
    @Override
    void deposit(double amount){
        balance += amount;
        System.out.println("Successfully deposited");
    }
    @Override
    void withdrawal(double amount){
        if (balance == 0){
            System.out.println("Your balance is empty..");
            return;
        } else if (amount > balance) {
            System.out.println("Balance is less than the amount, unable to fetch it for you..");
            return;
        }
        balance -= amount;
        System.out.println( amount + ": Money Withdrawal done.");
    }
    @Override
    void displayBalance(){
        System.out.println("Your balance is: "+ balance);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UserAccount account = new UserAccount(0);
        boolean check = true;

        while(check){
            System.out.println("1. Deposit\n2. Withdrwal\n3. Check Balance\n4. Exit");
            System.out.println("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();
            double amount;

            switch(choice){
                case 1:
                    System.out.println("Enter the amount to deposit: ");
                    amount = input.nextDouble();
                    input.nextLine();
                    account.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw: ");
                    amount = input.nextDouble();
                    input.nextLine();
                    account.withdrawal(amount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Ok thanks for banking....");
                    check = false;
                    break;
                default:
                    System.out.println("Invalid Input try again....");
            }
        }

    }

}
