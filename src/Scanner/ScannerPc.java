package Scanner;

import java.util.Scanner;

public class ScannerPc {
    public void spc(){
        //Scanner class takes input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();// Reads user input a
        System.out.println("Enter second number");
        int b = sc.nextInt();// Reads user input b
        int sum = a + b;// Sum of the user inputs
        System.out.println("Your number is "+ sum);

    }

}
