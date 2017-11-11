package Easy;

public class MaximumSumSubArray {
		public static void main(String[] args){
			
			int nums[]= {-2,1,-3,4,-1,2,1,-5,4};
			
			System.out.println(maxSubArray(nums));
		}
		    public static int maxSubArray(int[] nums) {
		        
		    	int max = nums[0];
				int[] sum = new int[nums.length];
				sum[0] = nums[0];
		 
				for (int i = 1; i < nums.length; i++) {
					sum[i] = findMax(nums[i], sum[i - 1] + nums[i]);
					max = findMax(max, sum[i]);
				}
		 
				return max;
			}
		    
		    	    
		    static int findMax(int first,int second){
		      return  first>second? first:second;
		    }
		
		}

