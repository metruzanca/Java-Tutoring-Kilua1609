package it.unibo.oop.lab04.bank2;

import it.unibo.oop.lab04.bank.BankAccount;

public abstract class AbstractBankAccount implements BankAccount {
    public static final double ATM_TRANSACTION_FEE = 1;
    public static final double MANAGEMENT_FEE = 5;

    private Double balance;
    private int nTransactions;
    private final int usrID;

    protected AbstractBankAccount(final Double balance, final int usrID) {
        this.balance = balance;
        this.usrID = usrID;
    }

    public double getBalance() {
        return balance;
    }

    public int getUsrID() {
		return usrID;
	}

    public int getNTransactions() {
		return nTransactions;
	}

	public void setnTransactions(int nTransactions) {
		this.nTransactions = nTransactions;
    }
    
    protected void setBalance(final double amount) {
        this.balance = amount;
    }

    public void deposit(int id, double amount) {
        if(id == getUsrID()) {
            balance += amount;
        }
    }

    public void depositFromATM(int id, double amount) {
        if(id == getUsrID()) {
            balance += amount - ATM_TRANSACTION_FEE;
        }
    }

    public void withdraw(int id, double amount) {
        if(id == getUsrID()) {
            balance -= amount;
        }
    }

    public void withdrawFromATM(int id, double amount) {
        if(id ==getUsrID()) {
            balance -= amount + ATM_TRANSACTION_FEE;
        }
    }


    public void computeManagementFees(int id) {
        if(id == getUsrID()) {
            balance -= MANAGEMENT_FEE;
        }
    }

     //non capisco come completarlo
     protected abstract boolean isWithDrawAllowed(double amount);
     //non capisco come completarlo
     protected abstract double  computeFee();
}

