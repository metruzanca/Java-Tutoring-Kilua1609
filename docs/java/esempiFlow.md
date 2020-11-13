Questi sono esercizzi esempio di come poter utilizzare i flow controll
```java
import java.util.Random;

//La classe MinMax è dove il 90% del programma è contenuto
public class MinMax {
//Il primo metodo fornisce i Println che stamperanno i risultati del programma 
  public static void main(String[] args) {
 
    Integer[] numbersInOrder = fillArray(4);      
    System.out.println("In         order:" + formatArrayString(numbersInOrder));
    

    Integer[] numbersInReverse = reverse(numbersInOrder);

    System.out.println("In         order:" + formatArrayString(numbersInOrder));
    System.out.println("In reverse order:" + formatArrayString(numbersInReverse));
  }
//Il seconod metodo crea gli array che useremo per il resto dei metodi
  public static String formatArrayString(Integer[] arr) { 
    String s = "";  
    for (Integer i : arr) {
      s += i.toString() + " ";
    }
    return s;
  }

//Il terzo metodo crea i numeri con cui riempiremo i nostri array *1
  public static Integer getRandomNumberUsingNextInt(int min, int max) { 
    Random random = new Random();
    return random.nextInt(max - min) + min;
  }

//rienpe gli arrei creati
  public static Integer[] fillArray(int cap) { 
    Integer[] arr = new Integer[cap];
    for (int i = 0; i < cap; i++) {
      arr[i] = getRandomNumberUsingNextInt(0, 9);
    }
    return arr;
  }
//prima proposta per un metodo efficace per trovare l'elemento maggiore nell'array
  public static Integer getMax(Integer[] arrayNumeri) {
//Ciò che principalmente ci impedisce di poter trovare il valore maggiore
//è che non possiamo salvare lo status della nostra variabile i così facilmente. 
    for (int i : arrayNumeri) {
//Questo boolean è la soluzione al nostro problema di status della variabile i     
      boolean isCurrent = true;
//il for each e i due if prendono il valore dell'array in posizione i
//e o lo confronta a tutti gli altri e se non è il più grande continua
//il ciclo aumentando i di i e avanzando quindi alla posizione successiva nell'array     
      for (int ii : arrayNumeri) {
      //l'if qui ci permette di dire al ciclo di continuare e ingorare questa condizione     
        if (i == ii) 
          continue;
//Questo è l'if che ci permette di confrontare il termine in posizione
//i con il resto nell'array
        if (ii > i) { 
          isCurrent = false;
        }
      }
      if (isCurrent) {
        return i;
      }
    }
    return -1;
  }
//La prima proposta per questo metodo è poco efficente e molto lenta per via
//del fatto che per ogni singolo valore dell'array dobbiamo analizare tutti
//gli altri ogni volta e quindi ciò rallenta tremendamente il processo
//Seconda proposta per il metodo
  public static Integer getMaxV2(Integer[] arrayNumeri) {
    Integer state = null;   /*status della variabile*/
    for (int i = 0; i < arrayNumeri.length - 1; i++) {
      state = arrayNumeri[i] > arrayNumeri[i + 1] ? arrayNumeri[i] : arrayNumeri[i + 1];
//L'uso di un ternario ci permette facilmente di salvare lo stato
//della nostra variabile in "state"
//Nel ternario abbiamo che se il valore in posizione i è > di quello in posizione
//i + 1 allora deve salvare in state il valore in i e se i < i + 1 allora deve
//salvare il valore in i + 1 e poi continuare ai valori successivi
    }
    return state;
  }
//La secondo proposta per il metodo getMax è moooolto più efficente della prima
//dato che il confronto per trovare il maggiore di tutti i valore non viene fatto
//tra tutti i valori nell'array ogni volta ,ma bensì tra due alla volta escludendo
//poi uno dei due per passare al successivo per il confronto rendendo la quantità
//di cicli estremamente più bassa e anche la quantità di linee da eseguire
//è drasticamente diminuita.

//il metodo per get min è uguale a quello di get max cambia solo la condizione
  public static Integer getMin(Integer[] arrayNumeri) {
    Integer status = null; 
    for (int i = 0; i < arrayNumeri.length - 1; i++) {
      status = arrayNumeri[i] < arrayNumeri[i + 1] ? arrayNumeri[i] : arrayNumeri[i + 1];
    }
    return status;
  }
//Metodo inversione elementi array
  public static Integer[] reverse(Integer[] arrayNumeri) {
//Creiamo un nuovo array integer
    Integer[] newArray = new Integer[arrayNumeri.length];
//Poniamo il ciclo in for con la una particolare condizione però; dato
//che dobbiamo invertire di posizione a due a due gli elementi dell'array
//non possiamo arrivare fino in fondo all'array, perchè invertirebbe una seconda
//volta gli elementi degli array portandoli alle posizioni orginali nullificando
//il nostro lavoro, quindi diciamko alla condizione di fermare il ciclo prima
//del elemento nella posizione equivalente alla metà della lunghezza dell'array. 
    for (int i = 0; i < Math.floor(newArray.length / 2); i++) {
      //Queste due funzioni sono il fulcro del nostro metodo, è grazie a loro se l'inversione avviene  
      newArray[i] = arrayNumeri[arrayNumeri.length - 1 - i];
      newArray[newArray.length - 1 - i] = newArray[i]; 

//per salvare lo stato del valore del termine in posizione i del nostro array
//creiamo un nuovo array dove copiamo tutti i valori originali. Useremo quindi
//la copia dei valori del nostro array invece degli originali lasciandoli
//quindi intatti.
    }
    return newArray;
  }

  public static int compareNum(int a, int b) {
    if (a < b) {
      return b;
    } else {
      return a;
    }

  }
}

```