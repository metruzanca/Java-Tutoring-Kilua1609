package oop.lab03.bank;

//import javax.swing.plaf.basic.BasicBorders.MarginBorder;

//import org.graalvm.compiler.replacements.InstanceOfSnippetsTemplates.MaterializationUsageReplacer;

public class AccountHolder {

    private final String name;
    private final String surname;
    private final Integer userID;

        

    public AccountHolder(final String name, final String surname, final Integer accountID) {
        this.name = name;
        this.surname = surname;
        this.userID = accountID;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public Integer getUserID() {
        return this.userID;
    }

    public AccountHolder(String name, String surname, int userID) {
        this.name = name;
        this.surname = surname;
        this.userID = userID; 
    }

    public String toString() {
        
        return this.name + " " + this.surname + " " + this.userID;
    }

}

class AccountUser {
    private final String name;
    private final String surname;
    private final Integer id;

    public AccountUser(String name, String surname, Integer id) {
        this.name = name;
        this.surname = surname;
        this.id = id;
    }


}
