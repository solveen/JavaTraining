package HashSetExample;

import java.util.HashSet;

public class HashSetExample {
    public void hashSetExample(){
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("Hello");
        hashSet.add(null);
        hashSet.add("Hello");
        hashSet.add("1");
        hashSet.size();


        hashSet.clear();
        System.out.println(hashSet);
    }
}
