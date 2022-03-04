package ArryarListPrac;

import java.util.Comparator;

public class ArrayListPracticeClass implements Comparable<ArrayListPracticeClass>{
    private int id;
    private String name;
    private String studentage;

    public ArrayListPracticeClass(int id , String name){
        this.id = id;
        this.name = name;
    }
    // This helps to get rid of hash value in array list and prints the actual thing

    @Override
    public String toString() {
        return "ArrayListPracticeClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //With the help of the compareTo method we can sort the elements by student id or name
    //we can only use one comparison from comparable

    //this method sorts by name
    @Override
//      public int compareTo(ArrayListPracticeClass compareid) {
//        if (!this.name.equalsIgnoreCase(compareid.name))
//            return this.name.compareTo(compareid.name);
//        return this.id - compareid.id;
//    }

    //this method sorts by id
    public int compareTo(ArrayListPracticeClass compareid) {
        //ascending order
//        return this.id - compareid.id;
        //descending order
        return compareid.id -this.id;
    }

    //This sorts the array by name using static class comparator
    static class NameCompare implements Comparator<ArrayListPracticeClass> {
        public int compare(ArrayListPracticeClass a1, ArrayListPracticeClass a2) {
            //ascending order
            return a1.name.compareTo(a2.name);
            //descending order
//            return a2.name.compareTo(a1.name);
        }

    }
}
