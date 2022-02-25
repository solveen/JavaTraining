package Member;

public class Member {
    private String Name;
    private int Age;
    private double PhoneNumber;
    private String Address;
    private double Salary = 90909d;

    public void printSalary(){
        System.out.println(Salary);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }
}
