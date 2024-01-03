public class Main {
    public static void main(String[] args){
        Movie theMovie = new Adventure("Star Wars");
        theMovie.watchMovie();
        Movie theMovieC = new Comedy("Bhool bhulaiya");
        theMovieC.watchMovie();

        Movie theMovieS = new ScienceFiction("Newton");
        theMovieS.watchMovie();
    }
}
