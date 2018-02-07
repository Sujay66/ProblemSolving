package Sorting;

public class SelectionSort {
    public static void main(String[] args){
        int[] nums = {10,7};
        selectionSort(nums);
        for(int j:nums){
            System.out.println(j);
        }
    }

    private static void selectionSort(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            swapPositions(nums,minIndex,i);
        }
    }
    private static void swapPositions(int[] nums,int num, int num1) {
        int temp = nums[num];
        nums[num] = nums[num1];
        nums[num1] = temp;
    }
}
