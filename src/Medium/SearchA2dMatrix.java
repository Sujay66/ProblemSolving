package Medium;

public class SearchA2dMatrix {
    public static void main(String [] args){
        int[][] nums = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
   //     int m = 0,n = 0;
        int i = 0;
        int j = nums[0].length-1;
        int target = 5;
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
