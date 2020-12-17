package oop.lab02.constructors;

public class UseConstructors {

    public static void main(final String[] args) {
        
        // 1) Creare lo studente Mario Rossi, matricola 1014, anno
        // immatricolazione 2013
        Student mario = new Student("Mario", "Rossi", 1014, 2013);
        // 2) Creare lo studente Luca Bianchi, matricola 1018, anno
        // immatricolazione 2010
        Student luca = new Student("Luca", "Bianchi", 1018, 2010);
        // 3) Creare lo studente Peppino Vitiello, matricola 1019, anno
        // immatricolazione 2012
        Student peppino = new Student("Peppino", "Vitiello", 1019, 2012);
        // 4) Creare lo studente Luca Verdi, matricola 1020, anno
        // immatricolazione 2013
        Student verdi = new Student("Luca", "Verdi", 1020, 2013); 
        // 5) Creare un treno con 300 posti di cui 100 in prima classe 200 in
        // seconda classe
        Train treno = new Train(100, 200);
        // 6) Creare un treno con 1100 posti di cui 50 in prima classe 1050 in
        // seconda classe
        Train t2 = new Train(50, 1050);
        // 7) Creare un treno con 500 posti, tutti di seconda classe
        Train t3 = new Train(0, 500);
        // 8) Creare un treno con numero di posti di default
        Train t4 = new Train();
        // 9) Per verificare la correttezza dei costruttori implementati
        // stampare a video le informazioni relative agli studenti (metodo
        // printStudentInfo) e ai treni (a tal fine implementare un metodo
        // printTrainInfo nella classe Train). Verificare che il numero di posti
        // di default sia consistente (ossia che ci sia un numero positivo di
        // posti totali, e che la somma dei posti in prima e seconda classe dia
        // il totale dei posti sul treno).
        mario.printStudentInfo();
        luca.printStudentInfo();
        peppino.printStudentInfo();
        verdi.printStudentInfo();

        treno.printTrain();
        t2.printTrain();
        t3.printTrain();
        t4.printTrain();


    }
}
