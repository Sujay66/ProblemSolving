package Medium;

public class RotateMatrix {
    public static void main(String[] args){
        int[][] nums = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int s=0, e=nums.length-1;

        while(s < e){
            int[] temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++; e--;
        }

        int temp;
        for(int i=0 ; i<nums.length; i++) { /*For a rectangular matrix */
            for(int j=0 ; j<i ; j++) {
                 temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }

       for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }
}
