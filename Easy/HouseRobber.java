package Easy;

public class HouseRobber {
	public static void main(String[] args){
		int[] nums = {5,1,1,5};
		
		if(nums==null||nums.length==0)
	        System.out.println(0);
	 
	    if(nums.length==1)
	        System.out.println(nums[0]);
	 
	    int[] dp = new int[nums.length];
	    dp[0]=nums[0];
	    dp[1]=Math.max(nums[0], nums[1]);
	 
	    for(int i=2; i<nums.length; i++){
	        dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
	    }
	 
	    System.out.println(dp[nums.length-1]);
	}
}
