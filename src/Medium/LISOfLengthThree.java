package Medium;

public class LISOfLengthThree {
    public static void main(String[] args){
        int[] nums = {2,5,3,4,5};
        System.out.print(longestIncreasingSequence(nums));
    }

    private static boolean longestIncreasingSequence(int[] nums) {
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for(int num : nums){
            if(num <= min) min = num;
            else if(num < secondMin) secondMin = num;
            else if(num > secondMin) return true;
        }
        return false;
    }
}
