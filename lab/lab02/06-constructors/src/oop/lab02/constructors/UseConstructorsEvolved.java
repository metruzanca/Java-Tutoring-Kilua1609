package oop.lab02.constructors;

public class UseConstructorsEvolved {

    public static void main(final String[] args) {
        // Creare un treno con numero di posti di default, come nel caso
        // precedente
        //     - serve a verificare la nuova implementazione di Train()
            Train treno = new Train();

        // Creare i seguenti treni usando il costruttore Train(int nFCSeats, int
        // nSCSeats)
        //     - nFCSeats = 20; nSCSeats= 200;
        //     - nFCSeats = 35; nSCSeats= 165;
            Train treno2 = new Train(20, 200);
            Train treno3 = new Train(35, 165);

        // Per verificare la correttezza dei costruttori implementati stampare a
        // video le informaizioni relative ai treni (a tal fine si usi il metodo
        // printTrainInfo nella classe Train)

        treno.printTrain();
        treno2.printTrain();
        treno3.printTrain();
    }

}
