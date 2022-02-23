package abstractExample;

public abstract class ParentClass {

    public abstract void display1();
    //Normal Method
    public void display(){
        System.out.println("This is parent Method: ");
    }
    //Constructor
    ParentClass(){
        System.out.println("This is constructor");
    }
    //static method
    public static void print(){
        System.out.println("Printing from Parent");
    }
    //Abstract method

}
