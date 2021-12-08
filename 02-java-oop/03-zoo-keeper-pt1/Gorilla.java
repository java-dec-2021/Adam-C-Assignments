class Gorilla extends Mammal {
    public void throwSomething() {
        System.out.println("The gorilla threw something! How rude!");
        setEnergyLevel(this.getEnergyLevel()-5);
    }
    public void eatBananas() {
        System.out.println("The gorilla ate a banana. Yum!");
        setEnergyLevel(this.getEnergyLevel()+10);
    }
    public void climb() {
        System.out.println("The gorilla climbed a tree! How athletic!!");
        setEnergyLevel(this.getEnergyLevel()-10);
    }
}