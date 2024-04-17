package com.cbfacademy.accounts;

public class SavingsAccount extends Account{
    
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        
        if(interestRate > 0) {
            this.interestRate = interestRate;
        }
    }

    public void applyInterest() {
        if(this.getBalance() > 0) {
            double interestAmount = this.getBalance() * this.interestRate;
            this.deposit(interestAmount);
        }
    }
}
