package docs.java.cheatsheets.test02;

public class Basics {
    public void demonstrateBasics() {

        int fortyTwo = 42;
        double decimalNumber = 3.14;
        boolean isTrue = true;
        char charLetter = 'J';
        String text = "123";

        // Casting
        int casted = (int) decimalNumber;
        System.out.println("Casted double to int: " + casted);
        
        // Parsing String to int
        int parsed = Integer.parseInt(text);
        System.out.println("Parsed string to int: " + parsed);
    }
}
