package Medium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KMostFrequentElements {
	public static void main(String[] args){
		
		int [] arr = {1,1,1,1,2,2,2,3};
		Map<Integer,Integer> myMap = new HashMap <Integer,Integer>();
		for(int j: arr){
			myMap.put(j, 0);
		}
		for(int i: arr){
			if(myMap.containsKey(i)){
				myMap.put(i,myMap.get(i)+1);
			}else{
				myMap.put(i, 1);
			}
		}
	int max = Collections.max(myMap.values());
	List<Integer> myList = new ArrayList<Integer>();
	
	for(int m: myMap.keySet()){
		if(myMap.get(m) == max){
			myList.add(m);
			myMap.remove(m);
			break;
		}
	}
	max = Collections.max(myMap.values());
	for(int m: myMap.keySet()){
		if(myMap.get(m) == max){
			myList.add(m);
			myMap.remove(m);
			break;
		}
	}
	System.out.println(myList.get(0)+","+myList.get(1));
	}
}
