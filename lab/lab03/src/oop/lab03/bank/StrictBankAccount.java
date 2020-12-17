package oop.lab03.bank;

import oop.lab03.bank.interfaces.BankAccount;

public class StrictBankAccount implements BankAccount{
    //comune
    private int userID;
    //comune
    private double balance = 0;
    //comune
    private int id = 1074;
    //comune
    private int nTransactions = 0;
    //comune
    private final static double ATM_TRANSACTION_FEE = 1;

    private final static double FIXED_FEE = 5;
    private final static double VARIABLE_FEE = 0.1;

    public StrictBankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
 
    public int getId() {
        return this.id;
    }//comune

    public double getBalance() {
        return this.balance;
    } //comune

    public void deposit(final int usrID, final double amount) {
        if (usrID == id) {
            nTransactions++;
            balance += amount;
        }    
    } //comune

    public void withdraw(final int usrID, final double amount) {
        if(usrID == id && amount < balance) {
           nTransactions++;
           balance -= amount;
        }
    } //comune

    public void depositFromATM(final int usrID, final double amount) {
        if (usrID == id) {
            nTransactions++;
            balance += amount - ATM_TRANSACTION_FEE;
        }
    }//comune

    public void withdrawFromATM(final int usrID, final double amount) {
        if(usrID == id && amount < balance) {
            nTransactions++;
            balance -= amount + ATM_TRANSACTION_FEE;
        }
    }//comune

    public void printBank() {
        System.out.println("Current balance " + balance);
    }//comune

    private boolean checkUser(final int id) {
        return this.userID == id;
    }

    @Override
    public void chargeManagementFees(int usrID) {
        balance -= FIXED_FEE + VARIABLE_FEE * nTransactions;
    }

    @Override
    public int getTransactionsCount() {
        return nTransactions;
    }
}
