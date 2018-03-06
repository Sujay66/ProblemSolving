package Sorting;

public class BinarySearch {
    public static void main(String[] args){
        int[] nums = {5, 7, 7, 8, 8, 8,8,8,8, 10};
        System.out.println("Index of the desired element is "+bSearch(nums,8));
    }

    private static int bSearch(int[] nums, int i) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end-1)/2;
            if(i == nums[mid]) return mid;
            if(i<nums[mid]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }
}
