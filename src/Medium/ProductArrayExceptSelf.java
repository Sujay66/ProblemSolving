package Medium;

public class ProductArrayExceptSelf {
	public static void main(String[] args){
		int arr[] = {1,2,3,4};
		int left[] = new int[arr.length];
		int right[] = new int[arr.length];
		int count[] = new int[arr.length];
		int i = 1;
		left[0] = 1;
		right[arr.length-1] = 1;
		for(i=1;i<arr.length;i++){
			left[i] = arr[i-1] * left[i-1];
		}
		
		for(i=arr.length-2;i>=0;i--){
			right[i] = arr[i+1] * right[i+1];
		}
		
		for(i=0;i<arr.length;i++){
			count[i] = left[i] * right[i];
		}
		
		for(i=0;i<count.length;i++){
			System.out.println(count[i]);
		}
		
		
	}
}
