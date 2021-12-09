public class Tester {
    public static void main(String[] args) {
        // Wizard Test
        Wizard gandalf = new Wizard();
        Wizard harry = new Wizard();

        gandalf.heal(harry);
        // harry @ 58
        harry.displayHealth();
    
        harry.fireball(gandalf);
        // gandalf @ 26
        gandalf.displayHealth();

        // Ninja Test
        Ninja naruto = new Ninja();
        Ninja sasuke = new Ninja();

        sasuke.steal(naruto);
        sasuke.steal(naruto);
        sasuke.steal(naruto);
        // sasuke @ 130 & naruto @ 70 
        sasuke.runAway();
        // sasuke @ 120

        naruto.displayHealth();
        sasuke.displayHealth();

        // Samurai Test
        Samurai ichigo = new Samurai();
        Samurai ronin = new Samurai();
        Samurai jack = new Samurai();

        ichigo.deathBlow(ronin);
        // ichigo @ 100 & ronin @ 0
        jack.meditate();
        // jack @ 300

        ichigo.displayHealth();
        ronin.displayHealth();
        jack.displayHealth();

        System.out.println("Number of samurai is : " + Samurai.howMany());
    }
}
