package StaticPractice;

public class StaticPracticeEx {
    int workId = 3;
    String name = "Suman";
    static String workplace = "Sakura";
    public StaticPracticeEx(int workId, String name){
        // It cannot access the static variable
        this.workId = workId;
        this.name = name;
        System.out.println(workId);
        System.out.println(name);

    }

    public static void StaticPractice(){
        // The static variable can only be updated with static method

        workplace = "Sakrai";
        System.out.println("This is updated static variable " + workplace);

    }
}
