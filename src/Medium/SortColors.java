package Medium;

public class SortColors {
    public static void main(String[] args){
        int[] nums = {2,0,2,1,1};
        int start = 0;
        int end = nums.length-1;
        int currentIndex = 0;

        while(currentIndex<=end){
            if(nums[currentIndex]==0){
                nums[currentIndex] = nums[start];
                nums[start] = 0;
                start++;
            }
             if(nums[currentIndex] == 2){
                nums[currentIndex] = nums[end];
                nums[end] = 2;
                end--;
                currentIndex--;
            }
            currentIndex++;
        }

        for(int i:nums){
            System.out.print(i);
        }
    }
}
