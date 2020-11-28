package id.ten.array;

public class DuplicateZero {
    public static void main(String[] args) {
        int[]arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        if(arr == null || arr.length == 0) return;
        int length = arr.length;
        for(int i=0; i < length; i++) {
            if(arr[i] == 0) {
                for(int j = length -1; j > i ; j--) {
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }

        for(int v: arr) {
            System.out.println(v);
        }
    }
}
