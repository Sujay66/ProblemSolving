package Easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] temp = {"leet","leetcode","lee"};
        String s = temp[0];
        System.out.print(s.indexOf("meet"));
        for(int i=1; i<temp.length;i++){
            while(temp[i].indexOf(s)!=0){
                s = s.substring(0,s.length()-1);
                if(s.isEmpty()){
                    System.out.println("");
                }
            }
        }
        System.out.println(s);

        System.out.println(Math.random()*6);
    }
}
