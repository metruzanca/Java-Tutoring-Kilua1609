package it.unibo.oop.lab04.bank2;

public class RestrictedBankAccount extends AbstractBankAccount {

    protected RestrictedBankAccount(Double balance, int usrID) {
        super(balance, usrID);
    }

    @Override
    protected boolean isWithDrawAllowed(double amount) {
        return getBalance() > amount;
    }

    @Override
    protected double computeFee() {
        setBalance(getBalance() - MANAGEMENT_FEE);
        return getBalance();
    }
    
}
