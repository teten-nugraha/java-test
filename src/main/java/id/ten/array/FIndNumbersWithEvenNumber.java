package id.ten.array;

public class FIndNumbersWithEvenNumber {

    public static void main(String[] args) {
        int[]arr = {555,901,482,1771};
        int evenCount = findNumbers(arr);
        System.out.println(evenCount);
    }

    public static int findNumbers(int[] nums) {
        int evenCount=0;

        for(int value: nums) {
            int lengthCount = String.valueOf(value).length();
            if(lengthCount % 2 == 0){
                evenCount++;
            }
        }

        return evenCount;
    }

}
