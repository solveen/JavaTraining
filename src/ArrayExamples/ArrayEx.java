package ArrayExamples;

public class ArrayEx {

    public void array(){
        //declaring the length of array
        int[] a = new int[5];

        int[] b = {0,1,2,3};

        //assign the value by index numbers
        a[0] = 0;
        a[1] = 1;
        a[2] = 2;
        a[3] = 3;
        a[4] = 4;

        System.out.println("This is third array" + a[3]);
        System.out.println("This is second value in array" + b[2]);
    }
}
