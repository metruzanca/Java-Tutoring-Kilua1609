public class DynamicArrayTests {
  public static void main(String[] args) {
    DynamicArray num = new DynamicArray(5);
    num.add(15);
    num.add(385);
    num.add(47);
    num.add(98);
    num.add(89);
    num.add(475);
    stampaArray(num);
    num.remove();
    stampaArray(num);
    num.addAt(100, 3);
    stampaArray(num);
    num.removeAt(0);
    stampaArray(num);
  }

  public static void stampaArray(DynamicArray array) {
    System.out.println("lunghezza: " + array.getLength());
    for(int i = 0; i < array.getLength(); i++) {
      System.out.println("Elemento posizione: " + (i+1) + ", index: " + i + ", value: " + array.get(i));
    }
    System.out.println("----------");
  }
}

/*
Elemento posizione: 1, index: 0, value: 15
Elemento posizione: 2, index: 1, value: 385
Elemento posizione: 3, index: 2, value: 47

lemento posizione: 4, index: 3, value: 100

Elemento posizione: 4+1, index: 3+1, value: 98
Elemento posizione: 5+2, index: 4+2, value: 89

*/


/**
 * 1 || 1 = 1
 * 1 || 0 = 1
 * 0 || 1 = 1
 * 0 || 0 = 0
 * 
 * 
 * checkIfTrue1() || checkifTrue2()
 * checkIfTrue1() && checkifTrue2()
 * 
 * 1 ^ 1 = 0
 * 0 ^ 0 = 0
 * 1 ^ 0 = 1
 * 0 ^ 1 = 1
 */
// length - index
// 5 - 4 - x = 2
// 5 -4 -2 = x
// 5 -6 = x
// -1 = x

// 5 -( 4 -1) = 2
// 5 -3 = 2