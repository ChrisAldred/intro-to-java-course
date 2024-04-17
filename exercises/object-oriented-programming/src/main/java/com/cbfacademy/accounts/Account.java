package com.cbfacademy.accounts;

public class Account {
    private int accountNumber;
    protected double balance;
    
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        this.balance = this.balance + amount;
        return this.balance;
    }

    public double withdraw(double requested) {
        if(requested > this.balance || requested < 0){
            return 0;
        }

        this.balance = this.balance - requested;
        return requested;
    }

    @Override
    public String toString(){
        //Account no: 12345
        return String.format("Account no: %d Balance: £%f", this.accountNumber, this.balance);
    }
}
