package Easy;

import java.util.ArrayList;
import java.util.List;

public class FindMissingNumbers {
    public static void main(String[] args){
        int[] nums = {1,3,4,2,1};
        List<Integer> missingNumbers = new ArrayList<Integer>();

        for(int i:nums){
            int x = Math.abs(i)-1;
            nums[x] = -(Math.abs(nums[x]));
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                missingNumbers.add(i+1);
            }
        }
        for(int i:missingNumbers){
            System.out.println(i);
        }
    }
}
