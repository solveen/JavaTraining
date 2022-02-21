package HackerRank;

import java.util.Scanner;

public class qQueries{
        public void qQ(){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                for (int j = 0; j < n; j++)
                {
                    a += b * Math.pow(2, j);
                    System.out.print(a + " ");
                }
            }
            in.close();

        }
    }

