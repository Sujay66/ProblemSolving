package Easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SingleNumber {
    public static void main(String[] args){
        int[] nums = {1,1,2,3,3,4,4};
        System.out.println(singleNumber(nums));
    }
        public static int singleNumber(int[] nums) {
            Set<Integer> mySet = new HashSet<Integer>();
            for(int i:nums){
                if(!mySet.add(i)){
                    mySet.remove(i);
                }
            }
            Iterator<Integer> it = mySet.iterator();
            return it.next();
        }
    }
