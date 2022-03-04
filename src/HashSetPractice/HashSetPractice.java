package HashSetPractice;

import java.util.HashSet;

public class HashSetPractice {
    public void hashSetPrac(){
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("Solveen");
        hashSet.add(null);

        System.out.println("The size of the set is " + hashSet.size());

        System.out.println(hashSet);
    }
}
