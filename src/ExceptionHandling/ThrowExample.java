package ExceptionHandling;

public class ThrowExample {

    static void CalculateAge(int age, int weight)throws ArithmeticException {
        if(age < 12 && weight < 23){
        throw new ArithmeticException("Not Eligible");
        }else {
            System.out.println("Eligible");
        }
    }
}
