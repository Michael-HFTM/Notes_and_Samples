package docs.java.cheatsheets.test02;

public class DecisionMaker {

    public void checkNumber(int number) {

        if (number < 0) {
            System.out.println("Negativ");
        } else if (number == 0) {
            System.out.println("Null");
        } else {
            System.out.println("Positiv");
        }

        switch (number) {
            case 1:
                System.out.println("Eins");
                break;
            case 2:
                System.out.println("Zwei");
                break;
            default:
                System.out.println("Andere Zahl");
        }
    }
}
