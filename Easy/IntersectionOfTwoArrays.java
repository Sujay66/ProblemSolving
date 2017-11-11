package Easy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {
	public static void main(String[] args){
		
		int[] text = {2};
		int[] pattern = {2,2};
		
		int [] arr = intersection(text,pattern);
		for(int j=0;j<arr.length;j++){
			System.out.println(arr[j]);
		}
	}
	public static int[] intersection(int[] s,int[] t){	  
		HashMap<Integer,Integer> myMap = new HashMap<Integer,Integer>();
		List<Integer> myList = new ArrayList<Integer>();
		for(int i: s){
			if(myMap.containsKey(i)){
				myMap.put(i, myMap.get(i)+1);
			}else{
				myMap.put(i, 1);
			}
		}
		for(int i:t){
			if(myMap.containsKey(i)){
				if(myMap.get(i)>1){
					myMap.put(i, myMap.get(i)-1);
				}else{
					myMap.remove(i);
				}	
				myList.add(i);
			}
		}
		int[] ret = new int[myList.size()];
		for(int j=0;j<myList.size();j++){
			ret[j]=myList.get(j);
		}
		return ret;
	}
}
