package oop.lab03.bank;

public final class TestSimpleBankAccount {

    private TestSimpleBankAccount() { }

    public static void main(final String[] args) {
        
        //   1) Creare l' AccountHolder relativo a Mario Rossi con id 1 2) Creare
        //   l' AccountHolder relativo a Luigi Bianchi con id 2 3) Creare i due
        //   SimpleBankAccount corrispondenti 4) Effettuare una serie di depositi e
        //   prelievi 5) Stampare a video l'ammontare dei due conti e verificare
        //   la correttezza del risultato 6) Provare a prelevare fornendo un idUsr
        //   sbagliato 7) Controllare nuovamente l'ammontare
         
        AccountHolder mario = new AccountHolder("Mario", "Rossi", 12);
        AccountHolder luigi = new AccountHolder("Luigi", "Bianchi", 23);
        SimpleBankAccount marioAccount = new SimpleBankAccount(12, 1000);
        SimpleBankAccount luigiAccount = new SimpleBankAccount(23, 50);

        marioAccount.deposit(12, 300);
        marioAccount.withdraw(12, 500);
        marioAccount.withdrawFromATM(12, 2000);
        marioAccount.depositFromATM(12, 100);
        marioAccount.printBank();

        luigiAccount.deposit(23, 500);
        luigiAccount.withdraw(23, 850);
        luigiAccount.depositFromATM(23, 400);
        luigiAccount.withdrawFromATM(23, 18);
        luigiAccount.printBank();

        luigiAccount.withdraw(45, 50);
        luigiAccount.printBank();
    }
}
