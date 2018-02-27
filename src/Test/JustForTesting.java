package Test;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JustForTesting {
    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};

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


        for(int i:missingNumbers) {
            System.out.println(i);
        }
}
}
