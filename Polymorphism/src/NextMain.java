public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","Dhoom");
        movie.watchMovie();
        Adventure jaws = (Adventure) Movie.getMovie("A","Jaws");
        jaws.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchMovie();
        var theMovie = Movie.getMovie("C","Airplane");
        theMovie.watchMovie();

        Object unKnownObject = Movie.getMovie("S","Airplane");
        if(unKnownObject.getClass().getSimpleName().equals("Comedy")){
            Comedy c = (Comedy) unKnownObject;
            c.watchMovie();
        }else if(unKnownObject instanceof Adventure){
            ((Adventure) unKnownObject).watchMovie();
        }else if(unKnownObject instanceof  ScienceFiction sysfs ) {
            sysfs.watchMovie();
        }


    }
}
