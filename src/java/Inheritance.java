public class Inheritance {
  public static void main(String[] args) {
    Animal a = new Animal("Steve", 1, 5);
    Doggo d = new Doggo("Fido", 1, 5);
    a.speak();
    d.speak();

    System.out.println(a.toString());
    System.out.println(d.toString());

    Computer[] computerArray = new Computer[2];
    computerArray[0] = new PC();
    computerArray[1] = new MAC();

    for (Computer comp : computerArray) {
      comp.powerOn();
    }
  }
}

class Animal {
  String name;
  int age;
  int legs;
  public Animal(String name, int age, int legs){
    this.name = name;
    this.age = age;
    this.legs = legs;
  }

  @Override
  public String toString(){
    return "Animal " + name;
  }

  public void walk(){
    System.out.println("I am walking");
  }

  public void speak(){
    System.out.println("I am some animal");
  }
}

class Doggo extends Animal{
  private String name;

  public Doggo(String name, int age, int legs){
    super("Doggo", age, 4);
    this.name = name;
  }

  @Override
  public String toString() {
      return "Animal race: " + super.name + ", " + name;
  }

  @Override
  public void speak(){
    System.out.println("I am a cute fluffy doggo!");
  }
}

interface Computer {
  public void powerOn();
}

class PC implements Computer {
  public void powerOn(){
    System.out.println("Im a PC and I'm turning on.");
  }
}

class MAC implements Computer {
  public void powerOn(){
    System.out.println("Im a MAC and I'm turning on.");
  }
}