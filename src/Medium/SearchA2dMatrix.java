package Medium;

public class SearchA2dMatrix {
    public static void main(String [] args){
        int[][] nums = {{}};
   //     int m = 0,n = 0;
        int i = 0;
        int j = nums[0].length-1;
        int target = 14;
        boolean found = false;
        while(i<nums.length && j>=0){
            if(target == nums[i][j]){
                found = true;
                break;
            }
            if(target<nums[i][j]){
                j--;
            }else{
                i++;
            }
        }
        System.out.print(found);
    }
}
