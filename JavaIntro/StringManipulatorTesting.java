public class StringManipulatorTesting {
    public static void main(String[] args) {
        StringManipulator phrase = new StringManipulator();
        String phrasenew = phrase.trimAndConcat("   Hello      ", "      World     ");
        System.out.println(phrasenew);

        char letter = 'o';
        Integer a = phrase.getIndexOrNull("Coding", letter);
        Integer b = phrase.getIndexOrNull("Hello World", letter);
        Integer c = phrase.getIndexOrNull("Hi", letter);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer alpha = phrase.getIndexOrNull(word, subString);
        Integer beta = phrase.getIndexOrNull(word, notSubString);

        System.out.println(alpha);
        System.out.println(beta);

        String word2= phrase.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word2);
    }
}