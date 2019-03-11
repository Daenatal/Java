public class BasicJavaMain{
    public static void main(String[] args) {
        BasicJava run = new BasicJava();
        //run.printNumbers();
        //run.printOdds();
        //run.printSum();

        int[] myArray = { -1, -10, 0, 2, 3, 4, 5, 1337};
        //run.arrayContents(myArray);
        int max = run.getMax(myArray);
        System.out.println(max);
        run.getAverage(myArray);
        int[] testArray= {2, 10, 3};
        run.getAverage(testArray);
    }
}