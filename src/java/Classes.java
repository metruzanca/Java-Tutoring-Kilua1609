public class Classes {
  public static void main(String[] args) {
    Person m1 = new Person("name1", 7);
    Person m2 = new Person("name1", 8);
    System.out.println(m1.age);

  }
}

/*
 * classes
 * 
 * access control (public private and protected)
 * 
 * static
 * 
 * ereditarieta
 * 
 * overriding
 * 
 * interfaces
 */

class Person {
  String name;
  Integer age;

  public Person(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public boolean areEqual(Person obj) {
    return this.name == obj.name;
  }
}

class MyMath {
  public Integer Add1(Integer n) {
    return Add(n, 1);
  }

  public Integer Add2(Integer n) {
    return Add(n, 2);
  }

  private Integer Add(Integer a, Integer b) {
    return a + b;
  }
}