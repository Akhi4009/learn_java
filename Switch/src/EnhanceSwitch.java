public class EnhanceSwitch {
    public static void main(String[] args) {
        int switchValue = 4;
        switch (switchValue) {
          case 1 -> System.out.println("value was 1");
          case 2 -> System.out.println("value was 2");
          case 3, 4, 5 -> {
              System.out.println("was a 3, a 4, or a 5");
              System.out.println("Actually it was a " + switchValue);
          }
            default -> System.out.println("value was not found");
        }
        getQuarter("DECEMBER");
    }
    public static void   getQuarter(String month){
      switch (month){
          case "JANUARY", "FEBRUARY", "MARCH" -> System.out.println("First Quarter");
          case "APRIL", "MAY", "JUNE" -> System.out.println("Second Quarter");
          case "JULY", "AUGUST", "SEPTEMBER" -> System.out.println("Third Quarter");
          case "OCTOBER", "NOVEMBER", "DECEMBER" -> System.out.println("Fourth Quarter");
          default -> System.out.println("Wrong input");
      }
    }
}
