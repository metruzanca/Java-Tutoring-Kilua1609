//http://comet.lehman.cuny.edu/owen/teaching/2014sp/cmp326/classesAndObjectsPractice.pdf
```java
import java.util.Date;

public class EsercizioHoliday {
    public static void main(String[] args) {
        Holiday h1 = new Holiday("name", 1, "month"); //metodo per creare delle istanze della
        Holiday h2 = new Holiday("name", 1, "ubuii"); //nostra classe
        boolean r = h1.inSameMonth(h2);
        System.out.println(r);

        Holiday[] harr = new Holiday[] {
            new Holiday("name", 1, "month"),
            new Holiday("name", 10, "month"),
            new Holiday("name", 20, "month"),
        };

        double d = Holiday.avgDate(harr);
        System.out.println(d);

        double d1 = 0.2;
        double d2 = 0.1;
        System.out.println(d1 + d2);
    }
}

class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) { //constructor per le variabili
        this.name = name;                                //name, day e month
        this.day = day;
        this.month = month;
    }

    public Boolean inSameMonth(Holiday h) {     //metodo per comparare holdays e se hanno
        return h.month.equals(this.month);      //lo stesso meso ritornare un valore true
    }

    public static double avgDate(Holiday[] arrayDays) {    //metodo per fare la media delle date
        Integer sommaDate = 0;                             //delle vacanze
        for(int i = 0; i < arrayDays.length; i++) {
            sommaDate += arrayDays[i].day;
        }
        return (double)sommaDate / arrayDays.length;
    }
    
}```
