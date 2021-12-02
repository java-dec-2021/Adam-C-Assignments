import java.util.ArrayList;
public class BasicJava {

    // Print the numbers 1-255
    public void printNumbers() {
        for (int i=1;i<=255;i++) {
            System.out.println(i);
        }
    }

    // Print just the odd numbers 1-255
    public void printOddNumbers() {
        for (int i=1;i<=255;i++) {
            if (i%2!=0) {
                System.out.println(i);
            }
        }
    }

    // Return the sum of all numbers to 255 (Sum should come out to 32640)
    public int sumTo255() {
        int sum = 0;
        for (int i=1;i<=255;i++) {
            sum = sum + i;
        }
        return sum;
    }

    // Iterate over a given array & print each value to screen
    public void printArrayValues(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    // Find the maximum value in a given array
    public void printMaxValue(int[] arr) {
        int max = arr[0];
        for (int i=0;i<arr.length;i++) {
            if (arr[i]>max) {max = arr[i];
            }
        }
        System.out.println(max);
    }

    // Method that creates an array "y" containing all odd numbers from 1-255
    public ArrayList<Integer> createAnArray() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i=1;i<=255;i++) {
            if (i%2!=0) {
                numbers.add(i);
            }
        }
        return numbers;
    }
}