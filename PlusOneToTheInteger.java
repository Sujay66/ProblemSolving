import java.util.Arrays;

public class PlusOneToTheInteger {
		public static void main(String[] args){
			
			int nums[] = {'1','0'};
			
			int[] temp = addOne(nums);
		//	System.out.println(temp[1]);
			
			System.out.println(Arrays.toString(temp));
			/*for(int m=0;m<temp.length;m++){
				System.out.println(temp[m]);
			}*/
			
		}

		private static int[] addOne(int[] nums) {
			// TODO Auto-generated method stub
			String num = "";
			
			
/*			System.out.println(nums[0] - 48);
			
			System.out.println(Integer.toString(nums[0]));
			System.out.println(String.valueOf(nums[1]));*/
			
			
			for(int i=0;i<nums.length;i++){
				num = num + String.valueOf(nums[i]-48);
			//	System.out.println(nums[i]);
			}
			
			int addedNumber = Integer.valueOf(num) + 1;
			System.out.println(addedNumber);
			num = String.valueOf(addedNumber);
			
			
			int newNumbers[] = new int[num.length()] ;
		
			for(int j=0;j<num.length();j++){				
				newNumbers[j] = num.charAt(j);
				newNumbers[j] = newNumbers[j]-48;
			}
			
			
			return newNumbers;
		}
}
