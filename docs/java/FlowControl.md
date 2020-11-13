<center>
FLOW CONTROL STAEMENTS
</center>
   I java flow statements sono delle particolari funzioni in java che cambiano o interrompono il flow del esecuzione del programma implementando al programma: decision making (if), Ciclizazione (for,do..while,while) e branching per poter eserguire particolari blocchi di codice in base alle condizioni al momento.

   FUNZIONE IF: pone una condizione di cui è necessaria la conferma per poter
   eseguire il resto della funzione. 
   
   L'esempio più vicino e rappresentativo della
   funzione è un filtro, che appunto pone delle condizioni da rispettare per poter
   proseguire nella funzione.
   
   Esempio if:
   ```java
   //tra le tonde poniamo la condizione di if
   if (x > z) {
  //tra le graffe poniamo cosa deve succedere se la condizione è verificata        
       System.out.println("X is greater than Z");   
   }
```

Per poter incrementare le possbilità della funzione if esiste una complementare
chiamata "else". Essa viene posta immediatamente dopo l'if e pone una funzione
alternativa in caso la condizione di if non viene rispettata.

Esempio else:
   ```java
    if (x > z) {         
       System.out.println("X is greater than Z");   
   }
   else {
       x++;
   }
   ```
<center>
Esercizzi IF
</center>
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

Nei linguaggi di programmazione esistono delle funzioni apposite per creare cicli;
 cos'è un ciclo? un ciclo è uno stato del programma causato da particolari funzioni:
  While, Do....While,For.Tutte e tre creano dei cicli ,ma in modi e funzionamenti diversi dagli altri due.


CICLO While:
Il While pone una condizione che finchè non è resa falsa continuerà il ciclo. Tale condizione viene controllata prima di ogni iterazione del ciclo.

Esempio While:
```java
int numero = 0;
while (numero < 5) {
    System.out.println("il loop continua");
    numero++;
}
``` 

CICLO Do....While: 
Il do...while ha lo stesso esatto funzionamento del while,ma la condizione è controllata dopo ogni iterazione del ciclo.

Esempio:
```java
int numero = 0;
do{
    System.out.println("Il ciclo è qua ancora");
    numero++;
} while(numero < 5);
```

CICLO For:
Il for è più "complesso" degli altri cicli. Un funzionamento estremamente comodo
del for è il fatto che possiamo inizializzare la variabile per la condizione di
iterazione del for direttamente dentro al for, senza dover scrivere funzioni
esterne per poterla dichiarare.

for (inizializazione,Condizione di terminazione, incremento/decremento) {
    //statement di java//
}


Esempio for:
```java
for (int numero = 0, numero < 5, numero++) {
    System.out.println("il ciclo continua e siamo a "+numero);
}
```

CICLO For "each":Esiste una variazione particolare del for chiamata "for each".
E' appositamente creata per gli array con una struttura apositamente creata.

for(variabile condizione : array da ciclare) {
    //statement con la variabile//
}

Il for each non ha una condizione espressa in funzione, perchè esso cicla
ogni singolo elemento dell'array fino alla fine.