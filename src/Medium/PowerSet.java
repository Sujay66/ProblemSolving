package Medium;

import java.util.*;

public class PowerSet {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        List<List<Integer>> myList = subsets(nums);
        for(List<Integer> temp: myList){
            if(temp.size()==0) {
                System.out.print("Null Set");
            }
            for(Integer i: temp){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
