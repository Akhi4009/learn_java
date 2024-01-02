public class Main {
    public static void main(String[] args){
       for ( int i = 1; i <= 5; i++){
           Student s = new Student("S923" + i,
                   switch (i){
               case 1 -> "Akhilesh";
               case 2 -> "RajKumar";
               case 3 -> "Retvik";
               case 4 -> "Suresh";
               case 5 -> "Harikesh";
                       default -> "Anonymous";
                   },
                   "05/11/1996", "Java Masterclass");

           System.out.println(s);
       }
    }
}
