package oop.lab03.acme;

public class Professor implements User{
    private int id;
    private String name;
    private String surname;
    private String password;
    private String[] courses;

    public Professor (int id, String name, String surname, String password, String[] courses) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = courses;
    }

    public void replaceCourse(String course, int index){
        courses[index] = course;
    }

    public void replaceAllCourses(String[] courses){
        this.courses = courses;
    }

    public String toString() {
        return String.format(
            "Professor [name =%s, surname =%s, id =%s]" ,
            this.name, this.surname, this.id
        );
    }

    @Override
    public String getUsername() {
        return surname + "." + name;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getDescription() {
        return this.toString();
    }
}
