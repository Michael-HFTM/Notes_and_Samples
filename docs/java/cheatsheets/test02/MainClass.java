package docs.java.cheatsheets.test02;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

        Basics basics = new Basics();
        basics.demonstrateBasics();

        Calculator calculator = new Calculator();

        // Scanner scanner = new Scanner(System.in);
        // scanner.nextLine(); Delimiter ist ein Leerzeichen

        // int wert = JOptionPane.showInputDialog("Gib einen Wert ein");

        calculator.printSum(5, 7);
        System.out.println("Überladene Methode: " + calculator.add(3.5, 2.1));

        RandomMath rm = new RandomMath();
        rm.demonstrateRandomAndMath();

        DecisionMaker dm = new DecisionMaker();
        dm.checkNumber(2);

        LoopExamples loops = new LoopExamples();
        loops.showLoops();

        DateTimeExample dte = new DateTimeExample();
        dte.showDateTime();

        ArrayExample array = new ArrayExample();
        array.showArray();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());

        for (Animal animal : animals) {
            animal.makeSound();
            animal.sleep();
        }
    }
}
