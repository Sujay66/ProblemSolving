package Easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubSequence {
	public static void main(String[] args){

		LongestIncreasingSubSequence demo = new LongestIncreasingSubSequence();
		Solution hello = demo.new Solution();
		int[] nums = {1,3,6,7,9,4,10,5,6};
		System.out.println(hello.findSubsequences(nums));
	}
	class Solution {
		public int findSubsequences(int[] nums) {
			if(nums.length == 0) return 0;
			int lis[] = new int[nums.length];

			for(int i=0;i<nums.length;i++){
				lis[i] = 1;
			}

			for(int i=1;i<nums.length;i++){
				for(int j=0;j<i;j++){
					if(nums[j]<nums[i]){
						lis[i] = Math.max(lis[i],lis[j]+1);
					}
				}
			}
			int max = lis[0];
			for(int i=1;i<lis.length;i++){
				if(max<lis[i]){
					max = lis[i];
				}
			}
			return max;
		}
	}
}
