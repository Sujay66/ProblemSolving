package Medium;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
/*    public String largestNumber(int[] nums) {
        if(nums.length == 0) return "";
        if(nums.length == 1) return String.valueOf(nums[0]);

        String res = String.valueOf(nums[0]);
       // String temp = "";
        for(int i=1;i<nums.length;i++){
            res = appendStrings(res,String.valueOf(nums[i]));
        }
        return res;
    }

    private String appendStrings(String s1, String s2){
        int a = Integer.valueOf(s1+s2);
        int b = Integer.valueOf(s2+s1);


        return (a > b) ? String.valueOf(a) : String.valueOf(b);

    }*/

    public String largestNumber(int[] nums){
        if(nums.length == 0) return "";
        if(nums.length == 1) return String.valueOf(nums[0]);
        String[] strings = new String[nums.length];

        for(int i=0;i<nums.length;i++){
            strings[i] = String.valueOf(nums[i]);
        }

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1+o2;
                String s2 = o2+o1;
                return (s2).compareTo(s1);
            }
        };

        Arrays.sort(strings,stringComparator);

        if(strings[0].charAt(0) == '0') return "0";
        StringBuilder stringBuilder = new StringBuilder();
        for(String s: strings){
            stringBuilder.append(s);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args){
        LargestNumber largestNumber = new LargestNumber();
        int[] nums = {0,0000,0000,0,0};
        System.out.println(largestNumber.largestNumber(nums));
    }
}
