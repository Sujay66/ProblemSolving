import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubSequence {
	public static void main(String[] args){
		
	}
	class Solution {
	    public List<List<Integer>> findSubsequences(int[] nums) {
	        List<Integer> temp = new ArrayList<Integer>();
	        List<List<Integer>> result = new ArrayList<List<Integer>>();
	        int lis[] = new int[nums.length];
	        
	        for(int i=0;i<nums.length;i++){
	            lis[i] = 1;
	        }
	        
	        for(int k=1;k<=nums.length;k++){
	            for(int j=0;j<k;j++){
	                if(nums[k]>=nums[j]){
	                    lis[k] = Math.max(lis[k],lis[j]+1);
	                }
	            }
	        }
	        
	        return result;
	        
	    }
	}
}
