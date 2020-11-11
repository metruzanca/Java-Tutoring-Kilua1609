# JAVA PER IDIOTI

Per prima cosa im java per iniziare il programma dobbiamo dichiarare le classi del programma
Esempio:
```java
class Esempio {                         //Qui indichiamo il nome della classe, esso è estremamente importante e fondamentale per il funzionamento

//questa parte è dove iseriremo le variabili (oggetti o primitive o wrapper) e le funzioni della classe (metodi)

}
```
Ogni classe di java deve avere la funzione main
```java
public static void main(String[] args) {                            //questo metodo è il più importante ed è necessaria la sua presenza in ogni classe

//QUi è dove inseriamo le funzioni e le variabili che useremo nel metodo

}              
```
"pubblic": serve per indicare che questo metodo è visibile da tutti senza       esclusioni.

"static": serve a indicare che le funzioni all'interno di questo metodo
        sono appartenenti solo alla classe del metodo e non possono essere usate altrove.

"void": il tipo di dato che il nostro metodo da in ritorno e può essere utilizzato solo per ritorni.

Una cosa come ad esempio: "void v;" non è possibile da fare
"main": serve a indicare il nome del metodo che ci permetterà quindi di chiamare le funzioni al suo interno (può avere nomi diversi da main però avere un metodo chiamato main è obbligatorio).


```java
//come si può vedere il metodo può avere diversi nomi
public static void log(String str) {
  //Questa è la funzione più basica di java,una funziuone di stampa a schermo          
  System.out.println(str);              
}
```

Non posso dichiarare più volte la stessa variabile con lo stesso nome perchè è come se dicessi al compilatore di creare la stessa variabile con due valori diversi e manderebbe in conflitto
Esempio:
```java
String s1 = "asasasas";
String s1 = "afdvazbz";            // errore
```
```java
String s1 = "asasasasa";
s1 = "schifo"               // giusto
```
Questo è anche uno dei motivi per cui l'operatore "this" è così importante

<center>
TIPI DI DATO
</center>

Esistono varie tipi di dato utilizzabili in java però si dividono principalmente in tre categorie: Primitivi, Wrapper e Java Types.
I primitivi sono la tipologia di dato pressochè presente in ogni singolo linguaggio di programmazione, essi sono come come "int","char","string" ecc....; 


I wrapper sono l'equivalente in oggetto dei primitivi; Se i primitivi hanno pochissime opzioni per essere utilizzati i wrapper ne hanno MOOOOOOOOOOOOOLTE di più che quindi ci permettono una quantità di diversi utilizzi altissima, però non sono sempre convenienti da usare perchè ovviamente sono anche più pesanti e complicati da usare dei primitivi

I java type infine sono le tipologie di esclusivamente oggetto che sono esclusivi di java sono moltissimi tipi diversi.

i wrapper e i primitivi sono compatibili tra di loro
Esempio:
```java
//Come possiamo vedere abbiamo definito il tipo del metodo come un wrapper ma
//abbiamo usato il rispettivo primitivo all'interno del metodo e ciò va bene per
//via della loro compatibilità
public static Integer add(int a, int b) {       
        return a + b;
    }
```

<center>
CLASSI IN JAVA
</center>


La classe in java è uno dei costrutti più importanti e fondamentali dell'intero programma, essa ci permette di definire le variabili che useremo e di anche definire funzioni, entrambe le cose potranna essere chiamate in qualsiasi punto del programma
Esempio della creazione di una classe:
```java
//Per creare una classe basta mettere il tipo class davnati a un nome e poi aggiungere
//le parentesi graffe per indicare il punto dove la classe esiste
class Cane {                              
    }
```
Essa è divisa principalmente in due parti:
CAMPI: Sono variabili particolari che vengono inizializzate e usate ,spesso, solo all'interno della classe stessa.
Metodi: sono le funzioni della classe, esse possono anche essere richiamate all'esterno della classe.

I Metodi di una Classe possono, attraverso l'uso di parole chiave, essere resi
visibili a tutti o resi visibili solo ad alcuni utenti.
Ciò ovviamente è un estremamente importante come funzionalità di un metodo perchè
così possiamo dare dei livelli di sicurezza al nostro codice.

Pubblic: è lo stato di base di un metodo e sta a significare che il metodo può essere visto da tutti senza determinati prerequisiti.
Esempio Public e Private:

Private: indica che il metodo è visibile soltanto all'interno della classe stessa
e non può essere visto da nessun altro al di fuori di quest ultima.

Esempio Public e Private:

```java
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
```

This:
Per poter gestire più semplicemente le variabili nelle classi si usa
la parola chiave this.
Questa parola chiave è così importante perchè in java ogni volta che inseriamo
il nome di una variabile è come se ne inzializzassimo una nuova variabile, quindi
per poterci riferire a una variabile già precedentemente inizializzata usiamo this.

In una classe una variabile può essere dichiarata e assegnata,ma nel metodo una
variabile puoò essere solo assegnata e inizializzata.

Esempio this.:
```java
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
```
<center>
CONSTRUCTORS
</center>

Sempre nell'argomento delle classi java abbiamo il constructor che è un metodo speciale usato per inizializzare gli oggetti.
Esempi:
```java
    class Cane{
        // Constructor
        //Qui inizializziamo l'oggetto
    public Cane(String name){
      //e qui gli diamo un valore           
        name = name;                    
        }        
    }
   ```
   Quando andiamo a inizializzare un oggetto con un constructor dobbiamo anche indicarne il tipo e sopratutto a quale classe appartiene


  <center>
FUNZIONI JAVA
</center>

<center>
FLOW CONTROL STAEMENTS
</center>
   I java flow statements sono delle particolari funzioni in java che cambiano o interrompono il flow del esecuzione del programma implementando al programma: decision making (if), Ciclizazione (for,do..while,while) e branching per poter eserguire particolari blocchi di codice in base alle condizioni al momento.


   IF:
   la funzione if è una delle funzioni più semplici e utili in java, ci permette di mettere una condizione per il funzionamento di funzioni a nostra scelta
   Esempio if:
   ```java
   //tra le tonde poniamo la condizione di if
   if (x > z) {
  //tra le graffe poniamo cosa deve succedere se la condizione è verificata        
       System.out.println("X is greater than Z");   
   }
   ```
   Esiste anche un altra funzione molto semplice e itile che va sempre in coppia con if, essa è la funzione else
   la funzione else ci permette di mettere un comportamento aggiuntivo alla nostra funzione if in caso la condizione non sia vera
   Esempio else:
   ```java
    if (x > z) {         
       System.out.println("X is greater than Z");   
   }
   else {
       x++;
   }
   ```
   come si può vedere aggiungiamo un nuovo comportamento in caso la condizione non viene rispettata, il modo più utile per usare ciò è in un ciclo dove poniamo il tutto in un ciclo che continua fino a quando la condizione di if non diventa vera

Es 1:
Consegna:
```java
class Gatto {
    String name;
    Integer age;
    Boolean alive;

    public Gatto(String name, Integer age, Boolean alive) {
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    // TODO costructor that accepts name and age with alive defaulting to true

    public String isAlive() {
        // TODO if dead say "I'm dead"
        // TODO if alive say "Im name, im age old"
        return "todo";
    }
}
```
Esercizio vero e proprio:
```java
//per prima cosa inizializiamo le variabili della nostra classe
class Gatto {               
    String name;      
    Integer age;
    Boolean alive;

    public Gatto(String name, Integer age, Boolean alive) {
        this.name = name;
      //poi inizializiamo gli oggetti relativi
        this.age = age;
      //a tali variabili        
        this.alive = alive;     
    }

    public Gatto(String name, Integer age) {
        this.name = name;
        this.age = age;
        this.alive = true;
    }
  //e in quest ultima parte vi è la funzione vera e propria della nostra classe
    public String isAlive() {
        if (alive) {                                            
            return "I'm name " + name + ". im " + age + " old";
        } else {
            return "I'm dead";
        }
        
    }
}
```
<center>
CICLI JAVA
</center>

Come abbiamo accennato nella funzione if in java esistono delle funzioni apposite per creare cicli; cos'è un ciclo? un ciclo è uno stato del programma java causato da particolari funzioni: While, Do....While,For.
Queste tre hanno un funzionamento simile , ma una struttura diversa, tutti e tre creano dei cicli,ma ognuno dei tre ha un modo diverso dagli altri due per creare suddetto ciclo.

CICLO While:
Il While è il più semplice delle tre funzioni a ciclo, come dice la parola stessa esso viene impostato per avere una condizione partente come vera che finchè non diventerà falsa continuerà il ciclo.
Esempio:
```java
int numero = 0;
while (numero < 0) {
    System.out.println("il loop continua");
    numero++;
}
``` 
Come possiamo vedere la condizione del ciclo viene controllata subito prima di
inziare il ciclo e continua fino a quando la condizione tra le parentesi non
viene resa falsa

CICLO Do....While: 
Il do...while è una funzione molto simile al while però con una differenza 
fondamentale, la condizione viene controllata ogni fine ciclo invece che all'inizio
di ogni ciclo.

Esempio:
```java
int numero = 0;
do{
    System.out.println("Il ciclo è qua ancora");
    numero++;
} while(numero < 5);
```
CICLO For:
Il for è il più "complesso" dei tre tipi di ciclo che queste funzioni offrono,
ma non tanto per come funziona dato che ha lo stesso esatto funzionamento del
while con una struttura diversa.
```java
for (inizializazione,Condizione di terminazione, incremento/decremento) {
    //statement di java
}
```
Come possiamo vedere java è diviso in tre parti principali,escludendo lo statement,
e ognuna di queste funziona allo stesso modo degli altri cicli; abbiamo un valore
iniziale (spesso di una variabile), una condizione di esistenza del ciclo che
continuerà a farlo andare fino a quando non diventa falsa e un incremento di
suddetta variabile per rendere prima o poi la condizione falsa.
Esempio for:
```java
for (int numero = 0, numero < 5, numero++) {
    System.out.println("il ciclo continua e siamo a "+numero);
}
```
La cosa interessante del for è che ci permette di usare la variabile di inzializzazione
direttamente nello statement senza troppi problemi.

CICLO For "each":Esiste una variazione particolare del for chiamata "for each".
Il for each è particolarmente utilizzato  per gli array, esso non ha una condizione
di funzionamento per il ciclo ma bensì esegue il ciclo per ogni singolo elemento
dell'array che quest ultimo sia nullo o meno.

Gli esempi più evidenti di un corretto uso dei cicli e dell'if è la creazione
di un programma che trova l'elemento più grande in un array e un programma che
inverte la posizione di elementi opposti di un array (1234 => 4321).


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


    


[Back to index page](readme.md)

[Back Home](../../readme.md)
