package Medium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class KMostFrequentElements {
	public static void main(String[] args){
		
		int[] nums = {1,1,1,1,2,2,3,3,3};
		int k = 2;
		
		LinkedList<Integer> temp = findKMostFrequent(nums,k);
		
		for(int l: temp){
			System.out.println(l);
		}
		
	}
	public static LinkedList findKMostFrequent(int[] nums, int k){
		HashMap<Integer,Integer> myMap = new HashMap<Integer,Integer>();
		int maxFrequency = 0;
		for(int i:nums){
			if(myMap.containsKey(i)){
				myMap.put(i, myMap.get(i)+1);
			}else{
				myMap.put(i, 1);
			}
			maxFrequency = Math.max(maxFrequency, myMap.get(i));
		}
		
		LinkedList[] myList = new LinkedList[maxFrequency+1];
		for(int j=0;j<=maxFrequency;j++){
			myList[j] = new LinkedList<Integer>();
		}
		
		for(int i:myMap.keySet()){
			int frequency = myMap.get(i);
			myList[frequency].add(i);
		}
		int count = 0;
		LinkedList<Integer> finalList = new LinkedList<Integer>();
		for(int m=maxFrequency;m>=0;m--){
			LinkedList<Integer> currentList = myList[m];
			
			for(int item:currentList){
				if(count<k){
					finalList.add(item);
					count++;
				}else{
					return finalList;
				}
			}
		}
		return finalList;
	}
}
