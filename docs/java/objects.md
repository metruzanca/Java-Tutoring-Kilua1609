void è solo un tipo per il ritorno e non è per variabili
una cosa come ad esempio: "void v;" non è possibile da fare

```java
public static void log(String str) {
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
i wrapper e i primitivi sono compatibili tra di loro
Esempio:
```java
public static Integer add(int a, int b) {
        return a + b;
    }
```
Creando classsi
```java
class Cane {
    String name;

    // Constructor
    public Cane(String name){
        name = name;                  
    }
```
![](../assets/objects1.png)