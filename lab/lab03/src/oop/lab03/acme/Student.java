package oop.lab03.acme;

public class Student implements User {

    private static final String DOT = ".";
    private final String name;
    private final String surname;
    private final int id;
    private final int matriculationYear;
    private final String password;

    public Student(final int id, final String name, final String surname, final String password, final int matriculationYear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.matriculationYear = matriculationYear;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getId() {
        return this.id;
    }

    public int getMatriculationYear() {
        return this.matriculationYear;
    }

    public String toString() {
        return String.format(
            "Student [name=%s, surname=%s, id=%s, matriculationYear=%s]",
            this.name, this.surname, this.id, this.matriculationYear
        );
    }

    public String getUsername() {
        return this.name + Student.DOT + this.surname;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDescription() {
        return this.toString();
    }
}

/*
    StringBuilder url = new StringBuilder();
    url.append("Stundent [name=");
    url.append(this.name);
    url.append(", surname=");
    url.append(this.name);
    url.append("Stundent [name=");
    url.append(this.name);
    url.append("Stundent [name=");
    url.append(this.name);
    url.append("Stundent [name=");
    url.append(this.name);

    url.toString()
*/