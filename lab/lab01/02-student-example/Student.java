class Student {

    String name;
    String surname;
    int id;
    int matriculationYear;

    void build(String name, String surname, int id, int matriculationYear) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.matriculationYear = matriculationYear;
    }

    void printStudentInfo() {
        System.out.println("Student's name: " + name);
        System.out.println("Student's surname: " + surname);
        System.out.println("Student's id: " + id);
        System.out.println("Student's matriculation Year: " + matriculationYear);
    }
}
