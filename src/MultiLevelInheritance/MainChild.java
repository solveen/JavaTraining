package MultiLevelInheritance;

public class MainChild {
    public static void main(String[] args) {
        GrandChild grandChild = new GrandChild();
        System.out.println(grandChild.name);
        System.out.println(grandChild.nameThree);
        System.out.println(grandChild.nameTwo);

        grandChild.par();
        grandChild.parTwo();
        grandChild.parThree();
    }
}
