package id.ten.array;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int[]arr = {-4,-1,0,1,2};
        int[]coba = sortedSquares(arr);
        for(int i:coba) {
            System.out.println(i);
        }
    }

    public static int[] sortedSquares(int[] A) {
        int length = A.length;
        int[]a = new int[length];
        for(int i=0; i < length; i++) {
            a[i] = A[i] * A[i];
        }
        Arrays.sort(a);
        return  a;
    }
}
