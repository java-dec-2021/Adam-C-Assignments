import java.util.ArrayList;
public class TestBasicJava {
    public static void main(String[] args) {
        // Creeate an instance of BasicJava so we can call it's methods.
        BasicJava javaCode = new BasicJava();

        //javaCode.printNumbers();
        //javaCode.printOddNumbers();
        //int totalSum = javaCode.sumTo255();
        //System.out.println(totalSum);
        int[] intArray = new int[]{1,7,2,-5,10,23,28,-13,-7,0};
        //javaCode.printArrayValues(intArray);
        //javaCode.printMaxValue(intArray);
        ArrayList<Integer> oddNumbers255 = javaCode.createAnArray();
        //System.out.println(oddNumbers255);
    }
}