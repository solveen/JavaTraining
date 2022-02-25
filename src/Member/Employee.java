package Member;

public class Employee extends Member {
    private String specializtion;

    public Employee(){
        super.printSalary();
    }

    public String getSpecializtion() {
        return specializtion;
    }

    public void setSpecializtion(String specializtion) {
        this.specializtion = specializtion;
    }
}
