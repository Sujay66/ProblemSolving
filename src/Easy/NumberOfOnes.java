package Easy;

public class NumberOfOnes {
	public static void main(String[] args){
		  int count = 0;
		  int n = 123456;

		  String s = Integer.toBinaryString(n);
	    for(int i=0;i<s.length();i++){
			if((Character.getNumericValue(s.charAt(i)) & 1) == 1){
				count++;
			}

		}
	    System.out.println(count);
	    
	}
}
