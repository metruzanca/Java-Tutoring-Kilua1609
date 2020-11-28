class UseTrain {
    public static void main(String[] args) {
        /*
         * Premesse per un corretto testing della classe. Per ragioni di
         * coerenza e semplicità:
         * - I vari metodi siano sempre invocati passando dei parametri di input
         * validi e consistenti (p.e. non invocare i metodi per effettuare delle
         * prenotazioni specificando un numero di posti superiore alla capienza
         * del treno, ai posti disponibili per la classe (prima/seconda)
         * considerata, al numero di posti correntemente liberi
         *
         *
         * Testing: 1) Creare un oggetto della classe Train specificando valori
         * a piacere, per i parametri
         *
         * 2) Effettuare delle prenotazioni in prima e seconda classe
         * specificando un numero di posti da prenotare consistente
         *
         * 3) A seguito di ciascuna prenotazione stampare la ratio di
         * occupazione totale e per ciascuna classe.
         *
         * 4) Cancellare tutte le prenotazioni
         *
         * 5) Prenotare nuovamente dei posti e stampare le nuove percentuali di
         * occupazione
         */

        Treno train = new Treno(10, 20);
        train.reserveFirstClassSeats(10);
        train.reserveSecondClassSeats(6);
        printTrain(train);
        train.deleteAllReservations();
        printTrain(train);
    }

    public static void printTrain(Treno train){
        System.out.println("Tot: " + train.nTotSeats);
        System.out.println("Available First  Class: " + train.nFirstClassSeats);
        System.out.println("Available Second Class: " + train.nSecondClassSeats);
        System.out.println("Reserved  First  Class: " + train.nFirstClassReservedSeats);
        System.out.println("Reserved  Second Class: " + train.nSecondClassReservedSeats);
        System.out.println("Ratio Tot:          " + train.getTotOccupancyRatio());
        System.out.println("Ratio First Class:  " + train.getFirstClassOccupancyRatio());
        System.out.println("Ratio Second Class: " + train.getSecondClassOccupancyRatio());
        System.out.println("-------------------------------");
    }
}


class Treno{
    int nTotSeats;
    int nFirstClassSeats;
    int nSecondClassSeats;
    int nFirstClassReservedSeats;
    int nSecondClassReservedSeats;

    public Treno (
        int firstClassSeats,
        int secondClassSeats
    ) {
        this.nTotSeats = firstClassSeats + secondClassSeats;
        this.nFirstClassSeats = firstClassSeats;
        this.nSecondClassSeats = secondClassSeats;
        this.nFirstClassReservedSeats = 0;
        this.nSecondClassReservedSeats = 0;
    }

    public void reserveFirstClassSeats(int seats) {
        nFirstClassReservedSeats += seats;
        nFirstClassSeats -= seats;
    }

    public void reserveSecondClassSeats(int seats){
        nSecondClassReservedSeats += seats;
        nSecondClassSeats -= seats;
    }
    
    public double getTotOccupancyRatio(){
        int reserved = nFirstClassReservedSeats + nSecondClassReservedSeats;
        return ((double)reserved * 100) / nTotSeats;
    }

    public double getFirstClassOccupancyRatio(){
        return ((double)nFirstClassReservedSeats * 100) / nTotSeats;
    }
    
    public double getSecondClassOccupancyRatio(){
        return ((double)nFirstClassReservedSeats * 100) / nTotSeats;
    }
    
    public void deleteAllReservations(){
        nFirstClassSeats += nFirstClassReservedSeats;
        nSecondClassSeats += nSecondClassReservedSeats;
        nFirstClassReservedSeats = 0;
        nSecondClassReservedSeats = 0;
    }
    
}