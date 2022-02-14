package ArithmeticOperator;

public class Arithmetic {
    public void add(){
        int a = 2;
        int b = 2;
        int sum =  a +  b;
        System.out.println("Sum of the numbers: " + sum);

    }
    public void sub(){
        int a = 5;
        int b = 7;
        int sub = a - b;
        System.out.println("Subtraction of the numbers: " + sub);
    }
    public void divide(){
        // In java divison the remainder is not shown.
        int a = 67;
        int b = 8;
        int div = a/b;
        System.out.println("Division of the numbers: " + div);
    }
    public void modulus(){
        //returns the remainder of the two numbers after division
        int a =  19;
        int b = 9;
        int mod =  a % b;
        System.out.println("Modulo of the numbers: " + mod);

    }
}
