public class MainChallenge2 {
    public static void main(String[] args) {
        System.out.println(getDurationString(100)); //this is the first testcase
        System.out.println(getDurationString(7880)); // this is the second test case
        System.out.println(getDurationString(45, 134));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return ("Invalid input");
        }
        int minutes = seconds / 60;
        seconds = seconds % 60;
        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return ("Invalid input");
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return (hours + "h " + remainingMinutes + "m " + seconds + "s");

    }


}
