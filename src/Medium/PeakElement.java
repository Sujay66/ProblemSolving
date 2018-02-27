package Medium;

public class PeakElement {
    public static void main(String[] args){
        int[] nums = {1,4,2,3,5};
        int start = 0;
        int end = nums.length-1;
        System.out.print(peakSearch(nums,start,end));
        
    }

    private static int peakSearch(int[] nums,int start,int end) {
            while(start<end){
               int mid = (start+end)/2;
                int mid2 = mid+1;
                if(nums[mid]<nums[mid2]) start = mid2;
                else end = mid;
            }
            return start;
    }
}
