package oop.lab03.bank.interfaces;

import oop.lab03.bank.AccountHolder;
import oop.lab03.bank.SimpleBankAccount;
import oop.lab03.bank.StrictBankAccount;

public final class TestBankAccount {

    private TestBankAccount() {
    }

    public static void main(final String[] args) {
        
        // 1) Creare l' AccountHolder relativo a Mario Rossi con id 1

        AccountHolder mario = new AccountHolder("Mario", "Rossi", 1);
        
        // 2) Creare l' AccountHolder relativo a Luigi Bianchi con id 2

        AccountHolder luigi = new AccountHolder("Luigi", "Bianchi", 2);
        
        
        // 3) Dichiarare due variabili di tipo BankAccount ed inizializzarle,
        // rispettivamente, con oggetti di tipo SimpleBankAccount per il conto di Mario
        // Rossi (ammontare iniziale = 0), e di tipo StrictBankAccount per il conto di
        // Luigi Bianchi (ammontare iniziale = 0)

        SimpleBankAccount marioAccount = new SimpleBankAccount(1, 0);
        StrictBankAccount luigiAccount = new StrictBankAccount(2, 0);
        
        // 4) Prima riflessione: perché è stato possibile fare la new di due classi
        // diverse in variabili dello stesso tipo?
        // (risposta by Mattia) perchè abbiamo creato istanze della classe        
        
        // 5) Depositare €10000 in entrambi i conti

        marioAccount.deposit(1, 1000);
        luigiAccount.deposit(2, 1000);
        
        
        // 6) Prelevare €15000 da entrambi i conti

        marioAccount.withdraw(1, 15000);
        luigiAccount.withdraw(2, 15000);
        
        // 7) Stampare in stdout l'ammontare corrente

        marioAccount.printBank();
        luigiAccount.printBank();
        
        
        // 8) Qual è il risultato e perché?
        // il primo conto permette di effettuare tutte le operazioni date
        // il secomdo non permette il withdraw
         
        // 9) Depositare nuovamente €10000 in entrambi i conti

        marioAccount.deposit(1, 10000);
        luigiAccount.deposit(2, 10000);

        // 10) Invocare il metodo computeManagementFees su entrambi i conti

        marioAccount.chargeManagementFees(1);
        luigiAccount.chargeManagementFees(2);

        // 11) Stampare a video l'ammontare corrente

        marioAccount.printBank();
        luigiAccount.printBank();

        // 12) Qual è il risultato e perché?
        //il conto di mario non subisce management fees perchè non esiste il corpo di quel metodo
        //il conto di luigi si
    }
}
