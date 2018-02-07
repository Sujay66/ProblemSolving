package Sorting;

public class BubbleSort {
    public static void main(String[] args){
        int[] nums = {10,7,15,27,5,3,6};
        bubbleSort(nums);
        for(int j:nums){
            System.out.println(j);
        }
    }

    private static void bubbleSort(int[] nums) {
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<nums.length-i;j++){
                if(nums[j]>nums[j+1]){
                    swapPositions(nums,j,j+1);
                }
            }
        }
    }
    private static void swapPositions(int[] nums,int num, int num1) {
        int temp = nums[num];
        nums[num] = nums[num1];
        nums[num1] = temp;
    }
}
