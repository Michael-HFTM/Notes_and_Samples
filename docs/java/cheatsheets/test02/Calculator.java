package docs.java.cheatsheets.test02;

public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public void printSum(int a, int b) {
        System.out.println("Sum: " + add(a, b));
    }
}
