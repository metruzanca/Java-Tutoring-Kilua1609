public class ByReference {
  public static void main(String[] args) {

    System.out.println("Passed by Value"); // by copy

    String dog = "Fuffy";
    System.out.println(dog);
    changeString(dog);
    System.out.println(dog);

    System.out.println("Passed by Reference"); // by reference copy

    String[] dogs = new String[] { "Fuffy", "Alex" };
    System.out.println(Helpers.formatArrayString(dogs));
    changeArray(dogs);
    System.out.println(Helpers.formatArrayString(dogs));

    System.out.println("Passed by Reference");

    Rectangle rects = new Rectangle(5, 10);
    System.out.println(rects.altezza);
    changeObject(rects);
    System.out.println(rects.altezza);
  }

  public static void changeString(String str) {
    str = "Fido";
  }

  public static void changeArray(String[] arr) {
    arr[0] = "Fido";
  }

  public static void changeObject(Rectangle rect) {
    rect.altezza = 1;
    rect.lunghezza = 2;
  }
}

class Rectangle {
  int altezza;
  int lunghezza;

  public Rectangle(int altezza, int lunghezza) {
    this.altezza = altezza;
    this.lunghezza = lunghezza;
  }
}