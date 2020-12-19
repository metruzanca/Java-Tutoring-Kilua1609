package it.unibo.oop.lab04.bank2;

public class ClassicBankAccount extends AbstractBankAccount {

    public ClassicBankAccount(final Double balance, final int usrID) {
        super(balance, usrID);
    }
    
    @Override
    protected boolean isWithDrawAllowed(double amount) {
        return amount < getBalance();
    }

    @Override
    protected double computeFee() {
        return MANAGEMENT_FEE;
    }

    protected boolean checkUser(final int id) {
        return getUsrID() == id;
    }

    protected void resetTransactions() {
         setnTransactions(0);
    }

    protected void incTransactions() {
        this.setnTransactions(getNTransactions() + 1);
    }
    
    private void transactionOp(int Id, final double amount) {
        if(getUsrID() == Id) {
            this.setBalance(getBalance() + amount);
            incTransactions();
        }
    }
}
