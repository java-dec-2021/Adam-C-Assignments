class Mammal {
    private int energyLevel;

    public Mammal() {
        energyLevel = 100;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }
    public void setEnergyLevel(int num) {
        energyLevel = num;
    }

    public int displayEnergy() {
        System.out.println("Current energy level is : " + energyLevel);
        return energyLevel;
    }
}