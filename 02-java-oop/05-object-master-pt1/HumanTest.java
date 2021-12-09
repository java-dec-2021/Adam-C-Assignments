public class HumanTest {
    public static void main(String[] args) {
        Human adam = new Human();
        Human sauron = new Human();

        adam.attack(sauron);

        System.out.println(sauron.getHealth());
    }
}
