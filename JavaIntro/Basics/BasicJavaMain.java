import java.util.ArrayList;
import java.util.Collections;
public class BasicJavaMain{
    public static void main(String[] args) {
        BasicJava run = new BasicJava();
        run.printNumbers();
        run.printOdds();
        run.printSum();

        int[] myArray = { -1, -10, 0, 2, 3, 4, 5, 1337};
        run.arrayContents(myArray);
        int max = run.getMax(myArray);
        System.out.println(max);
        run.getAverage(myArray);
        int[] testArray= {2, 10, 3};
        run.getAverage(testArray);
        ArrayList<Integer> myArray2 = new ArrayList<Integer>();
        run.generateOdd(myArray2);
        ArrayList<Integer> myArray3 = new ArrayList<Integer>();
        Collections.addAll(myArray3, -3, 50, -9 , 20, 11, -18, 200, 2, 5, -19);
        System.out.println(myArray3);
        //run.filterArray(myArray3, 10);
        //run.squareArray(myArray3);
        run.onlyPositive(myArray3);
        System.out.println(myArray3);
        ArrayList<Integer> minMax = new ArrayList<Integer>();
        Collections.addAll(minMax, 1, 5, 10, -2);
        System.out.println(minMax);
        int[] b = run.getValues(minMax);
        System.out.println(b[0] + " This is the Maximum value of your dataset");
        System.out.println(b[1] + " This is the Minimum value of your dataset");
        System.out.println(b[2] + " This is the Average value of your dataset");
        run.shiftArray(minMax);
        System.out.println(minMax);
    }
}