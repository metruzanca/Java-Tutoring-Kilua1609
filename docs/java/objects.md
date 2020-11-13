# JAVA PER IDIOTI

Per prima cosa im java per iniziare il programma dobbiamo dichiarare le classi del programma.

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
"pubblic": serve per indicare che questo metodo è visibile da tutti senza esclusioni.

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


La classe in java è uno dei costrutti più importanti e fondamentali dell'intero
programma, essa ci permette di definire le variabili che useremo e di anche definire
funzioni, entrambe le cose potranna essere chiamate in qualsiasi punto del programma.

Esempio della creazione di una classe:
```java
//Per creare una classe basta mettere il tipo class davnati a un nome e poi aggiungere
//le parentesi graffe per indicare il punto dove la classe esiste
class Cane {                              
    }
```
Essa è divisa principalmente in due parti:

CAMPI: Sono variabili particolari che vengono inizializzate e usate ,spesso, solo all'interno della classe stessa.

METODI: sono le funzioni della classe, esse possono anche essere richiamate all'esterno della classe.

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

Sempre nell'argomento delle classi java abbiamo il constructor che è un metodo
speciale usato per inizializzare gli oggetti.
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
   Quando andiamo a inizializzare un oggetto con un constructor dobbiamo anche
  indicarne il tipo e sopratutto a quale classe appartiene.







    


[Back to index page](readme.md)

[Back Home](../../readme.md)
