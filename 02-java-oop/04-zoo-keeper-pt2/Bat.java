public class Bat extends Mammal {
    public Bat() {
        setEnergyLevel(300);
    }
    public void fly() {
        System.out.println("The bat took off and is flying!");
        setEnergyLevel(this.getEnergyLevel()-50);
    }
    public void eatHumans() {
        System.out.println("Ewww it ate a human! Gross!!");
        setEnergyLevel(this.getEnergyLevel()+25);
    }
    public void attackTown() {
        System.out.println("Ahhhh!! The bat is attacking the town!");
        setEnergyLevel(this.getEnergyLevel()-100);
    }
}