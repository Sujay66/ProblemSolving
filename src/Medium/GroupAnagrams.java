package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args){
        List<List<String>> groups = new ArrayList<List<String>>();
        HashMap<String,List<String>> listHashMap = new HashMap<>();

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        for(int i=0;i<strs.length;i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            System.out.println(arr);
            System.out.println(String.valueOf(arr));
            if(listHashMap.containsKey(String.valueOf(arr))){
                List<String> temp = listHashMap.get(String.valueOf(arr));
                temp.add(strs[i]);
                listHashMap.put(String.valueOf(arr),temp);
            }else{
                listHashMap.put(String.valueOf(arr),new ArrayList<>());
            }
        }
        for(List<String> i:listHashMap.values()){
            groups.add(i);
        }
    }
}
