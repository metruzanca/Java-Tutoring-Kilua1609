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
"pubblic": serve per indicare che questo metodo è visibile da tutti senza       esclusioni
"static": serve a indicare che le funzioni all'interno di questo metodo
        sono appartenenti solo alla classe del metodo e non possono essere usate altrove
"void": il tipo di dato che il nostro metodo da in ritorno e può essere utilizzato solo per ritorni
una cosa come ad esempio: "void v;" non è possibile da fare
"main": serve a indicare il nome del metodo che ci permetterà quindi di chiamare le funzioni al suo interno (può avere nomi diversi da main però avere un metodo chiamato main è obbligatorio)


```java
public static void log(String str) {     /*come si può vedere il metodo può avere diversi nomi*/        
  System.out.println(str);              /*Questa è la funzione più basica di java,una funziuone di stampa a schermo*/
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

                        TIPI DI DATO

Esistono varie tipi di dato utilizzabili in java però si dividono principalmente in tre categorie: Primitivi, Wrapper e Java Types.
I primitivi sono la tipologia di dato pressochè presente in ogni singolo linguaggio di programmazione, essi sono come come "int","char","string" ecc....; 


I wrapper sono l'equivalente in oggetto dei primitivi; Se i primitivi hanno pochissime opzioni per essere utilizzati i wrapper ne hanno MOOOOOOOOOOOOOLTE di più che quindi ci permettono una quantità di diversi utilizzi altissima, però non sono sempre convenienti da usare perchè ovviamente sono anche più pesanti e complicati da usare dei primitivi

I java type infine sono le tipologie di esclusivamente oggetto che sono esclusivi di java sono moltissimi tipi diversi.

i wrapper e i primitivi sono compatibili tra di loro
Esempio:
```java
public static Integer add(int a, int b) {       /*Come possiamo vedere abbiamo definiti il tipo del metodo come un wrapper ma abbiamo usato il rispettivo primitivo all'interno del metodo e ciò va bene per via della loro compatibilità*/
        return a + b;
    }

```
---------------------------------CLASSI IN JAVA---------------------------
La classe in java è uno dei costrutti più importanti e fondamentali dell'intero programma, essa ci permette di definire le variabili che useremo e di anche definire funzioni, entrambe le cose potranna essere chiamate in qualsiasi punto del programma
Esempio della creazione di una classe:
```java
class Cane {        /*Per creare una classe basta mettere il tipo class davnati a un nome e poi aggiungere le parentesi graffe per indicare il punto dove la classe esiste*/                      
    }
```
La classe in java è divisa principalmente in due parti:
CAMPI: Sono variabili particolari che vengono inizializzate e usate ,spesso, solo all'interno della classe stessa.
   // Constructor
    public Cane(String name){
        name = name;  
Es 1 zanca:
// TODO costructor that accepts name and age with alive defaulting to true

    /*public String isAlive(String name, Integer age, Boolean alive) {
        this.name = name;
        this.age = age;
        alive = true;

        if (alive = true)  {

            System.out.println("My name is "+name);                         
            System.out.println("i'm "+age);
            System.out.println("and i'm alive");
        }
        else {
            System.out.println("My name is "+name);
            System.out.println("and i'm dead");
        }
        
        return name;
    }*/

    
![](../assets/objects1.png)

[Back to index page](readme.md)

[Back Home](../../readme.md)
