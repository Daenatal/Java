public class TestSum {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        //Integer sum= 0; //this is object type not a primitive type
        int sum = 0; //now that we set the variable to primitive type let's see how much faster it goes.
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
        long end = System.currentTimeMillis();
        double total = (double) (end - start) / 1000;
        System.out.println("Time of execution: " + total + " seconds");
    }
}

//the first time it took us 8.827 seconds using Integer object class, but when we use the int primitive data type boom not
//even one second.