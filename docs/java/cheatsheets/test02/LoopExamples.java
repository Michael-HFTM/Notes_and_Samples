package docs.java.cheatsheets.test02;

public class LoopExamples {

    public void showLoops() {

        System.out.println("For-Schleife:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("While-Schleife:");
        int j = 0;
        while (j < 3) {
            System.out.println("j = " + j);
            j++;
        }
        
        System.out.println("Do-While-Schleife:");
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 2);
    }
}