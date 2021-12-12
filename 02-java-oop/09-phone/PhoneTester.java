public class PhoneTester {
    public static void main(String[] args) {
        Galaxy note20 = new Galaxy("Note 20", 82, "AT&T", "Bzzzz Bzzzz Bzzzz. Your Galaxy is ringing!");
        IPhone iPhone13 = new IPhone("13 Pro Max", 28, "Verizon", "Ring Ring. Pick up your iPhone!");

        note20.displayInfo();
        System.out.println(note20.ring());
        System.out.println(note20.unlock());

        iPhone13.displayInfo();
        System.out.println(iPhone13.ring());
        System.out.println(iPhone13.unlock());
    }
}
