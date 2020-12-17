package oop.lab03.acme;

import java.util.Arrays;

public class Exam {
    private int id;
    private int maxStudents;
    private int registeredStudents;
    private String courseName;
    private Professor professor;
    private ExamRoom room;
    private Student[] students;

    public Exam(
      int id,
      int maxStudents,
      int registeredStudents,
      String courseName, 
      Professor professor,
      ExamRoom room,
      Student[] students
    ) {
      this(id, maxStudents, registeredStudents, courseName, professor, room);
      this.students = students;
    }

    public Exam(int id, int maxStudents, int registeredStudents, String courseName, Professor professor, ExamRoom room) {
      this.id = id;
      this.maxStudents = maxStudents;
      this.registeredStudents = registeredStudents;
      this.courseName = courseName;
      this.professor = professor;
      this.room = room;
    }

    public int getId() {
        return id;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public int getRegisteredStudents() {
        return registeredStudents;        
    }

    public String getCourseName() {
        return courseName;
    }

    public Professor getProfessor() {
        return professor;
    }

    public ExamRoom getRoom() {
        return room;
    }

    public Student[] getsStudents() {
        return students;
    }

    public void registeredStudent(Student student) { 
        if (registeredStudents < maxStudents) {
            students[registeredStudents] = student;
            registeredStudents++;
        }
    }

    public String toString() {
        return " " + Arrays.toString(students);
    }    
    
}