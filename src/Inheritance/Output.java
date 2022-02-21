package Inheritance;

public class Output {
    public static void main(String[] args) {
        InheritanceChild inheritanceChild = new InheritanceChild();
        System.out.println(inheritanceChild.name);
        System.out.println(inheritanceChild.subName);
        inheritanceChild.display();
        inheritanceChild.displayJava();

    }
}
