package HackerRank;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class StaticInitialziation {

    static int B;
    static int H;
    static boolean flag = true;
    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();

        if( B > 0  && H > 0){
            flag =true;

        }   else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }

    }
    public void si(){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }

}

