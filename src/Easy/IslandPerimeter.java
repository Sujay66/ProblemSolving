package Easy;

import java.util.Scanner;

public class IslandPerimeter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int m = scanner.nextInt();
        System.out.println("Enter number of columns");
        int n = scanner.nextInt();
        int[][] nums = new int[m][n];
        int perimeter = 0;
        System.out.println("Enter the matrix in row to column order with 0 representing water and 1 representing an island");
        for(int i=0;i<m;i++){
            System.out.println("Enter "+(i+1)+" row elements");
            for(int j=0;j<n;j++){
                System.out.println("Enter "+(i+1)+" row "+(j+1)+" column  element");
                nums[i][j] = scanner.nextInt();
            }
        }

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(nums[i][j] == 1){
                    perimeter+=4;

                    if(i>0 && nums[i-1][j] == 1) perimeter-=2;
                    if(j>0 && nums[i][j-1] == 1) perimeter-=2;
                }
            }
        }

        System.out.println("Perimeter of the island:"+perimeter);
    }
}
