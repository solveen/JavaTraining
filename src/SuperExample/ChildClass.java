package SuperExample;

public class ChildClass extends ParentClass {
    public String name = "World";
    public void display(){
//        System.out.println(super.name);
//        System.out.println(name);
        super.pc();
    }
    public void pc(){
        System.out.println("lllll");
    }
}
