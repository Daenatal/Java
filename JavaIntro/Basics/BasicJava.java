public class BasicJava {
    public void printNumbers() {
        for(int i = 1; i<256; i++) {
            System.out.println(i);
        }
    }
    public void printOdds() {
        for(int i = 1; i<256; i++) {
            if((i % 2) != 0) {
                System.out.println(i);
            }
        }
    }
    public void printSum() {
        int counter = 0;
        for(int i = 1; i<256; i++) {
            counter += i;
            System.out.println("New number: "+ i + " Sum: " + counter);
            
        }
    }
    public void arrayContents(int[] targetArray) {
        for(int i = 0; i < targetArray.length; i++) {
            System.out.println(targetArray[i]);
        }
    }
    public int getMax(int[] targetArray) {
        int max = 0;
        for(int i = 0; i < targetArray.length; i++) {
            if(i == 0) {
                max = targetArray[i];
            } else{
                if(max < targetArray[i]){
                    max = targetArray[i];
                }
            }
        }
        return max;
    }
    public void getAverage(int[] targetArray) {
        int sum = 0;
        for(int i = 0; i < targetArray.length; i++) {
            sum += targetArray[i];
        }
        int average = sum / targetArray.length;
        System.out.println(average);
    }
}