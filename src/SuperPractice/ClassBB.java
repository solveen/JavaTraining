package SuperPractice;

public class ClassBB extends ClassAA {
    public int b = 7;
    public ClassBB(){
        super();
        System.out.println("This is child class");
    }
    public void aa(){
        super.aa();
        System.out.println("This is child class variable " + b);
        System.out.println("This is Parent class variable " + super.a);
    }
}
