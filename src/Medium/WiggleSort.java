package Medium;

import java.util.Arrays;

public class WiggleSort {
    public static void main(String[] args){
        int[] nums = {3,5,2,1,6,4};
        Arrays.sort(nums);
        int[] temp = new int[nums.length];
        for(int i=nums.length-1,j=0;i>=0;i--,j++){
            temp[j] = nums[i];
        }
        swapInPlace(temp);
        nums = Arrays.copyOf(temp,temp.length);

        for(int i:nums){
            System.out.print(i);
        }

    }

    private static void swapInPlace(int[] nums) {
        for (int i = 1; i < nums.length; i = i + 2) {
            int temp = nums[i];
            nums[i] = nums[i - 1];
            nums[i - 1] = temp;
        }
    }
}
