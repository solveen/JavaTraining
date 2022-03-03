package ArrayExamplesPractice;

public class ArrayPractice {

    public void arrayPrac() {
        int[] a = {4, 5, 6, 77};
        int[] b = new int[5];

        b[0] = 1;
        b[1] = 7;
        b[2] = 8;
        b[3] = 78;
        b[4] = 6;


        for (int i = 0; i < b.length; i++) {

            System.out.println(i + " This is array " + b[i]);
        }
        for (int ar : a) {
            System.out.println("This is array " + ar);
        }
    }

    public void stringArrayPrac() {

        String[] strings = new String[4];
        String[] sttr = {"This", "is", "String", "array", "initialization"};

        strings[0] = "This";
        strings[1] = "is";
        strings[2] = "string";
        strings[3] = "length";

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        for (String a : sttr) {
            System.out.println(a);
        }
    }

    //Multidimensional Array

    public void multiDimensional() {

        String[][] strrrr = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(strrrr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
