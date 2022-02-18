package ExceptionHandling;

public class TryExample {
    public void divide(){
        try {
            int a = 5;
            int b = 0;
            int c = a / b;
            // This is unchecked exception.
            System.out.println("value is: " + c);
        }
        // Multiple catch block can be placed
        catch (ArithmeticException e){
//            e.printStackTrace();
            System.out.println("Number cannot be divided by zero");
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }finally {
            System.out.println("It is executed: ");
        }

    }
}
