package ArrayListExample;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
    public void arrayListPractice() {
        ArrayList<String> arrayList = new ArrayList<String>();

        System.out.println(arrayList);
        arrayList.add("Solveen");
        arrayList.add("Hello");
        arrayList.add("world");
        arrayList.add("Java");
        arrayList.add(4, "Char");
        //sort arranges in ascending order
        Collections.sort(arrayList);
        //reverse order arranges in descending order
        Collections.sort(arrayList, Collections.reverseOrder());
        //removes the list from the array can be done by specifying the index number or placing the exact string

        System.out.println("After removing from object ");
        System.out.println(arrayList.remove("Char"));
        System.out.println("After removing from index");
        System.out.println(arrayList.remove(0));
        //Updates the array list
        arrayList.set(1, "hola");

        System.out.println("After adding list in Array" + arrayList);

        for (String a : arrayList) {
            System.out.println(a);
        }

    }
}
