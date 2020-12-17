public class Circle implements Shape {
    Double raggio;

    public Circle(Double raggio) {
        this.raggio = raggio;
    }
    
    public Double perimetro() {
        return 2 * raggio * Math.PI;
        
    }

    public Double area() {
        return raggio * raggio * Math.PI;
    }

    public void stampaCerchio() {
        System.out.println("L'area del cerchio è " + area());
        System.out.println("Il perimetro del cerchio è: " + perimetro() + "\n");
    }
}