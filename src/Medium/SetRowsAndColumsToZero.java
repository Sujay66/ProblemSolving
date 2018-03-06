package Medium;

public class SetRowsAndColumsToZero {
    public static void main(String[] args){
        int[][] nums = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(nums);

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.print(nums[i][j]);
            }
            System.out.println();
        }
    }

    private static void setZeroes(int[][] matrix) {
        boolean fr = false,fc = false;
        int col0 = 1, rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                if (matrix[i][j] == 0) {
                    if(i==0) fr = true;
                    if(j==0) fc = true;
                    matrix[i][0] = matrix[0][j] = 0;
                }
        }

        for (int i = 1; i <matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
        }
        if(fr) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }
        if(fc) {
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
