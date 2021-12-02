import java.util.ArrayList;
public class TestBasicJava {
    public static void main(String[] args) {
        // Creeate an instance of BasicJava so we can call it's methods.
        BasicJava javaCode = new BasicJava();

        //javaCode.printNumbers();
        //javaCode.printOddNumbers();
        // int totalSum = javaCode.sumTo255();
        // System.out.println(totalSum);
        int[] intArray = new int[]{1,7,2,-5,10,-8,22,-13,-7,5};
        //javaCode.printArrayValues(intArray);
        //javaCode.printMaxValue(intArray);
        ArrayList<Integer> oddNumbers255 = javaCode.createAnArray();
        //System.out.println(oddNumbers255);
        

        // NINJA BONUS
        
        //double average = javaCode.getAverage(intArray);
        //System.out.println(average);
        
        //int countGreaterThanY = javaCode.countGreaterThanY(intArray,7);
        //System.out.println(countGreaterThanY);
        
        //int[] squareArray = javaCode.squareValues(intArray);
        //javaCode.printArrayValues(squareArray);
        
        //int[] arrNoNeg = javaCode.removeNegatives(intArray);
        //javaCode.printArrayValues(arrNoNeg);
        
        // Object[] arrayMaxMinAvg = javaCode.grabArrayInfo(intArray);
        // for (Object x : arrayMaxMinAvg) {
        //     System.out.println(x);
        // }

        // int[] arrayShiftedLeft = javaCode.shiftValuesLeft(intArray);
        // javaCode.printArrayValues(arrayShiftedLeft);
        }
}