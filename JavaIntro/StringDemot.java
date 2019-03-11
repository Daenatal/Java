public class StringDemot {
    public static void main(String[] args) {
        String ninja = "Coding Dojo is Awesome and Fun!";
        int length = ninja.length();
        System.out.println( "String Length is:" + length );

        String string1 = "My name is ";
        String string2 = "Jesus";
        String string3 = string1.concat(string2);
        System.out.println(string3);

        String ninja2 = String.format("Hello %s, please choose your %.2f of handicap.", "Warrior", 30.0);
        System.out.println(ninja2);
    }
}