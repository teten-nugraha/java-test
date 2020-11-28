package id.ten.array;

public class Array1 {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;

        for (int i : nums) {
            if (i == 1 ) {
                current ++;
            }else{
                if(current > max) {
                    max = current;
                }
                if(max >= nums.length / 2) {
                    return max;
                }
                current = 0;
            }
        }
        return Math.max(max, current);
    }

    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1,1};
        int max = findMaxConsecutiveOnes(arr);
        System.out.println(max);
    }
}
