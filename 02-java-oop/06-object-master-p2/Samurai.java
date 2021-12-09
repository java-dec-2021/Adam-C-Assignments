public class Samurai extends Human {
    private static int numberOfSamurai = 0;
    
    public static int howMany() {
        return numberOfSamurai;
    }

    // Constructor sets default Samurai attributes
    public Samurai() {
        this.setHealth(200);
        numberOfSamurai++;
    }
    public void deathBlow(Human target) {
        target.setHealth(0);
        this.setHealth(this.getHealth()/2);
    }
    public void meditate() {
        this.setHealth(this.getHealth()*3/2);
    }
}