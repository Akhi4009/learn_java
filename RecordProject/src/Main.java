public class Main {
    public static void main(String[] args){
//       for ( int i = 1; i <= 5; i++){
//           LPAStudent s = new LPAStudent("S923" + i,
//                   switch (i){
//               case 1 -> "Akhilesh";
//               case 2 -> "RajKumar";
//               case 3 -> "Retvik";
//               case 4 -> "Suresh";
//               case 5 -> "Harikesh";
//                       default -> "Anonymous";
//                   },
//                   "05/11/1996", "Java Masterclass");
//
//           System.out.println(s);
//       }
       Student pojoStudent = new Student("S98675", "Akhilesh",
               "31/05/1996", "MERN Masterclass");
       LPAStudent recordStudent = new LPAStudent("S98764", "Akhilesh",
               "31/05/1996", "JAVA Masterclass");

       System.out.println(pojoStudent);
       System.out.println(recordStudent);

       System.out.println(pojoStudent.getName() + " is taking " +
               pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());
    }
}
