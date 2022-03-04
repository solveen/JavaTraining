package ArrayListHomePractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListHomePractice {
    public void arrayListHomePractice() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Mahesh");
        arrayList.add("Urmila");
        arrayList.add("Karan");
        arrayList.add("Raman");

        arrayList.remove(3);
        arrayList.remove("Karan");
        arrayList.set(1, "Suman");
//
//        Collections.sort(arrayList);
        Collections.sort(arrayList, Collections.reverseOrder());

        System.out.println(arrayList);

        for (String a : arrayList
        ) {
            System.out.println(a);
        }
    }
}
