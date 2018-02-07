package Easy;
import java.util.Scanner;

public class MergeSortedArrays {
		public static void main(String[] args){
			int[] nums1 = new int[100];
			int[] nums2 = new int[100];
			System.out.println("Enter size of first array");
			Scanner sc = new Scanner(System.in);
			int m = sc.nextInt();
		    System.out.println("Enter the " + m + " numbers now.");
		        for (int i = 0 ; i < m; i++ ) {
		           nums1[i] = sc.nextInt();
		        }
			System.out.println("Enter size of second array");
			int n = sc.nextInt();
			 System.out.println("Enter the " + m + " numbers now.");
		        for (int i = 0 ; i < n; i++ ) {
		           nums2[i] = sc.nextInt();
		        }
			
			int k = m;
			int l = n;
			while(m>0 && n>0){
				if(nums1[m-1]>nums2[n-1]){
					nums1[m+n-1] = nums1[m-1];
					m--;
				}else{
					nums1[m+n-1] = nums2[n-1];
					n--;
				}
			}
			
			while(n>0){
				nums1[m+n-1] = nums2[n-1];
				n--;
			}
			
			for(int j=0;j<k+l;j++){
				System.out.println(nums1[j]);
			}
			
		}
}
