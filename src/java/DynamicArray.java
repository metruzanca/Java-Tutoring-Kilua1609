public class DynamicArray {
  private int[] num;
  private int length = 0;

  public int getLength() {
    return length;
  } 

  public DynamicArray() {
    num = new int[10];
  }


  public DynamicArray(int initialCapacity) {
    num = new int[initialCapacity]; 
  }
  /**
   * Get element at position index
   */
  public int get(int index) {
    return num[index]; 
  }

  /**
   * Insert element after last element
   */
  public void add(int element) {
    if(num.length == length) {
      increaseSize();
    }
    num[length] = element;
    length++;
  }

  private void increaseSize() {
    int[] tmp = num.clone();
    num = new int[2 * length];
    for (int i = 0; i < length; i++) {
      num[i] = tmp[i];
    }
  }
  /**
   * Remove the last element
   */
  public void remove() {
    // num[num.length - 1] = 0;
    length--;
  }

  /**
  * Insert element at index position
  */
  public void addAt(int element, int index) {
    int[] tmp = new int[length - index];
    for (int i = 0; i < tmp.length; i++) {
      tmp[i] = num[index + i];
    }
    num[index] = element;
    length++;
    for (int i = 0; i < tmp.length; i++) {
      num[index + i + 1] = tmp[i];
    }
  }

/*
1)
Elemento posizione: 3, index: 2, element: 47

Elemento posizione: 4, index: 3, element: 98
Elemento posizione: 5, index: 4, element: 89

tmp = [98, 89]

2)
Elemento posizione: 3, index: 2, element: 47

Elemento posizione: 4, index: 3, element: 100
Elemento posizione: 5, index: 4, element: 89

3)
Elemento posizione: 3,   index: 2,   element: 47
Elemento posizione: 4,   index: 3,   element: 100
Elemento posizione: 4+1, index: 3+1, element: 98
Elemento posizione: 5+2, index: 4+2, element: 89

*/

 /*
 1. Versione non optimale: due loop:
  1st loop:
    salvati in tmp[] tutti i valori da spostare da num[]
  2nd loop:
    usanto tmp[] sovrascrivi i valori di num[]
  fuori dal loop:
    length--

2. Versione migliore: un loop: (opzional)
 1st loop:
  Sposta tutti i indietro di uno partendo dal mezzo

 */

  /**
   * Remove element at index position
   */
  public void removeAt(int index) {
    int[] tmp = new int[length - index];
    for (int i = 0; i < tmp.length; i++) {
      tmp[i] = num[index + i + 1];
  }
  for (int i = 0; i < tmp.length; i++) {
    num[index + i] = tmp[i];
  }
  remove();
  }
}