package ArithmeticOperator;

import AccessModifier.AccessModifier;

public class ArithmeticMain {
    public static void main(String[] args) {
        Arithmetic ao = new Arithmetic();
        ao.add();
        ao.sub();
        ao.divide();
        ao.modulus();
        AccessModifier accessModifier = new AccessModifier();
        System.out.println("This is public variable from another package" + accessModifier.x);

    }

}
