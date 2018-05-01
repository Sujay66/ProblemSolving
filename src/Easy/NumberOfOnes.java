package Easy;

public class NumberOfOnes {
	public static void main(String[] args){
		  int count = 0;
		  int n = 8;

/*		  String s = Integer.toBinaryString(n);
	    for(int i=0;i<s.length();i++){
			if((Character.getNumericValue(s.charAt(i)) & 1) == 1){
				count++;
			}

		}
	    System.out.println(count);*/
		while(n!=0){
			if((n&1) == 1) count++;
			n = n>>1;
		}

		System.out.println(count);
	    
	}
}
