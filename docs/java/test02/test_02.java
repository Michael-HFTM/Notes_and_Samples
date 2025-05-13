package docs.java.test02;

import java.text.NumberFormat;
import java.util.Scanner;

public class test_02 {

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(test_02.class.getResourceAsStream("verkaufszahlen.txt"));
        
        // Header skippen
        scanner.nextLine();

        float gesamt = 0;

        // fixer Einlesebereich :(
        for (int i = 0 ;  i < 5 ; i++) {

            String land = scanner.next();
            int stk = scanner.nextInt();
            float preis = scanner.nextFloat();

            float total = stk * preis;
            gesamt = gesamt + total;

            System.out.print(land + ":");
            System.out.print(stk + " STk. à ");
            System.out.printf("%.2f CHF ergibt ",preis);
            System.out.printf( "%.2f CHF%n", total);
        }

        System.out.printf("SUM TOTAL: %.2f", gesamt );

        scanner.close();

    }
    
}
