public class BankAccounts {

    public static void main(String[] args) {
        Savings acc1 = new Savings(2000);
        Account acc2 = new Account(2000, 10);
        acc1.deposit(2000);
        int withdrew = acc1.withdrawl(2000);
        System.out.println("withdrew: " + withdrew);
        System.out.println("Acc1: " + acc1.getFunds());
        System.out.println("Acc2: " + acc2.getFunds());
        // acc2.applyInterest();
        acc2.transferTo(acc1, 2000);
        System.out.println("Acc2 -> 20€ -> Acc1");
        System.out.println("Acc2: " + acc2.getFunds() + ", Acc1: " + acc1.getFunds());
    }
}

/*# Bank Accounts

1. Declare a class called `Account`.

- Declare the instance variables `funds` & `interestRate`.
- `interestRate` will be set to `0`.
- Declare a protected constructor that instanciates the variables.
- Declare a method called `withDrawl` which will return the amount withdrawn and modify the `funds` variable.
- If the account doesn't have enough funds, return the amount which is withdrawable.
- Declare a method called `deposit` which will add to our funds.
- Declare a method called `applyInterest` which will apply the current `ìnterestRate` to the current `funds`.
- Declare a method called `transferTo` which accepts a first parameter of `Account` and a second being the amount to transfer.
*/

// superclass e subclass

class Account {
    private int funds = 0;

    public double getFunds(){
        return (double)funds / 100;
    }

    private int interestRate = 0;
    
    public int getInterestRate(){
        return interestRate;
    }

    protected Account (int funds, int interestRate) {
        this.funds = funds;
        this.interestRate = interestRate;
    }
    
    public int withdrawl(int amount) {
        if (amount > funds) {
            int tmp = funds;
            funds = 0;
            return tmp;
        }
        funds -= amount;
        return amount;
    }
    
    public void deposit(int amount) {
        funds += amount;
    }

    public void applyInterest () {
        System.out.println((1 + interestRate/100));
        funds *= (1 + interestRate/100);
    }
    
    public void transferTo(Account acc, int amount){
        int amountWithdrawn = this.withdrawl(amount);
        acc.deposit(amountWithdrawn);
    }
}
/*
2. Declare a class called `Savings` which extends `Account`.

- This variation of `Account` will have a higher `interestRate`.
- `interestRate` will be set to `6%`.
- `interestRate` is  fixed and not changeable via the constructor of `Savings`.
- `Savings` cannot use `withdrawal`. If a `withdrawl` is attempted, throw a new `Exception`.
*/

class Savings extends Account {
    public Savings (int funds) {
        super(funds, 6);
    }
    
    @Override
    public int withdrawl(int amount) {
        return 0;
    }
    
}

/*
3. Declare a class called `Checking` which exten ccount`.

- `interestRate` will be set to `2%`.
- This variation of `Account` will have a `withDrawlLimit`.*/

// class Checcking extends Account {
//     public Checcking(int funds){
//         super(funds,2);
//     }

//     @Override
//     public int withdrawl(int amount, int limit) {
//         if(amount > limit) {
            
//         }
//     }
// }