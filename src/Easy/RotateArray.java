package Easy;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args){
        int[] nums = {1,2};
        int k = 1;
     //   int n = nums.length;

        int[] temp = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            temp[(i+k)%nums.length] = nums[i];
        }

        nums = Arrays.copyOf(temp,temp.length);

        for(int i: nums){
            System.out.print(i);
        }
    }
}
