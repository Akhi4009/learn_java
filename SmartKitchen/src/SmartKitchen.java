public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private Refrigerator icebox;
    private DishWasher dishWasher;

    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        icebox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag,
                                boolean dishWasherFlag){

        brewMaster.setHasWorkToDo(coffeeFlag);
        icebox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }
    public void doKitchenWork(){
        brewMaster.brewCoffee();
        icebox.orderFood();
        dishWasher.doDishes();
    }
}

class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee(){
      if(hasWorkToDo){
          System.out.println("Brewing Coffee");
          hasWorkToDo = false;
      }
    }
}

class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if(hasWorkToDo){
            System.out.println("Ordering food");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("Washing dish");
            hasWorkToDo = false;
        }
    }
}
