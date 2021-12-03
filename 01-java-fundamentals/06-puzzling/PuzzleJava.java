import java.util.Random;

public class PuzzleJava {
    // Initialize randMachine to allow us to call methods from Random.
    Random randMachine = new Random();

    // Get an array of 10 random numbers b/w 1-20
    public int[] getTenRolls() {
        int[] rollValues = new int[10];
        for (int i = 0; i < 10; i++) {
            rollValues[i] = randMachine.nextInt(21);
        }
        return rollValues;
    }

    // Get a random letter of the alphabet
    public char getRandomLetter() {
        char[] alphabet = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        return alphabet[randMachine.nextInt(26)];
    }

    // Generate an 8 character password containing alphabet characters
    public String generatePassword() {
        char[] passwordChars = new char[8];
        for (int i=0;i<passwordChars.length;i++) {
            passwordChars[i] = getRandomLetter();
        }
        // Returns password chars after converting them to a string
        return new String(passwordChars);
    }

    // Get a password set by generating an array of passwords
    // There will be an input X that determines the number of passwords in the array
    public String[] getNewPasswordSet(int x) {
        String[] passwordSet = new String[x];
        for (int i=0;i<x;i++) {
            passwordSet[i] = generatePassword();
        }
        return passwordSet;
    }

    // SENSEI BONUS
    // Shuffle a given array by moving the values around to different indices
    public void shuffleArray(Object[] array) {
        Object placeholder = new Object();
        for (int i=0;i<array.length;i++) {
            int randNum = randMachine.nextInt(array.length);
            placeholder = array[randNum];
            array[randNum] = array[i];
            array[i] = placeholder;
        }
    }
}