package oop.lab03.bank;

import oop.lab03.bank.interfaces.BankAccount;

public class SimpleBankAccount implements BankAccount {

	private int userID;
    
    //   Aggiungere i seguenti campi:
    //   - double balance: ammontare del conto
    private double balance = 0;
    //   - int userID: id del possessore del conto (già dichiarato: si veda al riguardo il metodo checkUser dichiarato in fondo alla classe)
    private int id = 1074;
    //   - int nTransactions: numero delle operazioni effettuate
    private int nTransactions = 0;
    //   - static double ATM_TRANSACTION_FEE = 1: costo delle operazioni via ATM
    private final static double ATM_TRANSACTION_FEE = 1;

    
    //Creare un costruttore pubblico che prenda in ingresso un intero (ossia l'id
    //dell'utente) ed un double (ossia, l'ammontare iniziale del conto corrente).

    public SimpleBankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    //   Si aggiungano selettori per: 
    // - ottenere l'id utente del possessore del conto
    public int getId() {
        return this.id;
    }
    // - ottenere l'ammontare corrente del conto.
    public double getBalance() {
        return this.balance;
    }
     

    public void deposit(final int usrID, final double amount) {
        
        //  Incrementa il numero di transazioni e aggiunge amount al totale del
        //  conto Nota: il deposito va a buon fine solo se l'id utente
        //  corrisponde
        if (usrID == id) {
            nTransactions++;
            balance += amount;
        }    
    }

    public void withdraw(final int usrID, final double amount) {
        
        //Incrementa il numero di transazioni e rimuove amount al totale del
        //conto. Note: - Il conto puo' andare in rosso (ammontare negativo) -
        //Il prelievo va a buon fine solo se l'id utente corrisponde
        if(usrID == id) {
           nTransactions++;
           balance -= amount;
        }
    }

    public void depositFromATM(final int usrID, final double amount) {
        
        //Incrementa il numero di transazioni e aggiunge amount al totale del
        //conto detraendo le spese (costante ATM_TRANSACTION_FEE) relative
        //all'uso dell'ATM (bancomat) Nota: il deposito va a buon fine solo se
        //l'id utente corrisponde
        if (usrID == id) {
            nTransactions++;
            balance += amount - ATM_TRANSACTION_FEE;
        }
    }

    public void withdrawFromATM(final int usrID, final double amount) {
        
        //   Incrementa il numero di transazioni e rimuove amount + le spese
        //   (costante ATM_TRANSACTION_FEE) relative all'uso dell'ATM (bancomat)
        //   al totale del conto. Note: - Il conto puo' andare in rosso (ammontare
        //   negativo) - Il prelievo va a buon fine solo se l'id utente
        //   corrisponde
        if(usrID == id) {
            nTransactions++;
            balance -= amount + ATM_TRANSACTION_FEE;
        }
    }

    public void printBank() {
        System.out.println("Current balance " + balance);
    }

    /* Utility method per controllare lo user */
    private boolean checkUser(final int id) {
        return this.userID == id;
    }

    @Override
    public void chargeManagementFees(int usrID) {
        // This version of bankaccount does not have fees
    }

    @Override
    public int getTransactionsCount() {
        return nTransactions;
    }
}
