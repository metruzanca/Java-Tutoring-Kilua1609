import java.util.ArrayList;
import java.util.stream.Stream;

public class Lambda {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);

    numbers.removeIf( n -> n >= 9);

    // numbers.forEach( n -> System.out.println(n) );

    // Method Chaining
    numbers.stream()
      .map( n -> n+1 )
      .forEach(n -> System.out.println(n));

    ArrayList<String> str = new ArrayList<String>();
    // Simulando un CSV
    str.add("luca;rossi");
    str.add("samuele;zanca");
    str.add("mattia;collari");

    str.stream()
      .map( s -> {
        String[] parts = s.split(";");
        return new Persona(parts[0], parts[1]);
      })
      .forEach(n -> System.out.println(n));
  }
}

class Persona{
  public String name;
  public String lname;
  public Persona(String name, String lname){
    this.name = capitalize(name);
    this.lname = capitalize(lname);
  }

  private String capitalize(String word){
    String[] letters = word.split("");
    String ret = "";
    for (String l : letters) {
      if(l == letters[0])
        ret.concat(l.toUpperCase());
      else
        ret.concat(l);
    }
    return ret;
  }

  @Override
  public String toString(){
    return name + " " + lname;
  }
}