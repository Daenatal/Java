public class FizzBuzzTester {
    public static void main(String[] args) {
        FizzBuzz number = new FizzBuzz();
        String answer = number.fizzBuzz(15);
        String answer1 = number.fizzBuzz(5);
        String answer2 = number.fizzBuzz(3);
        String answer3 = number.fizzBuzz(4);
        System.out.println(answer);
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
    }
}