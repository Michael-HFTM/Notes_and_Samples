package docs.java.cheatsheets;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Pruefung01 {

    public static void main(String[] args) {

        JOptionPane.showConfirmDialog(null, "Message", "Title", 0);
        JOptionPane.showMessageDialog(null, "Message", "Title", 0);
        JOptionPane.showInputDialog(null ,"Message:", "Default");
        String[] choices = {"a","b","c"};
        JOptionPane.showInputDialog(null, "Message", "Title", 1, null, choices , "b" );
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Gib eine Zahl ein:")); 

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib XY ein:");
        String line = scanner.nextLine();
        String token = scanner.next();
        int num2 = scanner.nextInt();
        scanner.close();

        System.out.print("text");
        System.out.println("textAndNewLine");
        double total = 1.249;
        System.out.printf("Total is %.2f %n" , total);

        String a = "123456";
        System.out.println(a.length());

        if (a.equals("123456")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }




        // String message;
        // if ( isEven(number) ) {
        //     JOptionPane.showMessageDialog(null, number + " is even.");
        // } else {
        //     JOptionPane.showMessageDialog(null, number + " is uneven.", "This is the Title", 2, null);
        // }
        

        
        // System.out.println(isEven(number));



        

    }

    public static boolean isEven(int number) {
        boolean result =  number % 2 == 0;
        return result;
    }
	    
}