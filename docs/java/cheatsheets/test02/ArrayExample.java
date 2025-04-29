package docs.java.cheatsheets.test02;

public class ArrayExample {

    public void showArray() {

        int[] numbers = { 10, 20, 30, 40, 50 };
        System.out.println("Array-Inhalte:");
        for (int number : numbers) {
            System.out.println(number);
        }
        
        // Zugriff auf ein Element
        System.out.println("Zweites Element: " + numbers[1]);
    }
}