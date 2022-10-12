package Arrays.odevler;

import java.util.Arrays;

public class soru2 {
    public static void main(String[] args) {
        int[][] matrixArray = new int[3][2];
        int[] tempArray = new int[6];

        int n = 0;
        for(int i = 0; i <= matrixArray.length - 1; i++)
            for (int j = 0; j <= matrixArray[i].length - 1; j++) {
                matrixArray[i][j] = (int) (Math.random() * 10) + 1;
                tempArray[n] = matrixArray[i][j];
                n++;
            }

        int sum = 0;
        for(int[] a : matrixArray)
            for(int b : a) {
                System.out.println(b);
                sum += b;
            }

        System.out.println("sum of all numbers: "+sum);

        Arrays.sort(tempArray);
        System.out.println("smallest number of the matrix: "+tempArray[0]);
        System.out.println("largest number of the matrix: "+tempArray[5]);

    }
}
