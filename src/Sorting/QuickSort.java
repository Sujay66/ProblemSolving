package Sorting;

public class QuickSort {
    public static void main(String[] args){
        int[] nums = {5,4,3,2,1};
        quickSort(nums,0,nums.length-1);
        for(int j:nums){
            System.out.println(j);
        }
    }

    private static void quickSort(int[] nums,int start,int end) {
        if (start < end) {
            int pIndex = partitionArray(nums,start,end);
            quickSort(nums,start,pIndex-1);
            quickSort(nums,pIndex+1,end);
        }
    }

    private static int partitionArray(int[] nums, int start, int end) {
        int pivot = nums[end];
        int pIndex = start;
        for(int i = start;i<end;i++){
            if(nums[i]<pivot){
               swapPositions(nums,i,pIndex);
                pIndex++;
            }
        }
        swapPositions(nums,pIndex,end);
        return pIndex;
    }

   private static void swapPositions(int[] nums,int num, int num1) {
        int temp = nums[num];
        nums[num] = nums[num1];
        nums[num1] = temp;
    }

}
