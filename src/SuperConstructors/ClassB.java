package SuperConstructors;

public class ClassB extends ClassA {
    public int b;
    public ClassB(int b){
        super(3);
        this.b = b;
    }
    public void cb(){
        System.out.println("This is Parent Constructor " + a);
        System.out.println("This is Child Constructor " + b);
    }
}
