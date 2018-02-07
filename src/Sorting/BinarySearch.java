package Sorting;

public class BinarySearch {
    public static void main(String[] args){
        int[] nums = {1,10,15,17,20,22,30,50};
        System.out.println("Index of the desired element is "+bSearch(nums,50));
    }

    private static int bSearch(int[] nums, int i) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
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
