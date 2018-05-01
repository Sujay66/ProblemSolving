package Medium;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args){
        String s = "nitin";
        List<List<String>> result = new ArrayList<List<String>>();
        List<String> eachList = new ArrayList<>();
        partition(s,result,eachList,0);
        for(List<String> x: result){
            for(String t : x ){
                System.out.println(t);
            }
            System.out.println();
        }
    }

    private static void partition(String s, List<List<String>> res, List<String> eachList, int k) {
        if(k == s.length()){
            res.add(new ArrayList<String>(eachList));
            return;
        }
        for(int i=k+1;i<=s.length();i++){
            if(isPalindrome(s.substring(k,i))){
                eachList.add(s.substring(k,i));
                partition(s,res,eachList,i);
                eachList.remove(eachList.size()-1);
            }
        }
    }

    private static boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length()-1;
        while(low < high){
            if(s.charAt(low)!=s.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
}
