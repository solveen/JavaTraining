package MultidimensionalArray;

public class MultiArr {
    public void multiArray() {

        int[][] arr = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
