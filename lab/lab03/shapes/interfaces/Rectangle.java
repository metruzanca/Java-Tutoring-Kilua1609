public class Rectangle implements Polygon {
    Double base;
    Double altezza;
    int nLati;
    
    public Rectangle(Double altezza, Double base, int nlati) {
        this.altezza = altezza;
        this.base = base;
        this.nLati = nlati;
    }

    public Double perimetro() {
        return (base + altezza) * 2; 
    }

    public Double area() {
        return base * altezza;
    }

    public int getEdgeCount() {
        return nLati;
    }

    public void stampaRettangolo() {
        System.out.println("Il perimetro del rettangolo è: " + perimetro());
        System.out.println("L'area del rettangolo è: "+ area());
        System.out.println("Il numero di angoli è: " + getEdgeCount() + "\n");
    }
}
