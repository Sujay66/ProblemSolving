package Medium;

import java.util.Arrays;
import java.util.Collections;

public class KthLargestElement {
    public static void main(String[] args){
        int[] nums = {2,6,1,3,5,9};
        int k=2;

        Arrays.sort(nums);
       System.out.print(nums[nums.length-k]);
    }
}
