package Test;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JustForTesting {
    public static void main(String[] args) {

        final char[] buf = new char[32];
        for (int i = 31; i >= 0; i--) {
            buf[31 - i] = ((1 << i) & 1) == 0 ? '0' : '1';
        }
        String s = new String(buf);
        StringBuilder rev = new StringBuilder(s).reverse();

        System.out.println(rev);
        int sum = 0;
        for(int i=rev.length()-1,count = 0;i>=0;i--){
            if(rev.charAt(i) == '1'){
              double t = Math.pow(2,count);
              sum = (int) (sum + t);
            }
            count++;
        }

        System.out.print(sum);


   /*     int[] nums = {4,3,2,7,8,2,3,1};

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
        }*/
}
}
