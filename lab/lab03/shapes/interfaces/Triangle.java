public class Triangle implements Polygon{
    Double base;
    Double cateto1;
    Double cateto2;
    Double altezza;
    int nLati;

    public Triangle(double base, double cateto1, double cateto2, double altezza, int nLati) {
        this.altezza = altezza;
        this.base = base;
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        this.nLati = nLati;
    }

    public Double area() {
        return (base * altezza) / 2;
    }

    public Double perimetro() {
        return base + cateto1 + cateto2;
    }

    public int getEdgeCount() {
        return nLati;
    }

    public void stampaTriangolo() {
        System.out.println("Il perimetro del triangolo è: " + perimetro());
        System.out.println("L'area del triangolo è: " + area());
        System.out.println("Il numero di angoli del triangolo è: " + getEdgeCount() + "\n");
    }
}
