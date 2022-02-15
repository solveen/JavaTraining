package ScannerPractice;

import java.util.Scanner;

public class ScannerPractice {
    public void SP(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scan.nextInt();
        System.out.println(" Enter a second number");
        int b = scan.nextInt();
        int c = a / b;
        System.out.println("The division of the number a by b is " + c);


    }
}
