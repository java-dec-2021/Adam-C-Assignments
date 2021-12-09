public class Ninja extends Human {
    // Constructor sets the default ninja attributes
    public Ninja() {
        this.setStealth(10);
    }
    public void steal(Human target) {
        target.setHealth(target.getHealth()-this.getStealth());
        this.setHealth(this.getHealth()+this.getStealth());
    }
    public void runAway() {
        this.setHealth(this.getHealth()-10);
    }
}