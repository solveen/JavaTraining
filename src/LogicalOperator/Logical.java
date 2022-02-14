package LogicalOperator;

public class Logical {
    public void logical(){
        int a = 5;
        int b = 4;
        int c = a + b;

        if(a == b && b == a){
            //And operator &&
            System.out.println("They are equal:");
            }else if ( a > 10 || b < 5){
            System.out.println(" One of them is true");
        }
            else
                {
            System.out.println("Not Equal:");
        }
    }
}
