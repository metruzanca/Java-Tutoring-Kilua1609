public class WorkWithShapes {
    public static void main(String[] args) {
        Circle cerchio = new Circle(1.0);
        Square quadrato = new Square(2.0, 4);
        Rectangle rettangolo = new Rectangle(6.0, 5.0, 4);
        Triangle triangolo = new Triangle(5.0, 5.0, 5.0, 6.0, 3);

        cerchio.area();
        cerchio.perimetro();
        cerchio.stampaCerchio();

        quadrato.perimetro();
        quadrato.area();
        quadrato.getEdgeCount();
        quadrato.stampaSquare();

        rettangolo.perimetro();
        rettangolo.area();
        rettangolo.getEdgeCount();
        rettangolo.stampaRettangolo();

        triangolo.perimetro();
        triangolo.area();
        triangolo.getEdgeCount();
        triangolo.stampaTriangolo();
    }  
}