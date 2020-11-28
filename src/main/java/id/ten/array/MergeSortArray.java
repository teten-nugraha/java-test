package id.ten.array;

import java.lang.reflect.Array;
import java.util.*;

public class MergeSortArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int totalLength = m + n;
//        int[]temp = new int[totalLength];
//        for(int i=1; i <= m; i++) {
//            temp[i-1] = nums1[i-1];
//        }
//        for(int i=1; i <= n; i++) {
//            temp[(m-1)+i] = nums2[i-1];
//        }
//
//        Arrays.sort(temp);
//
//        nums1 = temp;
        for(int i=0; i < n; i++) {
            nums1[m+i] = nums2[i];
        }

        Arrays.sort(nums1);

        for(int v: nums1){
            System.out.println(v);
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m=3 ;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
