package ExceptionHandlingPracitce;

public class ExceptionHandlingPrac {
    public void exhp(){
        try {
            int a = 1;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        }catch(ArithmeticException er){
            System.out.println("Cannot be divided by 0");

        }finally {
            System.out.println("It is executed");
        }


    }
}
