package HashMapExample;

import java.util.HashMap;

public class HashMapExample {

    public void hashMapEx(){
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
      //it can take integer and string at the same time.
        hashMap.put(1,"Java");
        hashMap.put(2,"Java");
        // it can be removed by key or string
        hashMap.remove(2);
        hashMap.remove(1, "Java");
        hashMap.put(3,null);

        System.out.println(hashMap);
    }
}
