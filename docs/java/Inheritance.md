# Inheritance
Prima di definire l'eriditariabilità dobbiamo definire l'incapsulamento.
L'incapsulamento è la possibilità del linguaggio di programmazione ad
oggetti di accorpare metodi e proprietà all'interno di un unica area
(oggetto), che ci permetteà quindi di dividere il nostro programma in
tante piccole parti ognuna con diverse funzionalità.


L'inheritance è un meccanismo che ci consente di creare una nuova clase,
facendole ereditare i meotdi e i campi di un altra classe già esistente
e aggiungendo anche qualcosa di nuovo se ne abbiamo bisogno.

Il comportamento descritto ora è simile a quello dell'eridità genetica di un figlio con un proprio padre, infatti definiremo la classe originale già esistente da cui prendiamo i metodi e campi come "classe padre" e la classe che riceverà questi metodi come "classe figlio".

Ovviamente questo meccanismo ci permette un campo di opzioni di utilizzo vasto:

- potremmo usare la nuova classe per poter lavorare alle variabili di una esistente
 senza andare a modificare i campi originali

- potremmo usare la classe orginale come se fosee uno stampino per una serie
  di altre classe che useremo in seguito

- ecc...

Insomma possiamo solo immaginare le possibilità che abbiamo con questo metodo.

Esempio Inheritance:

```java
//classe di base counter
//prendiamo una classe "padre" con una serie di metodi e campi qualsiasi
 public class Counter {

 private int value;

 public Counter ( final int initialValue ) {
     this.value = initialValue;
 }

 public void increment () {
     this.value ++;
 }

 public int getValue () {
     return this.value;
 }
}

//classe figlia multicounter
//e prendiamo il vecchio codice della classe padre aggiungendo dei nuovi metodi 
public class MultiCounter {

 private int value ;

 public MultiCounter ( final int initialValue ) {
    this . value = initialValue ;
    }

 public void increment () {
    this . value ++;
    }

 public int getValue () {
    return this . value ;
    }

 /* Nuovo metodo */
 //questi nuovi metodo se programmati adeguatamente potranno essere eseguiti
 //tranquillamente senza andare ad intaccare la classe originale.
 //questo è uno dei metodi per poter scrivere il meccanismo dell'eriditarietà
 public void multiIncrement ( final int n) {
    for (int i = 0; i < n; i ++) {
        this . increment () ;
            }
        }
}

//riutilizzo counter

public class MultiCounter2 {

 private Counter counter ;

 public MultiCounter2 ( final int initialValue ) {
     //come possiamo osservare possiamo anche scrivere in questo modo per
     //riutilizzare i metodi della classe padre.
    this . counter = new Counter ( initialValue ) ;
        }

 public void increment () {
     //il this. ha principalmente l'utilizzo di indicatore che i metodi di questa
     //classe appartengono a questa classe.
    this . counter . increment () ;
        }

 public int getValue () {
    return this . counter . getValue () ;
        }

 /* Nuovo metodo */
 public void multiIncrement ( final int n) {
    for (int i = 0; i < n; i ++) {
        this . counter . increment () ;
        }
    }
 }
```

E' tipico nei progetti software di dover ripetere una serie di metodi o di
classi per tutto il progetto. Ciò può essere dovuto a comodità oppure anche
a efficenza, però per poter fare ciò è altamente sconsigliabile appoggiarsi
solamente al copia e incolla (Principipio "DON'T REPEAT YOURSELF" o DRY), dato
che potrebbe creare svariati errori dovuti alla duplicazione di errori
precedenti rendendo la manutenzione complicata e lunga.

Per ciò l'utilizzo dell'eredità è estremamente consigliato e spesso ciò
rende il nostro software più efficente.

## Sintassi di un Inheritance

Come quasi tutti questi tipi di meccanismi anche l'inheritance ha una sua
sintassi che ci permette di far capire al compilatore le nostre intenzioni.

Sintassi:
```java
class <classe "figlio"> extends <classe "padre">  {..}
```
Come si può vedere la sintassi è chiara e semplice, alla classe figlio aggiungiamo
il termine "extends" e poi la classe padre, ciò ci permette di dire al compilatore
che tutto ciò che scriveremo sarà un estensione della classe originale.
La classe figlio quindi erediterà tutti i metodi della classe padre compresi
i metodi private a cui però non potrà accedere, però potrà accedere tranquillamente
ai metodi protected essendo una sottoclasse della classe padre.

Esempio sintassi:

```java
//qui possiamo vedere la sintassi dell'inheritance
public class MultiCounter extends Counter {
    //grazie alla parola chiave extends possiamo direttamente scrivere
    //i metodi nuovi che vogliamo aggiungere come estensione della classe padre.
  public MultiCounter ( int initialValue ) {
      //super è un altro modo per indicare la classe padre che abbiamo scelto
        super ( initialValue ) ;
    }
  public void multiIncrement ( final int n) {
      for (int i = 0; i < n; i ++) {
          this . increment () ;
        }
    }
}
```
Gli unici svantaggi di usare l'eriditarietà è il fatto che ,primo non possiamo
riutilizzare dei costruttori che abbiamo già creato, ma dobbiamo obbligatoriamente
crearne dei nuovi, secondo l'eriditarietà può essere solo di una "generazione"
alla volta, cioè se abbiamo un classe "nonno", una classe padre e una classe figlio la
classe figlio non può ereditare dalla classe nonno , ma può solo dalla classe padre
e terzo non possiamo usare le funzioni private della classe padre perchè sono
limitate solo e soltanto a quella classe.


                                    OVERRIDE DEI METODI


Quando andiamo a usare il meccanismo dell'eriditarietà a volte abbiamo bisogno
di andare a modificare i metodi originali anche fino a stravolgerne completamente.
Questo meccanismo è detto "override" ed è realizzabile scrivendo nella nostra
sottoclasse uno (o più) metodi particolari detti : "metodi della superclasse".
Se necessario il metodo riscritto può invocare la versione del padre
usando il receiver speciale "super".

Linee guida che si possono seguire per l'eriditarietà:

- ogni classe dovràintrodurre alcuni campi, che si potranno aggiungere a quelli
  della superclasse per formare la struttura di un oggetto in memoria.
- la singola classe dovrà: 1)dovrà introdurre tutti i costruttori necessari
                           2)ogni suo costruttore dovrà preoccuparsi di
                             chiamare l'opportuno costruttore padre come
                             prima istruzione e dovranno inizializzare
                             propriamente i campi localmente definiti. 




Una parola chiave fondamentale nell'override dei metodi è la parola "super".
Super può essere utilizzato solo dalle sottoclassi e serve per fare riferimento
alla super classe (o classe padre).


TABELLA DEI METODI VIRTUALI

La tabella dei metodi virtuali è una struttura di appoggio creata da ogni compilatore
come struttura di supporto del pelomorfismo di un programma; essa contiene un 
elemento del tipo <nome della funzione, indirizzo di memoria> per ogni elemento
virtuale della classe, questo indirizzo di memoria corrisponde alla locazione
del blocco di istruzioni del metodo virtuale all'interno del segmento istruzioni
della memoria riservata.

IL MODIFICATORE FINAL

Con l'overriding e il richiamo a super andiamo a prendere classi già esistenti e a
modificarle per il funzionamento del nostro programma, però ciò crea delle grosse
falle di sicurezza specialmente legate al polimorfismo.

Qui entra in campo il modificatore final; esso può essere utilizzato per campi, metodi e
anche intere classi.

Un metodo final è un metodo che non può essere modificato in nessun modo per overriding
e un classe final non può essere estesa in nessun modo.

LA CLASSE OBJECT

Object è definita come la radice della gerarchia di eriditarietà di java.

Ciò significa che ogni singola classe creata in java anche se non è specificato
eredita (indirettamente) dalla classe object.

I metodi che vengono ereditati dalla classe object sono alcuni metodi di utilità
generale:
- toString(): stampa informazioni sulla classe e la posizione in memoria dell'oggetto
- clone(): clona un oggetto
- equals() e hashcode(): usati entrambi nelle collection
-notify() e wait() usati nella gestione dei thread
- e tanti altri ancora


LA DIFFERENZA TRA EXTENDS E @OVERRIDE

Esiste un grossa differenza tra i due ma entrambi vengono usati nell'inheritance.

EXTENDS: indica che una clase è estensione di un altra specifica classe già
esistente e che quindi eredita tutti i metodi della classe padre e aggiunge 
dei nuovi metodi che modificano il comportamento.

@Override: è un termine che ci permette di sovrascrivere un metodo con un altro
metodo dello stesso nome.

Esempio @Override e extend:

```java
//definiamo la classe main del nostro esempio
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

//definiamo la nostra classe padre
class Animal {
  String name;
  int age;
  int legs;
  public Animal(String name, int age, int legs){
    this.name = name;
    this.age = age;
    this.legs = legs;
  }
//subito nella classe padre abbiamo un esempio di override di uno dei metodi
//della classe main che abbiamo definito subito all'inizio
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
//Qui abbiamo un ottimo esempio di extend in cui prendiamo la nostra classe
//padre e senza dover ri inizilizzare tutti i metodi creiamo un estensione
//con metodi nuovi
class Doggo extends Animal{
  private String name;

  public Doggo(String name, int age, int legs){
    super("Doggo", age, 4);
    this.name = name;
  }
//come possiamo notare @overide e extend si possono combinare insieme per poter creare
//classi figlie più efficenti
  @Override
  public String toString() {
      return "Animal race: " + super.name + ", " + name;
  }

  @Override
  public void speak(){
    System.out.println("I am a cute fluffy doggo!");
  }
}
```

