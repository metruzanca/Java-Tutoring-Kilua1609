package oop.lab03.acme;

//import sun.rmi.runtime.RuntimeUtil.GetInstanceAction;

public final class Testing {

    private Testing() { }

    public static void main(final String[] args) {
        
        //  1) Creare 3 studenti a piacere
        Student gianni = new Student(1012, "Gianni", "Morandi", "vigolaIlGatto", 2015);
        Student giuanni = new Student(3112, "Giuanni", "Spaciu", "turiSolid", 2018);
        Student luca = new Student(1111, "Luca", "Lunaco", "tespacciocasa", 2001);

        //  2) Creare 2 docenti a piacere
        String[] courses1 = new String[] {"Italiano", "Informatica"};
        Professor daniele = new Professor(4315, "Daniele", "Piantadose", "lepiantesonobelle", courses1);

        String[] courses2 = new String[] {"Matematica", "Storia"};
        Professor andreotti = new Professor(1119, "Andreotti", "Marconu", "Marconubest", courses2);

        //  3) Creare due aulee di esame, una con 100 posti una con 80 posti
        ExamRoom audioVideo1 = new ExamRoom(100, "Aula audio video", true, true);
        ExamRoom audioVideo2 = new ExamRoom(80, "Seconda aula audio video", true, true);

        //  4) Creare due esami, uno con nMaxStudents=10, l'altro con nMaxStudents=2
        Exam esameMate = new Exam(76, 10, 0, "Corso di matematica", andreotti, audioVideo1);

        Exam esameInfo = new Exam(77, 2, 0, "Esame informatica", daniele, audioVideo2);

        //  5) Iscrivere tutti e 3 gli studenti agli esami
        esameMate.registeredStudent(giuanni);
        esameMate.registeredStudent(gianni);
        esameMate.registeredStudent(luca);

        esameInfo.registeredStudent(giuanni);
        esameInfo.registeredStudent(gianni);
        esameInfo.registeredStudent(luca);
        // 6) Stampare in stdout la rapresentazione in stringa dei due esami
        esameMate.toString();
        esameInfo.toString();
    }

    
}
