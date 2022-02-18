package ExceptionHandlingPracitce;

public class ThrowPractice {
    static void TP(int a , int b){
        if (a == 12 || b == 7){
            throw new ArithmeticException("Not Connected");
        }
        else {
            System.out.println(" Connected ");
        }

    }
}
