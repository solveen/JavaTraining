package JavaBean;
// This is called java bean with non-argument constructor, getter and setter
public class Student {
    private int id = 1;
    private String name = "Solveen";

    public Student(){
        System.out.println("Hello");
        System.out.println(id);
        System.out.println(name);
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
