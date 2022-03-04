package ArryarListPrac;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrListPrac {
    public void arrayListP() {
        ArrayList<ArrayListPracticeClass> arrayLists = new ArrayList<>();
        arrayLists.add(new ArrayListPracticeClass(3, "How"));
        arrayLists.add(new ArrayListPracticeClass(1, "zello"));
        arrayLists.add(new ArrayListPracticeClass(2,  "World"));

//        Collections.sort(arrayLists);
//        System.out.println(arrayLists);
        ArrayListPracticeClass.NameCompare nameCompare = new ArrayListPracticeClass.NameCompare();
        Collections.sort(arrayLists, nameCompare);



        for (ArrayListPracticeClass a: arrayLists) {
            System.out.println(a);
        }
    }
}
