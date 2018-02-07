package Easy;
import java.util.Arrays;

public class PlusOneToTheInteger {
		public static void main(String[] args){
			
			int nums[] = {9,9,8,9};
			
			int[] temp = addOne(nums);
			System.out.println(Arrays.toString(temp));

			
		}

		private static int[] addOne(int[] digits) {
			for(int i=digits.length-1;i>=0;i--){
				if(digits[i] < 9){
					digits[i]++;
					return digits;
				}else{
					digits[i] = 0;
				}
			}
				
				int [] retarr = new int[digits.length+1];
				retarr[0] = 1;
				return retarr;
			
}
}
