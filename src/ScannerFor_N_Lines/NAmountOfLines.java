package ScannerFor_N_Lines;

import java.util.Scanner;

public class NAmountOfLines {
    public void nLines(){

                Scanner sc = new Scanner(System.in);
                int i = 1;
                while (sc.hasNextLine()){
                    System.out.println(i++ + " " + sc.nextLine());
                }
                sc.close();
            }
        }


