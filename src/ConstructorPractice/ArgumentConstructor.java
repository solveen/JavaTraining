package ConstructorPractice;

public class ArgumentConstructor {
    int a = 5;
    String b = "Hello";
    static String c= "Hola";
    public ArgumentConstructor(int a, String b){
        // whatever the value of the variables it is updated when passed through constructor
        this.a = a;
        this.b = b;
    }
    public void AcMethod() {
        System.out.println("This is method " + a + '\n' + b);
    }
}
