package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        amount = amount + sum;
        System.out.println("Your balance - " + amount);
        return amount;
    }

    public double withDraw(double sum) throws LimitException {
        if (sum > amount) {
            sum = amount;
            amount = amount - sum;
            System.out.println("Balance " + amount);
            throw new LimitException("Not enough funds on your balance. Your balance - ", amount);
        }else{
            amount = amount - sum;
            System.out.println(" Your balance - " + amount);
        }
        return amount;
    }
}
