package Constructor;

public class ArgumentConstuctor {
    int id;
    String name;
    ArgumentConstuctor(int id, String name){
        //this refers to the current object
        //
        this.id = id;
        this.name = name;
    }
    public void display(){
        // \n : breaks the line
        System.out.println("Id is " + id +  '\n' + "Name is : " + name);

    }

}
