package StaticExample;

public class StaticEx {
    int rollNo;
    String name;
    //college name is common so one time memory allocation is sufficient
    static String collegeName = "Deerwalk";

    public StaticEx(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    public void display(){
        System.out.println("Roll is " + rollNo + '\n' +"Name is " + name + '\n' + "CollegeName is " + collegeName);
    }
    public static void changeName(){
        // only static method can change static variable
        // object is not needed to call static method
        collegeName = "DeerHold";
        System.out.println(collegeName);
    }

}
