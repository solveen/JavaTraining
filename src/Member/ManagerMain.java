package Member;

public class ManagerMain {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.setName("Solveen");
        manager.setAge(11);
        manager.setPhoneNumber(981209121d);
        manager.setAddress("Kapan");

        System.out.println(manager.getName());
        System.out.println(manager.getAge());
        System.out.println(manager.getAddress());
        System.out.println(manager.getPhoneNumber());
    }

}
