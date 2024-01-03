public class Player {
    private String name;
    private int healthPercentage;
    private String weapon;

    public Player(String name){
        this(name,100,"Sword");
    }
    public Player(String name, int healthPercentage, String weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage <= 0 ? 0 : Math.min(healthPercentage, 100);
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
      healthPercentage = healthPercentage -damage;
      if(healthPercentage <= 0 ){
          System.out.println("Player knocked out of the game");
      }
  }

  public int healthRemaining(){
      return healthPercentage;
  }

  public void healthRestore(int extraHealth){
        healthPercentage += extraHealth;
        if(healthPercentage > 100){
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
  }
}
