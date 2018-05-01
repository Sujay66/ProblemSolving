package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LongestSubstringKCharacters {
    public static void main(String [] args){
        String given = "ababacb ababab";
        String[] arr = given.split(" ");
      /*  for(String s : arr){
            System.out.println(s);
        }*/
      //  given = given.replace(" ","");
      //  System.out.println(given);
        String op = "";
        HashMap<Character,Integer> charCount = new HashMap<>();
        List<String> allStrings = new ArrayList<>();
        int k = 3;
        int index = 0;
        int startIndex = 0;

        for(int i=0;i<given.length();i++){
             if(charCount.containsKey(given.charAt(i))){
                charCount.put(given.charAt(i),charCount.get(given.charAt(i))+1);
            }else{
                charCount.put(given.charAt(i),1);
            }
        }

        for(int i=0;i<given.length();i++) {
            if (charCount.containsKey(given.charAt(i))) {
                if (k <= charCount.get(given.charAt(i))) {
                    index++;
                }else{
                    allStrings.add(given.substring(startIndex,index));
                   index = startIndex = i+1;
                }
            }
        }

       op = allStrings.get(0);

        for(int i=1;i<allStrings.size();i++){
            if(allStrings.get(i).length() > op.length() ){
                op = allStrings.get(i);
            }
        }
        System.out.println(op);
    }
}
