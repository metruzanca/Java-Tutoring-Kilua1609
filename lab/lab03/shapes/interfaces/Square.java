public class Square implements Polygon{
    double lato;
    int nLati;

    public Square(Double lato, int nLati) {
        this.lato = lato;
        this.nLati = nLati;
    }

    public Double perimetro() {
        return lato * 4;
    }

    public Double area() {
        return lato * lato;
    }

    public int getEdgeCount() {
        return nLati;
    }

    public void stampaSquare() {
        System.out.println("Il perimetro del quadrato è: " + perimetro());
        System.out.println("L'area del quadrato è: " + area());
        System.out.println("Il numero di angoli è: " + getEdgeCount() + "\n");
    }   
}
