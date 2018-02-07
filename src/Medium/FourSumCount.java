package Medium;

import java.util.HashMap;
import java.util.Map;

public class FourSumCount {
	public static void main(String[] args){
		 int[] A = { -1, -1};
		 int[] B = {-1,1};
		 int[] C = {-1, 1};
		 int[] D ={ 1, -1};
		 
		 System.out.println(findFourSum(A,B,C,D));
	}
	
	public static int findFourSum(int[] A,int[] B,int[] C,int[] D){
		
		HashMap<Integer,Integer> myMap = new HashMap<Integer,Integer>();
		int count = 0;
		
		for(int i=0;i<A.length;i++){
			for(int j=0;j<B.length;j++){
				int sum = A[i]+B[j];
				if(myMap.containsKey(sum)){
					myMap.put(sum, myMap.get(sum)+1);
				}else{
					myMap.put(sum, 1);
				}
			}
		}
		
		for(int i=0;i<C.length;i++){
			for(int j=0;j<D.length;j++){
				int sum = -1 * (C[i]+D[j]);
				if(myMap.containsKey(sum)){
					count = count + myMap.get(sum);
				}
			}
		}
		return count;
	}
}
