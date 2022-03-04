package HashMapPractice;

import java.util.Collections;
import java.util.HashMap;

public class HashMapPractice {

    public void hashMapPrac(){
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1,"Solveen");
        hashMap.put(2,"Bahadur");
        hashMap.put(3,"Gurung");


        hashMap.remove(1);

        System.out.println(hashMap);
    }
}
