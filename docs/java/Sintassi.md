Sintassi Java

# Dichiarazioni

>Dichiarare una classe:

```java 
public/private/protected class >nome della classe< {
    //>metodi e campi della classe<
}
```
Una classe in se viene definita con poche parole chiave:

public/private/protected : servono a indicare la visibilità di una classe però
                           raramente viene usato qualcosa al di fuori di public
                           o private.

class: indica il tipo di oggetto che stiamo dichiarando e ovviamente in questo caso
è il tipo classe.

nome della classe: il nome di una classe è molto importante non solo per
riconoscimento, ma anche perchè senza di esso non potremo richiamarala o eseguarla.
Questo perchè in java non facciamo l'esecuzione di un eseguibile, ma bensì lo facciamo
di una classe specifica.
Quella classe specifica di cui parliamo è la classe con all'interno il metodo main.

>abstract class

```java
public/protected/private abstract class >nome della classe< {
    //metodi e campi della classe
}
```

Una classe astratta non puo avere istanze, ma puo avere sottoclassi

>Creare un istanza di classe

```java
>classe< >nome della nuova istanza< = new >metodo<(>argomenti metodo<);
```

>Dichiarare metodi:

Esistono svariati modi per dichiarare i metodi e spesso essi sono diversi l'un
dall'altro.

Metodo main:
```java
public static void main(final String[] args) {

}
```
Esiste un solo metodo con una forma uguale identica (o quasi) ogni singola volta
che viene dichiarato: Il metodo "main".

Come dice il nome, questo è il metodo più importante del programma dato che è ciò
che ci permette di eseguerlo. La maggior parte delle volte però non viene usato
come un metodo qualsiasi e viene spesso usato per solo stampare i risultati.

public: stesso funzionamento delle classi.

static: serve a indicare che questo oggetto specifico a cui questa parola è
assegnata appartiene solo e soltanto alla classe in cui si trova e non alle
istanze di quest ultima.

void: serve ad indicare il tipo di ritorno del metodo è void.

main: è il nome del metodo main e ciò non deve mai cambiare per nessuna ragione.

final: questa keyword è l'unica parte del metodo main che possiamo considerare
"facoltativa", dato che il suo scopo è quello di porre che gli argomenti del main
non possono essere cambiati in nessun modo possibile.

String[]: indica il tipo di argomento che possiamo immetere nel main, in questo caso
un array di stringe (la maggior parte delle volte il tipo rimane sempre String[])

args: indica gli argomenti che verranno immessi in main.

Metodo generico:

```java
public/private/protected static/ >tipo di di dato di ritorno< >nome del metodo< (argomenti) {

} 
```

public/private/protected: same as above

static/ : same as above

tipo di dato di ritorno: al contrario del metodo main, il tipo di dato da ritornare
per poter completare il metodo può cambiare a seconda del tipo di argomenti.

nome del metodo: as above

argomenti: dati di imput al metodo che verrano elaborati dal metodo/metodi


Metodo costruttore:

```java
public/private/protected >stesso nome della classe< (>argomenti<) {

}
```

Il costruttore è un altra variazione particolare dei metodi generici.
L'unico uso che un costruttore ha è quello di inizializzare le variabili.
La più notabile particolarità dei costruttori è il fatto che non hanno un
tipo di ritorno, ma bensì il loro nome da ai costruttori sia il tipo di
ritorno che il suo nome.
Ultima particolarità è che il nome del costruttore è LO STESSO DELLA CLASSE,
ciò è molto importante perchè da il costruttore tutte le sue particolari
proprietà.

Metodo astratto:

```java
  public abstract void >nome del metodo<();
```

I metodi astratti non hanno un corpo perchè ciò gli viene dato dalla sottoclasse.
Se una classe ha un metodo astratto allora anche la classe deve essere messa astratta,ma
il viceversa non è necessario.

TLDR:

Metodo main:
```java
public static void main(final String[] args) {

}
```

Metodo costruttore:
```java
public/private/protected >stesso nome della classe< (>argomenti<) {

}
```

Metodo generico:
```java
public/private/protected static/ >tipo di di dato di ritorno< >nome del metodo< (argomenti) {

} 
```

Metodo astratto:

```java
  public abstract void >nome del metodo<();
```



Le classi e i metodi possono essere richiamati all'interno di altri metodi/classi.
Le classi possono essere richiamate all'interno di altri metodi, ma vengono usati 
come tipo per una loro nuova istanza.

Anche i metodi possono essere richiamati all'interno di altri metodi e classi
se hanno le giuste visibilità.

Esempi:
```java
//dichiariamo la classe publica smartphone.
public class Smartphone {
    //dichiariamo le sue variabili.
    public String brand;
    public String model;

    public int nCPU;
    public int ram;
    public int sdSize;

    public boolean hasGPS;
    public boolean has3G;
    public boolean hasNFC;
    //creiamo un metodo costruttore che inizializi le sue variabili.
    public Smartphone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    //creiamo un metodo main per poter far runnare il nostro programma.
    public static void main(final String[] args) {
        //qui come abbiamo detto prima usiamo la classe come tipo per creare
        //una sua nuova istanza.
        Smartphone htcOne = new Smartphone("HTC", "One", 1024);
        //qui vediamo come un metodo può essere richiamato su una nuova istanza
        //della nostra classe per poter elaborari gli argomenti forniti.
        //La particolarità è che non abbiamo bisogno di ridichiarare gli
        //argomenti all'interno del richiamo al metodo perchè il richiamo
        //all'istanza li fornisce già al metodo.
         htcOne.printStringRep();
    }
}
```

>Dichiarare le variabili

In java dichiarare le variabili è molto simile a C. Per prima cosa dobbiamo dichiarare
il tipo della variabile che ne possono essere vari, poi diamo un nome alla variabile
(importante che il nome ci permetta di capire al volo lo scopo e l'utilizzo della
variabile in questione) e infini usando l'uguale gli diamo una valore a nostra scelta
in relazione al tipo che abbiamo dichiarato.

Le variabili, come i metodi e le classi, possono essere richiamate per uso altrove
semplicemente usando il loro nome dove vogliamo utilizzarle. Gli usi più comuni di
richiami a varibile sono: argomenti di metodi e uso all'interno di metodi, ma non
sono gli unici.

Molto comunemente le variabili inzializzate nella classe all'esterno di metodi
hanno gli stessi nomi di variabili date negli argomenti dei metodi, ed è qui
che entrano in gioco i costruttori e il this. Questi due hanno il compito di 
inizializzare (costruttori) e specificare che le variabili delle classi hanno
lo stesso valore, ma sono variabili diverse da quelle degli argomenti (this).


