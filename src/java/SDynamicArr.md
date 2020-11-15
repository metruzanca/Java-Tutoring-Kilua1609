```java
//legenda:
//-index: indica la posizione esatta nell'array.
//-Elemento posizione: indica la posizone dell'elemento di un array partendo da 0.
//-element: valore dell'elemento


//impostiamo la classe del nostro dynamic array
public class DynamicArray {   
  private int[] num;
  private int length = 0;

//metodo per identificare la lunghezza dell'array
  public int getLength() { 
    //"length" ci permette di immediatamente scoprire la lunghezza dell'array 
    //che è fondamentale per sviluppare un dynamic array.
    //length si può usare come "length()" oppure come ".length", il primo funziona
    //con String e il secondo funziona con int[], double[], String[]  
    return length;
  }

//costruttore di un nuovo array
  public DynamicArray() {   
    //dato il funzionamento degli array dinamici, un metodo che ci permette di creare
    //un nuovo array a comando è fondamentale
    num = new int[10];
  }

//array inzializzato per indicare la capacità iniziale dell'array in esame
  public DynamicArray(int initialCapacity) { 
    //questo metodo è dove indicheremo la capacità iniziale dell'array che immettiamo
    //come imput   
    num = new int[initialCapacity];
  }
  /**
   * Get element at position index
   */
  //metodo per porre un determinato elemente in una posizione a nostra scelta
  public int get(int index) {   
    //E' un metodo molto semplice che ci permette di dare un determinato volore
    //a una posizione a scelta dell'array.
    return num[index]; 
  }

  /**
   * Insert element after last element
   */
  //metodo add che ha lo scopo di aggiungere un elemento all'ultimo posto
  public void add(int element) {
    //il metodo add ha lo scopo di aggiungere un nostro elemento a scelta come
    //ultimo valore del nostro array.
    //questo if ha lo scopo di aumentare la grandezza del nostro array di 1 per 
    //fare spazio al nuovo elemento.
    if(num.length == length) {
      //increaseSize è un metodo che abbiamo programmato apposta per questo scopo di
      //ingrandimento
      increaseSize();
    }
    num[length] = element;
    length++;
  }

//metodo utilizzato per l'"aumento" della grandezza del nostro array
  private void increaseSize() {
    //tmp è un array temporario che usiamo per salvare i nostri elementi, per 
    //poterli spostare poi nel nostro nuovo array.
    int[] tmp = num.clone();
    //per non over complicare il nostro programma con un altro metodo per poter
    //calcolare l'esatto spazio di cui abbiamo bisogno per gli elementi, poniamo che 
    //il nuovo array avrà il doppio dello spazio dell'originale.
    num = new int[2 * length];
    //questo for ci permette di trasferire tutti gli elementi rimasti in tmp al nostro
    //nuovo array.
    for (int i = 0; i < length; i++) {
      num[i] = tmp[i];
    }
  }

  /**
   * Remove the last element
   */
  //metodo che rimuove l'ultimo elemento dell'array e ne aggiusta la grandezza
  //in relazione a tale rimozione.
  public void remove() {
    // num[num.length - 1] = 0;
    //essendo che con un normale remove rimuoviamo solo un elemento alla volta,
    //possiamo benissimo usare un decremento per il valore "length".
    length--;
  }

  /**
  * Insert element at index position
  */
  //metodo per aggiungere un elemento in una determinata posizione muovendo anche
  //il resto senza cancellare l'orginale.
  //addAt è un bel pò più complesso di add
  public void addAt(int element, int index) {
    //prima di tutto dobbiamo salvare tutti gli elementi che appartengono
    //alla posizione a cui vogliamo aggiungere il nostro nuovo elemento e 
    //anche quelli dopo, facciamo ciò usando l'array "tmp" creato apposta
    //per ciò.
    //per prima cosa creaiamo l'array tmp che avrà come lunghezza, la lunghezza 
    //dell'array originale meno la posizione dove dobbiamo aggiungere. 
    int[] tmp = new int[length - index];
    //questo for sarà il nostro mezzo con cui trasferiremo tutti gli elementi dell'array
    //in tmp.
    for (int i = 0; i < tmp.length; i++) {
      tmp[i] = num[index + i];
    }
    //con questo sostituiamo l'elemento originale in quel punto dell'array con
    //l'elemento che vogliamo aggiungere.
    num[index] = element;
    //e dato che è un solo elemento alla volta allora basta un incremento di length.
    //Per più elementi dovremmo calcolare la lunghezza in modo diverso.
    length++;
    //Questo for finale rimetterà i nostri elementi di nuovo in posizione,
    //calcolando anche lo spostamento dovuto all'aggiunta.
    for (int i = 0; i < tmp.length; i++) {
      num[index + i + 1] = tmp[i];
    }
  }
```