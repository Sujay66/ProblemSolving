package Sorting;

public class InsertionSort {
    public static void main(String[] args){
        int[] nums = {7,4,5,2,6,3};
        int[] sortedNums =  insertionSort(nums);
        for(int j:sortedNums){
            System.out.println(j);
        }
    }

    private static int[] insertionSort(int[] nums) {
        int value = 0,hole = 0;
        for(int i=1;i<nums.length;i++){
             value = nums[i];
             hole = i;
             while(hole>0 && nums[hole-1] > value){
                    nums[hole] = nums[hole-1];
                    hole = hole - 1;
             }
            nums[hole] = value;
        }
        return nums;
    }
}
