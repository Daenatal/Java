import java.util.ArrayList;
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
    public void generateOdd(ArrayList<Integer> y) {
        for(int i = 1; i < 256; i++) {
            if( (i % 2) != 0) {
                y.add(i);
            }
        }
        for(int i = 0; i < y.size(); i++) {
            System.out.println(y.get(i));
        }
    }
    public void filterArray(ArrayList<Integer> x, int y) {
        for(int i = 0; i <x.size(); i++) {
            if (x.get(i) < y) {
                x.remove(i);
            }
        } //problem here is that for every iteration the size gets smaller after a removal
        // a possible soluion would be to create a new array instead of just removing the old one.
        for(int i = 0; i <x.size(); i++) {
            if (x.get(i) < y) {
                x.remove(i);
            }
        }
    }
    public void squareArray(ArrayList<Integer> x) {
        for(int i = 0; i< x.size(); i++) {
            int y = x.get(i) * x.get(i);
            x.set(i , y);
        }
    }
    public void onlyPositive(ArrayList<Integer> x) {
        for(int i= 0; i< x.size(); i++) {
            if (x.get(i) < 0) {
                x.set(i , 0);
            }
        }
    }
    public int[] getValues(ArrayList<Integer> x) {
        int[] minmaxavg = { 0, 0, 0};
        int min = 0;
        int max = 0;
        int avg = 0;
        for(int i = 0; i< x.size(); i++) {
            if( i == 0) {
                min = x.get(i);
                max = x.get(i);
                avg += x.get(i);
            } else { 
            if (x.get(i) < min) {
                min = x.get(i);
            } 
            if (x.get(i) > max) {
                max = x.get(i);
            }
                avg += x.get(i);
            }
        }
        minmaxavg[0] = max;
        minmaxavg[1] = min;
        minmaxavg[2] = avg/x.size();
        return minmaxavg;
    }
    public void shiftArray(ArrayList<Integer> x) {
        for(int i = 0; i< x.size(); i++) {
            if(i == (x.size() - 1)) {
                x.set(i, 0);
            } else {
                int temp = x.get(i+1);
                x.set(i, temp);
            }
        }
    }
}