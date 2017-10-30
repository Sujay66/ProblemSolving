import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
		public static void main(String[] args){
			
			String s = "leetcode";
			List<String> dict = new ArrayList<String>();
			
			dict.add("leet");
			dict.add("code");
			
			System.out.println(wordBreak(s,dict));
			
		}
	 static boolean wordBreak(String s, List<String> wordDict) {
	        Set<String> myDict = new HashSet<String>(wordDict);
	        boolean[] isWord = new boolean[s.length()+1];
	        isWord[0] = true;
	        for(int i=1;i<=s.length();i++){
	            for(int j=0;j<i;j++){
	                if(isWord[j] && myDict.contains(s.substring(j,i))){
	                    isWord[i] = true;
	                    break;
	                }
	            }
	        }
	        return isWord[s.length()];
	    }
}
