package Medium;

import java.util.ArrayList;
import java.util.List;

public class ValidParenthisiOfNPairs {
	public static void main(String[] args){
		  ArrayList<String> result = new ArrayList<String>();
		  validPairParenthesis(result, "", 3, 3);
		    System.out.println(result);
	}
    public static void validPairParenthesis(List<String> temp,String s,int left,int right){
        if(left>right)
            return;
        if(left ==0 && right ==0){
            temp.add(s);
            return;
        }
        if(left>0)
            validPairParenthesis(temp,s+'(',left-1,right);
        
        if(right>0)
            validPairParenthesis(temp,s+')',left,right-1);
    }
}
