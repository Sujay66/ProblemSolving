
public class NumberOfOnes {
	public static void main(String[] args){
		  int count = 0;
		  int n = 12;
	    while(n!=0){
	    	n = n & (n-1);
	    	count++;
	    }
	    System.out.println(count);
	    
	}
}
