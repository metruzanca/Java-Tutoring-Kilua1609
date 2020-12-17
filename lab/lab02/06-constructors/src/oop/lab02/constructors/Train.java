package oop.lab02.constructors;

public class Train {

    int nTotSeats;
    int nFCSeats;
    int nSCSeats;

    int nFCReservedSeats;
    int nSCReservedSeats;

    // void build(final int nTotSeats, final int nFCSeats, final int nSCSeats) {
    //     this.nTotSeats = nTotSeats;
    //     this.nFCSeats = nFCSeats;
    //     this.nSCSeats = nSCSeats;
    //     this.nFCReservedSeats = 0;
    //     this.nSCReservedSeats = 0;
    // }

    public Train() {
        this(25, 55);
    }

    public Train(int nFCseats, int nSCSeats) {
        nTotSeats = nFCseats + nSCSeats;
        this.nFCSeats = nFCseats;
        this.nSCSeats = nSCSeats;
        nFCReservedSeats = 0;
        nSCReservedSeats = 0;
    }


    void reserveFCSeats(final int nSeats) {
        this.nFCReservedSeats += nSeats;
    }

    void reserveSCSeats(final int nSeats) {
        this.nSCReservedSeats += nSeats;
    }

    double getTotOccupancyRatio() {
        return (this.nFCReservedSeats + this.nSCReservedSeats) * 100d / this.nTotSeats;
    }

    double getFCOccupancyRatio() {
        return this.nFCReservedSeats * 100d / this.nFCSeats;
    }

    double getSCOccupancyRatio() {
        return this.nSCReservedSeats * 100d / this.nSCSeats;
    }

    void deleteAllReservations() {
        this.nFCReservedSeats = 0;
        this.nSCReservedSeats = 0;
    }

    void printTrain() {
        System.out.println("Numero totale posti : " + nTotSeats + "");
        System.out.println("Numero posti prima classe: " + nFCSeats);
        System.out.println("Numero posti seconda classe: " + nSCSeats);
        System.out.println("Numero posti riservati prima classe: " + nFCReservedSeats);
        System.out.println("Numero posti riservati seconda classe: " + nSCReservedSeats + "\n");
    }
}
