package Member;

public class Manager extends Member {
    private String Department;
    public Manager(){
        super.printSalary();
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
