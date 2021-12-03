public class TestPuzzle {
    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();
        
        // TEST get10Rolls
        int[] roll10 = puzzle.getTenRolls();
        for (int i : roll10) {System.out.println(i);}

        // TEST getRandomLetter
        System.out.println(puzzle.getRandomLetter());

        // TEST generatePassword
        System.out.println(puzzle.generatePassword());

        // TEST getNewPasswordSet
        String[] passwordSet = puzzle.getNewPasswordSet(8);
        for (String i : passwordSet) {System.out.println(i);}

        // TEST shuffleArray * (uncomment getNewPasswordSet to run)
        puzzle.shuffleArray(passwordSet);
        for (String i : passwordSet) {System.out.println(i);}
    }
}