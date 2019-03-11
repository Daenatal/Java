public class Casting {
    public static void main(String[] args) {

        int i = 120;
        byte b = (byte) i; //explicit casting

        System.out.println(b);

        byte c = 15;
        int p = c; //implicit casting, from smaller to bigger no prob

        System.out.println(p);
    }
}