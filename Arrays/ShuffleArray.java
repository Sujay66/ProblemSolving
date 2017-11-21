package Arrays;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
    public int[] orgNums,tempArray;
    public ShuffleArray(int[] nums) {
        orgNums = nums;
        tempArray = Arrays.copyOf(nums, nums.length);
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return orgNums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {

        Random random = new Random();
        for(int i=orgNums.length-1;i>=0;i--){
            
         int someNumer = random.nextInt(i+1);
         int temp = tempArray[someNumer];
         tempArray[someNumer] = tempArray[i];
         tempArray[i] = temp;
        }
        return tempArray;
    }
}
