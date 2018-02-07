package Easy;

public class Example {
		public static void main(String[] args){
			int nums[] = {1,3,6,8};
			int target = 9;
			System.out.println(findTarget(nums,target));
			
		}

public static int findTarget(int nums[],int target){
			int pos = 0;
			if(nums.length == 0){
			System.out.println(0);
			}
			if(nums.length == 1){
				if(nums[0]> target){
					return 0;
				}else{
					return 1;
				}
			}
			for(pos = 0; pos<nums.length;pos++){
				if(nums[pos]>=target){
					return pos;
				}
			}
			return pos;
		}

}