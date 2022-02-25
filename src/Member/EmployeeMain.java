package Member;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Solveen");
        employee.setAge(11);
        employee.setPhoneNumber(981209121d);
        employee.setAddress("Kapan");
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getAddress());
        System.out.println(employee.getPhoneNumber());

    }
}
