public class Main {
    public static void main(String[] args){
        int i =0;
        while (i < 5 ){
            i++;
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }

       i=1;
        boolean isReady = false;

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

    }
}
