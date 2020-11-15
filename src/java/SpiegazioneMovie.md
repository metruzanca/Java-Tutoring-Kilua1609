//http://comet.lehman.cuny.edu/owen/teaching/2014sp/cmp326/classesAndObjectsPractice.pdf
```java
//serve per dare alle funzioni opzioni aggiuntive per
//l'identificazione, in caso il rating abbia un nome
//diverso da "PG"
enum Rating {       
    PG,            
    PG13,           
    R
}

public class EsercizioMovie {

    public static void main(String[] args) {    //metodo per creare e stampare gli array   
        Movie[] movies = new Movie[] {         //dei film.
            new Movie("movie1", "studio1"),
            new Movie("movie2", "studio1"),
            new Movie("movie3", "studio2", Rating.R),
            new Movie("movie4", "studio2", Rating.R),
            new Movie("movie5", "studio3"),
        };
        Movie[] pg = Movie.getPG(movies);
        for (Movie m : pg) {
            if(m instanceof Movie){
                System.out.println(m.getTitle());
            } else {
                System.out.println(m);
            }
        }
    }
}

class Movie {
    private String title;

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    private String studio;
    private Rating rating;

    public Movie(String title, String studio, Rating rating) {  //constructor per le varibili
        this.title = title;                                     //title,studio e rating
        this.studio = studio;
        this.rating = rating;
    }

    public Movie (String title, String studio) {    //constructor per le stesse variabili,ma
        this.title = title;                         //rating è inzializzato con un valore fisso
        this.studio = studio;
        this.rating = Rating.PG;
    }

    public static Movie[] getPG(Movie[] movies){    //metodo che ha lo scopo con un for each
        Movie[] moviesPG = new Movie[movies.length];    //di identificare i film pg e di 
        int i = 0;                                  //inseririli in un nuovo array
        for(Movie m : movies) {
            if(m.rating == Rating.PG) {
                moviesPG[i] = m;
                i++;
            }
        }
        return moviesPG;
    }

}
```