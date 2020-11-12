//http://comet.lehman.cuny.edu/owen/teaching/2014sp/cmp326/classesAndObjectsPractice.pdf
enum Rating {
    PG,
    PG13,
    R
}

public class EsercizioMovie {

    public static void main(String[] args) {   
        Movie[] movies = new Movie[] {
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

    public Movie(String title, String studio, Rating rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie (String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = Rating.PG;
    }

    public static Movie[] getPG(Movie[] movies){
        Movie[] moviesPG = new Movie[movies.length];
        int i = 0;
        for(Movie m : movies) {
            if(m.rating == Rating.PG) {
                moviesPG[i] = m;
                i++;
            }
        }
        return moviesPG;
    }

}