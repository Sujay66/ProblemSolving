import java.util.HashMap;

public class Anagram {
	public static void main(String[] args){
		System.out.println(isAnagram("anagram","nagaram"));
	}
	
	 public static boolean isAnagram(String s, String t) {
	  //      if(s.length() != t.length()) return false;
	        HashMap<Character,Integer> myMap = new HashMap<Character,Integer>();
	        HashMap<Character,Integer> myMap2 = new HashMap<Character,Integer>();
	        int i =0;
	        for(i=0;i<s.length();i++){
	            if(myMap.containsKey(s.charAt(i))){
	                myMap.put(s.charAt(i),myMap.get(s.charAt(i))+1);
	            }else{
	                myMap.put(s.charAt(i),1);
	            }
	        }
	         for(i=0;i<t.length();i++){
	            if(myMap2.containsKey(t.charAt(i))){
	                myMap2.put(t.charAt(i),myMap2.get(t.charAt(i))+1);
	            }else{
	                myMap2.put(t.charAt(i),1);
	            }
	        }
	        for(int j=0; j<t.length(); j++){
	            if(myMap.containsKey(t.charAt(j))){
	            	System.out.println(myMap.get(t.charAt(j)));
	            	System.out.println(myMap2.get(t.charAt(j)));
	            if(myMap.get(t.charAt(j))!= myMap2.get(t.charAt(j))){
	                return false;
	            }
	            }else{
	                return false;
	            }
	        }
	        return true;
	    }
	 

}
