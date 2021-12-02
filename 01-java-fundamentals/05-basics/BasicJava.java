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
        for (int i : arr) {
            System.out.println(i);
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


    // NINJA BONUS!
    // Get the average of a given array of ints
    public double getAverage(int[] arr) {
        double sum = 0.0;
        double avg = 0.0;
        for (int i=0;i<arr.length;i++) {
            sum += arr[i];
        }
        avg = (sum / arr.length);
        return avg;
    }

    // Get number of values in given int array that are greater than a given int
    public int countGreaterThanY(int[] arr, int y) {
        int count =0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i]>y) {
                count+=1;
            }
        }
        return count;
    }

    // Square each value within a given int array\
    public int[] squareValues(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            arr[i] = arr[i]*arr[i];
        }
        return arr;
    }

    // Eliminate all negative numbers in int array (replace them with 0)
    public int[] removeNegatives(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            if (arr[i]<0) {
                arr[i]=0;
            }
        }
        return arr;
    }


    // SENSEI BONUS!!
    // Return an array containing [max,min,avg] values from a given int array
    public Object[] grabArrayInfo(int[] arr) {
        Object[] arrayInfo = new Object[3];
        int max = arr[0];
        int min = arr[0];
        for (int i=0;i<arr.length;i++) {
            if (max<arr[i]) {
                max = arr[i];
            }
            else if (min>arr[i]) {
                min = arr[i];
            }
        }
        arrayInfo[0] = max;
        arrayInfo[1] = min;
        arrayInfo[2] = getAverage(arr);
        return arrayInfo;
    }

    // Shift the values in the array to the left.
    public int[] shiftValuesLeft(int[] arr) {
        for (int i=0;i<arr.length;i++) {
            if (i<arr.length-1) {
                arr[i] = arr[i+1];
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }
}