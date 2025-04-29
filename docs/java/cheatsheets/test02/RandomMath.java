package docs.java.cheatsheets.test02;

import java.util.Random;

public class RandomMath {

    public void demonstrateRandomAndMath() {

        Random rand = new Random();

        int randomInt = rand.nextInt(100); // 0–99
        
        double squareRoot = Math.sqrt(randomInt);
        double power = Math.pow(2, 3);

        System.out.println("Random number: " + randomInt);
        System.out.println("Square root: " + squareRoot);
        System.out.println("2^3 = " + power);
    }
}
