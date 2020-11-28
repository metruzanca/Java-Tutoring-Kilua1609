Dipendenza
Si dice che una classe A dipende da una classe B se all’interno del codice di
A si menziona la classe B (ad esempio come input di un metodo) o qualche
sua proprietà. La dipendenza è tanto più profonda quanto più in A si
usano anche costruttori e/o campi e/o metodi definiti in B.

Implicazione
Ogni dipendenza vincola fortemente la possibilit`a di fare modifiche, perchè
ne comporta altre da fare in cascata. Se A dipende da B e modifico B,
dovrò probabilmente modificare anche A.

Se questi due fattori non vengono rispettati si può incorrere in un fenomeno chiamato
"Sindrome dell Intoccabilità", dove se vi sono troppe dipendenze tra due o più classi
allora la quantità di modifiche a cascata che dovremo fare per integrare anche un
singolo cambiamento saranno troppe e troppo costose, rendendo il programma impossibile da
modificare d'ora in poi.

Contratto
Il contratto di un oggetto corrisponde ai suoi scenari di utilizzo,
e quindi alle aspettative che un cliente ha quando usa l’oggetto.
Grazie all’incapsulamento, è possibile vincolare fortemente questi
contratti, controllando meglio il comportamento degli oggetti.

Oggetti Immutabili

Gli oggetti immutabili sono una particolare variante di oggetti che, come dice il nome,
hanno un valore inziale nei propri campi che non può essere modificato da nessun metodo.
Codesti oggetti portano indipendeze sempre maggiori nel codice, ma non sono sempre le soluzioni migliori e più performanti.

Per costruire un oggetto immutabile dobbiamo porre tutti i campi di una classe come
privati che contengono a loro volta valori primitivi o oggetti immutabili; questi campi
privati sono anche definiti come "Stato".
