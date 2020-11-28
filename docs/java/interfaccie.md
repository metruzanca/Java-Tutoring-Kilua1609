Gui

Un oggetto interfaccia grafica composto da oggetti del tipo Button, TextField,
Label, etc....

Tpiche realizzazioni

Un oggetto A si compone esattamente di un oggetto di B, cioè la classe A avrà un campo
di tipo B e tale campo è sempre presente.

Un oggetto A si compone opzionalmente di un oggetto B: La classe A avrà un campo
di tipo B, però il suo contenuto potrebbe essere "null".

Un oggetto A si compone di un numero noto n di oggetti di B: La classe A avrà
n campi di tipo B, con n che è un numero piccolo.

Un oggetto A si compone di una moltitudine non nota di oggetti di B: La classe A
avrà un campo di tipo B[].

NOTAZIONE GRAFICA UML (Unified Modelling Language)

Uml è un linguaggio grafico Object Oriented per modellare software, facilita lo scambio
di documentazione, e il ragionamento su sistemi articolati e complessi.

Class Diagram

UML è diviso in diverse parti con diverse funzionalità e utilizzi.

Class diagram è un box rettangolare per classe, diviso in tre aree:

-1 nome della classe
-2 campi
-3 metodi (e costruttori)

Su campi e metodi si antepone il simbolo "-" se privati, "+" se pubblici,
si sottolineano se "static" e dei metodi si roportano solo le signature,
con sintassi: Nome: tipo_ritorno.

archi fra classi indicano relazioni speciali.

A seconda dello scopo per cui si usa il diagramma, non `e necessario riportare
tutte le informazioni, ad esempio spesso si omettono le propriet`a, le signature
complete, ed alcune relazioni

MOTIVAZIONI

motivazioni specifiche: Serve un meccanismo per separare esplicitamente, ossia in
dichiarazioni diverse, l'interfaccia della classe e la sua realizzazione. 
Questo consente di tenere separate fisicamente la parte di “contratto” con quella di
"implementazione" e consente di separare bene il progetto dall'implementazione.

Polimorfismo:

- Serve un meccanismo per poter fornire diverse possibili realizzazioni di un
 contratto.
- Tutte devono poter essere utilizzabili in modo omogeneo
- Nel caso di DomusController:

    I Avere un unico contratto per i “dispositivi”, e..
    II ..diverse classi che lo rispettano
    III DomusController gestir`a un unico array di “dispositivi”


                                        JAVA INTERFACES

Le interfaccie Java sono un nuovo tipo di dato dichiarabile, con un nome e include solo
un insieme di intestazioni di metodi. Esso viene compilato da javac come una classe, e
produce un .class .

Le interfaccie possono essere implementate dalle classi : 

"class "nome classe" implements I {"definizione di tutti i metodi in I"}

I si comporta come un normalissimo tipo di dato, ed è usabile per dichiarare
variabili, input/output di una funzione e come tipo di un campo.

Le operazioni consentite da I sono solo e soltanto le chiamate dei metodi definiti
dall'interfaccia.

Le interfaccie però non possono essere implementate in continuazione, ma hanno
delle terminate situazioni in cui poterle usare:

-Quando si ritiene utile separare contratto da implementazione.

-Quando si prevede la possibilità che varie classi possano voler implementare
 un medesimo contratto.

 Un contratto in java è un meccanismo nel quale si pone una precisa forma alle classi e ai metodi, forma che dovranno rispettare come priorità.

Quindi da tutto ciò possiamo dedurre che se vi è una qualsiasi implementazione di un
contratto da parte di un oggetto, allora quella è una buona occasione per poter
implementare un interfaccia, ciò ci permette anche di riutilizzare la funzionalità in
tutte le classi che presentato un contratto.



TIPI, SOTTOTIPI, SOSTITUIBILITA', POLIMORFISMO

Il tipo A e’ un sottotipo del tipo B se A puo’ fare tutto quello che puo’ fare B.

La definizione di sottotipo è applicabile anche alle interfaccie cioè: se la classe c
implementa un interfaccia I allora possiamo ogni istanza di C può essere passata dove
il pogramma si attende un elemento del tipo I.


Le interfaccie non possono contenere:
 - Campi istanza (o metodi non statici): i metodi non statici sono associati ad ogni
  singola istanza di una classe e perciò il loro contesto di esecuzione è relativo
  all'istanza stessa: possono accedere e modificare le variabili dell'istanza
  e modificarne lo stato.
 - Il corpo di un metodo istanza
 - un costruttore

Le interfaccie possono contenere:
 - campi e metodi statici (sconsigliato per il momento)
 - intestazioni di metodi

 IMPLEMENTAZIONE MULTIPLA

Data una classe C possiamo implementare più di una sola interfaccia alla volta, ma
ovviamente dobbiamo fornire un corpo per tutti i metodi di ogni interfaccia
implementata. Se alcuni metodi delle interfaccie sono comuni fortunatamente
basta solo implementarli una volta dato che sono equivalenti.

ESTENSIONE INTERFACCIE

Anche le interfaccie possono essere estese, ma soltanto da altre interfaccie.
Ovviamente se un interfaccia I estende altre tre interfaccie I1 I2 I3 allora
la classe C che implementa queste ultime dovrà fornire i corpi anche ai metodi
dell'interfaccia I che estende le altre tre.

